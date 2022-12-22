package human07;

public class Bus extends Car {
	public Bus() {
		System.out.println("Bus 객체 생성");
	}
	@Override
	public int getCharge() {
		int charge = 1450;
		System.out.printf("버스교통요금 %d \n", charge);
		return charge;
	}
	public void busRun() {
		System.out.println("Bus가 달립니다.");
	}
}
