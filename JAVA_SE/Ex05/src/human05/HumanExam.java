package human05;

public class HumanExam {

	public static void main(String[] args) {
		// NullPointException - NumberFormatException
		
		try {
		Human h01 = new Human ("KANG");
		h01 = null;
		h01.run();  // 예외발샐 포인트 (NullPoint)
		
		String str = "a100";
		int intValue = Integer.parseInt(str);
		// 정수로 변활할 수 없는 예외 발생.
		System.out.printf("intValue : %d \n", intValue);
		
		System.out.println("종료");
		}
		catch (NullPointerException ne) {
			System.out.println ("NullPointerException 발생");
		}
		catch (NumberFormatException fe) {
			System.out.println ("NumberFormatException 발생");
		}
//		catch (RuntimeException re) {
//			System.out.println ("RuntimeException 발샐")
//		}
		finally {
			System.out.println ("finally 출력됨");
		}
		System.out.println ("프로그램 정상 종료");
	}

}
