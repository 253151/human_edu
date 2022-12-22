package human03_1;

public class SupersoincAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	
	public int flyMode = NORMAL;
	// 아래의 생성자는 생략가능
	public SupersoincAirplane() {
		super();
	}
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
		System.out.println("초음속비행합니다");
		}
		else {
			// 부모가 가지고 있는 비행을 처리하고 싶음
			super.fly();
		}
	}
}
