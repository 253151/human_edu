package human06;

public class HumanExam {

	public static void main(String[] args) {
		// NullPointException - NumberFormatException
		
		try {

		String str = "a100";
		int intValue = Integer.parseInt(str);
		// 정수로 변환할 수 없는 예외 발생.
		System.out.printf("intValue : %d \n", intValue);
		
		Human h01 = new Human ("KANG");
		h01 = null;
		h01.run();  // 예외발샐 포인트 (NullPoint)
		
		System.out.println("로직 정상 종료");
		}
		catch (NullPointerException | NumberFormatException e) {
			System.out.println ("Exception 발생");
			System.out.println (e.getMessage());
			e.printStackTrace();
			
		}

		finally {
			System.out.println ("finally 출력됨");
		}
		System.out.println ("프로그램 정상 종료");
	}

}
