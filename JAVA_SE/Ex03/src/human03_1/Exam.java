package human03_1;

public class Exam {

	public static void main(String[] args) {
		SupersoincAirplane sa = new SupersoincAirplane();

		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersoincAirplane.SUPERSONIC;
		// SUPERSONIC 변수는 static이므로 객체가 아닌 클래스 기반으로 접근가능
		sa.fly();
		sa.flyMode = SupersoincAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
