package human08;


public class HashCodeExam {

	public static void main(String[] args) {
		Student s1 = new Student(101,"강현준");
		Student s2 = new Student(102,"강현준");

		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		// hashCode는 객페를 유일하게 비교해주는 코드임
		// Object 클래스에 그 기능이 있다
		
		System.out.println(s1.hashCode()==s2.hashCode());
	}

}
