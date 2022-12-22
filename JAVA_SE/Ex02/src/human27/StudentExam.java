package human27;

public class StudentExam {

	public static void main(String[] args) {
// String studentId,String studentName,String studentMajor, String[] courseName
		String[] courseName1 = {"경제", "물류", "수학", "컴퓨터", "영어"};

		Student s1 = new Student("K01","강현준","산업공",courseName1);

		s1.setCourseScore ("경제", 80);
		s1.setCourseScore ("물류", 81);
		s1.setCourseScore ("수학", 82);
		s1.setCourseScore ("컴퓨터", 82);
		s1.setCourseScore ("영어", 84);
		s1.showInfo();
		System.out.println("---------------------------------------");
		String[] courseName2 = {"컴퓨터", "수학", "영어", "네트웍", "그래픽"};

		Student s2 = new Student("K02","김석훈","컴퓨터공",courseName2);

		s2.setCourseScore ("그래픽", 90);
		s2.setCourseScore ("네트웍", 91);
		s2.setCourseScore ("영어", 92);
		s2.setCourseScore ("수학", 92);
		s2.setCourseScore ("컴퓨터", 94);
		s2.showInfo();
		
	}

}
