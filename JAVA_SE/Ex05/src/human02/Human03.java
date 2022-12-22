package human02;

public class Human03 {

	public static void main(String[] args) {
		// NumberrFormatException
		
		String strValue01 = "1000";
		int intValue01 = Integer.parseInt(strValue01);
		// Integer클래스의 static메서드인 parseInt는 숫자로 변환함.
		int intPlus01 = intValue01 + 10;
		System.out.printf ("intPlus : %d \n", intPlus01);
		

			
		String strValue02 = "a1000";
		int intValue02 = Integer.parseInt(strValue02);
		// strValue02는 숫자로 변환할 수 없는 형태이므로 Exception 발생.
		int intPlus02 = intValue02 + 10;
		System.out.printf ("intPlus : %d \n", intPlus02);
			
		}
	

}
