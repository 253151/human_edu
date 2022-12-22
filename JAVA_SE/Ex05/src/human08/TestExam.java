package human08;

public class TestExam {
	
	public static void main(String[] args) {
		int value = 120;
		
		Test t = new Test();
		try {
			t.test(value);
		}
		catch (Exception e) {
			System.out.println (e.getMessage());
		}
		
		System.out.println("시스템 종료");
	}

}
