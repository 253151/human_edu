package human02_2;

public class Car extends Vechicle{
	public int oil;
	public Car() {
		super();	//인자가 없을 때는 생략 가능
		this.oil = 0;
		System.out.println ("Car 생성");
	}
	public Car(int oil) {
		super();
		this.oil = oil;
		System.out.printf("Car(%d) \n", oil);
	}
	public Car(int oil, int speed) {
		super(speed);
		this.oil = oil;
		System.out.printf("Car(%d,%d) 생성 \n", oil, speed);
	}
}
