package human04;

public class Car {
	// 1. 멤버변수
	Tire frontLeftTire = new KTire();
	Tire frontRightTire = new KTire();
	Tire rearLeftTire = new KTire();
	Tire rearRightTire = new KTire();
	// 2. 생성자
	public Car() {}
	// 3. 메서드	
	public void run() {
		System.out.print("front-left : ");
		frontLeftTire.roll();
		
		System.out.print("front-right : ");
		frontRightTire.roll();
		
		System.out.print("rear-left : ");
		rearLeftTire.roll();
		
		System.out.print("rear-right : ");
		rearRightTire.roll();
		
	}
}
