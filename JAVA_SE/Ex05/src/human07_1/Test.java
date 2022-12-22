package human07_1;

public class Test {
	// 멤버변수 없음
	// 생성자는 생략. Test() 이러한 생성자가 생략.

	public void test(String strA, String strB) {
		
		try {
			int strIntA = Integer.parseInt(strA);
			int strIntB = Integer.parseInt(strB);
			// a100을 숫자로 변환할 수 없음
			// 예외발생
		
			int intValue = strIntA + strIntB;
		
			System.out.printf("intValue : %d \n", intValue);
		}
		
		catch (NumberFormatException ne) {
			ne.getMessage();
		}
	}
}
