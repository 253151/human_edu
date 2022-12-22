package human03;

public class HumanExam03 {

	public static void main(String[] args) {
		int score = 69;
		System.out.printf("score = %d \n", score);
		char grade = 'Z';
		
		if(score >= 90 && score <=100) {
			grade = 'A';
		}
		if(score >= 80 && score <90) {
			grade = 'B';
		}
		if(score >= 70 && score <80) {
			grade = 'C';
		}
		if(score <70) {
			grade = 'F';
		}
		
		System.out.printf("grade = %c \n", grade);
		
	}

}
