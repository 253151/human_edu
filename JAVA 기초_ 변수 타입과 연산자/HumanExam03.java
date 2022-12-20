package human01;

public class HumanExam03 {

	public static void main(String[] args) {
		String human1 = "human"+" "+"Computer"; // 문자열 연산자 실습
		// String은 문자열을 담는 클래스.
		System.out.println (human1);
		
		int human2 = 2*6;
		System.out.println(human2);
		
//		int human3 = 9/2;	//9나누기2
		double human3 = 9/2.;	//9나누기2. "정수/정수 ==> 정수" 이므로 둘중 하나는 실수 필요
		System.out.println(human3);
		
		int human4 = 7%3;	//몫(2), 나머지는(2); %는 나머지를 의미함.
		System.out.println(human4);
		
		int human5 = 1;
		human5 += 3;		//human5=human5+2
		System.out.println (human5);
		
		int human6 = 1;
		human6++;			// human6=human6+1;
		System.out.println(human6);
		++human6;
		System.out.println(human6);
		

	}

}
