package human06;

public class Taxi extends Car {
	public Taxi() {
		super();
		System.out.println("Taxi 객체 생성");
	}
	public int getCharge() {
		int charge = 6000;	// 평균적인 대중교통 요금 1600원
		System.out.printf("택시 요금 : %d \n", charge);
		return charge;
	}

}
