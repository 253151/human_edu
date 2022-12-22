package Test01;

public class Car {
	int currentSpeed;
	int maxSpeed;
	String company;
	String model;
	
	public Car (int currentSpeed, int maxSpeed, String company, String model) {
		this.currentSpeed = currentSpeed;
		this.maxSpeed = maxSpeed;
		this.company = company;
		this.model = model;
	}
	
	public void CarInfo () {
		System.out.printf
		("Car의 정보를 출력합니다. \n -현재속도:%d \n -최고속도:%d \n -제조사:%s \n -모델:%s \n",
				currentSpeed, maxSpeed, company, model);
	}
	
	public void run() {
		System.out.printf("차가 달립니다. 현재속도는 %d입니다. \n", currentSpeed);
	}
	
	public void stop() {
		this.currentSpeed = 0;
		System.out.printf("차가 멈춥니다. 현재속도는 %d입니다.\n", currentSpeed);	
	}
	
	public void speedUp() {
		this.currentSpeed = this.currentSpeed+1;
	}
	
	public void turbo() {
		this.currentSpeed = this.currentSpeed+50;
	}
	public void turnOff() {
		System.out.println("- 차량운행을 종료합니다. -");
	}
	
}