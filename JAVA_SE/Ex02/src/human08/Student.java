package human08;

public class Student {
		public String name;
		public int ban;
		public int no;
		public int kor;
		public int eng;
		public int math;
		
		public Student (String name,int ban, int no, int kor, int eng, int math) {
			
			this.name = name;
			this.ban = ban;
			this.no = no;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
	}
		
		public int getTotal() {
			int total;
			total = this.kor+this.eng+this.math;
			return total;
		}
		
		public double getAVG() {
			double average;
			average = this.getTotal() / 3.;
			return average;
		}

}
