package human06;

public class Car {
	public String company;		// public  ==> private
	public String model;
	public int maxSpeed;
	public int currentSpeed;
	
	public Car(String company, String model, 
			int maxSpeed, int currentSpeed) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
	}
	
	public void speedUp() {
		// 속도가 1 증가하는 기능.
		this.currentSpeed = this.currentSpeed + 1;
		// car1이 들어와 있는 상황에서는 this ==> car1을 의미함.
	}
	public int speedDown() {
		// 속도가 1 감소하는 기능.
		this.currentSpeed--;		
		// this.currentSpeed = this.currentSpeed - 1
		return this.currentSpeed;
	}
	public int getCurrentSpeed() {
		
		return this.currentSpeed;
	}
	
}
