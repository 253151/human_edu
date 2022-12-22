package human01;

public class Car {
	public String company;		// 제조사.
	public String model;		// 차의 모델
	public int maxSpeed;		// 차의 최고속도
	public int currentSpeed;	// 차의 현재속도
	public String color;
	
	public Car() {
		
	}
	
	public void speedUp () {
		currentSpeed = currentSpeed +5;
	}
	public void speedDown() {
		currentSpeed = 0;
	}
}
