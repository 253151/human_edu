package human12;

public   class SportsCar extends Car{
	public SportsCar(int speed) {
		super(speed);
	}

	public void speedUp() {
		this.currentSpeed = this.currentSpeed+1;
	}
	
	public void showInfo() {
		System.out.printf ("SportsCar의 현재속도 : %d \n", this.currentSpeed);
	}
	
}
