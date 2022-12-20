package human01;

public class HumanExam02 {

	public static void main(String[] args) {
		int human;		// human이란 변수를 선언.
		human = 100;	// human이란 변수에 100을 대입
		System.out.println(human);
		
		int result = human + 10;	// human(100) + 10 ==>110
		System.out.println (result);
		
		char human1 = 'A'; //char 타입은 홑따옴표라는 것에 주의
		System.out.println (human1);
		char human2 =66;
		System.out.println (human2);
		System.out.println ((int)human1);
		System.out.println ("---------------------------------");
		
		long human3 = 20;
		System.out.println(human3);
		long human4 = 10000000000L; 
		// int형 범주의 수치가 넘어갈 경우 L을 붙여서 long형 변수임을 알려야 함.
		System.out.println(human4);
		System.out.println ("---------------------------------");
		
		double human5 = 3.14159;
		System.out.println (human5);
		float human6 = 3.14159f;
		System.out.println(human6);		//float형을 사용할 때는 끝에 f륿 써야 함
		System.out.println ("---------------------------------");
		
		boolean human7 = 10>11;
		System.out.println (human7);
		System.out.println ("---------------------------------");
		
		byte human11 = 10;
		int human12;
		human12 = human11;	// byte 타입의 숫자를 int 타입의 숫자로 자동변환.
		// 작은크기의 타입을 큰 크기의 타입으로 자동변환
		System.out.println (human12);
		
		byte human13 = 97;
		char human14;
		human14 = (char) human13;		// 에러발생. why: char타입의 변수는 음수 처리불가
		System.out.println (human14);
		System.out.println ("---------------------------------");
		
		int human15 = 129;
		byte human16;
		human16 = (byte) human15;
		System.out.println (human16);
		
		
		
	}

}
