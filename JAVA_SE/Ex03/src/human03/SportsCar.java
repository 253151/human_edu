package human03;

public class SportsCar extends Car{

	public SportsCar (int currentSpeed) {
		super(currentSpeed);
	}
	public void speedUp() {
		//메서드 오버라이딩
		//부모가 가지고 잇는 기능을 새로이 정의해서 쓰고 싶름
		this.currentSpeed = this.currentSpeed + 10;
	}
}
