package Test04;

public class pointExam {

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint(0, 0);
		
		p.move(10,10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(-5,5);		//객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString()+"입니다.");

		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()+"입니다.");
	}

}
