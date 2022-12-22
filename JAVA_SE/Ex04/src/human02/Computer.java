package human02;

public class Computer implements Internet, Calc {

	@Override
	public int sum(int a, int b) {
		int z;
		z = a + b;
		return z;
	}

	@Override
	public void search() {
		System.out.println("인터넷을 검색합니다.");
		
	}

}
