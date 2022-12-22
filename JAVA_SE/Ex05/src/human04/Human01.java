package human04;

public class Human01 {

	public static void main(String[] args) {
		// try / catch / finally 구문 실습

		try {
			Human h01 = new Human("KANG");
			h01=null;
			h01.run();	
			
			Human h02 = new Human("KIM");
			h02.run();
		}
//		catch(NullPointerException ne) {	
		// 모든 예외를 처리할 경우는 Exception으로 표현
		catch(Exception ne) {
			
			System.out.println ("예외가 발생했습니다.");
			System.out.println("ne : " + ne);
			System.out.println(ne.getStackTrace());
			System.out.println(ne.getMessage());
		}
		finally {
			System.out.println ("Final을 실행합니다");
		}
		System.out.println("시스템을 종료합니다.");
		
		
	}

}

// catch는 try안에서 예외가 발생했을 때 처리하는 로직을 담아줄 수 있음
// 최상위인 Exception을 catch문으로 처리하면 어떠한 예외도 처리될 수 있으나
// 예외별로 다르게 로직을 적용하고 싶을때는 개별적인 예외의 종류를 선정해서
// catch문에 담아야 한다.

