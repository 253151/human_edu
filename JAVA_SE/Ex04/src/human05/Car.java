package human05;

public class Car {
	// 1. 멤버변수
	public Tire frontLeftTire;
	public Tire frontRightTire;
	public Tire rearLeftTire;
	public Tire rearRightTire;
	// 2. 생성자
	public Car(Tire frontLeftTire,Tire frontRightTire, 
			Tire rearLeftTire,Tire rearRightTire) {
		this.frontLeftTire = frontLeftTire;
		this.frontRightTire = frontRightTire;
		this.rearLeftTire = rearLeftTire;
		this.rearRightTire = rearRightTire;
	}
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
