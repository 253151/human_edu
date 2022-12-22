package human04_1;

public class MemberExam {

	public static void main(String[] args) {
		int[] score = {10,20,30};
		Member origin = new Member("Blue","강현준","12345",47,true,score);
		
		Member cloned = origin.getMember();
		
		cloned.password = "67890";
		cloned.score[0] = 100;
		
		System.out.println (origin.password);
		System.out.println (cloned.password);
		
		System.out.println (origin.score[0]);
		System.out.println (cloned.score[0]);
		
	}

}
