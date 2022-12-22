package human07_2;

public class Test {
	// 멤버변수 없음
	// 생성자는 생략. Test() 이러한 생성자가 생략.

	public void test(String strA, String strB) 
			throws NumberFormatException {
		
			int strIntA = Integer.parseInt(strA);
			int strIntB = Integer.parseInt(strB);
		
			int intValue = strIntA + strIntB;
		
			System.out.printf("intValue : %d \n", intValue);

		}
	}
