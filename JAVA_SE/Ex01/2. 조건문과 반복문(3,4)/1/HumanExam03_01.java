package human03;

public class HumanExam03_01 {

	public static void main(String[] args) {
		
		int score = 95;
		System.out.printf("score = %d \n", score);
		char grade = 'Z';
		
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}
		if(score >= 80 && score < 90) {
			grade = 'b';
		}
		if(score >= 70 && score < 80) {
			grade = 'c';
		}
		if(score < 70) {
			grade = 'c';
		}
		
		System.out.printf("grade = %c \n", grade);
		
	}

}
