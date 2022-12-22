package human03;

public class BoxExam {

	public static void main(String[] args) {
		Box<String> b1 = new Box<String>();
		// b1은 멤버변수로 String만을 넣을 수 잇음.
		b1.setT("human1");
//		b1.setT(20);
		
		String str1 = b1.getT();
		// b1 객체는 String으로 제한을 하였기 때문에
		// 강제타입변환을 할 필요가 없다
		System.out.println("str1 = " + str1);
		
		Box<Integer> b2 = new Box<Integer>();
		b2.setT(20);
		int intValue = b2.getT();
		
		System.out.println("intValue = " + intValue);
		
		

		
	}

}
