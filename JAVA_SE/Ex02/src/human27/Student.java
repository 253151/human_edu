package human27;

public class Student {
	String studentId;
	String studentName;
	String studentMajor;
	
	// 수강과목과 점수를 배열로 선언했었음.
	// 새로운 클래스를 통해서 만들 예정.
	Subject[] sub = new Subject[5];
	// 5개의 과목방을 만들어서 과목과 점수를 관리할 수 있게끔 처리.
	
	public Student(String studentId, String studentName,
			String studentMajor, String[] courseName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMajor = studentMajor;
		for (int a=0; a<5; a++) {
			sub[a] = new Subject(courseName[a]);
		}
	}
	public void setCourseScore(String courseName, int courseScore) {
		for (int a=0;a<5;a++) {
			if(courseName.equals(sub[a].subjectName)) {
				sub[a].subjectScore = courseScore;
				break;
			}
		}
	}
		public void showInfo() {
			System.out.printf("%s 님의 점수 \n", this.studentName);
			for (int a=0; a<5; a++) {
				System.out.printf("%s : %d \n", sub[a].subjectName, sub[a].subjectScore);
				
			}
		}
}
