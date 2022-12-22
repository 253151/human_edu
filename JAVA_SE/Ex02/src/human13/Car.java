package human13;

public class Car {
	public static int  maxSpeed;
	public int currentSpeed;
	
	public void speedUp() {
		this.currentSpeed ++;
		this.maxSpeed ++;
		// 정적 필드 maxSpeed는 클래스명으로 접근하는 것을 권장하나
		// 객체차원(this=car1)으로 접근 가능하다.
		
		System.out.printf("currentSpeed : %d \n", this.currentSpeed);
		System.out.printf("maxSpeed : %d \n", this.maxSpeed);
		System.out.printf("maxSpeed : %d \n", Car.maxSpeed);

	}
	static {
		maxSpeed = 300;
		// static으로 정의된 블럭은 우선 실행되면서 초기 static변수를 초기화함
//		this.currentSpeed = 100;
		// 사용불가.
		// 객체로 접근할 일반 변수는 static에서 사용 불가.
//		this.speedUp
		//객체로 접근한 일반 변수는 static에서 사용 불가.
	}
	public static void driving() {
//		this.speedUp();
		// 사용불가. 이유는 아직 객체가 생성되지 않았기 때문에.
		Car car1 = new Car();
		// static 메서드 내에서 일반 메서드를 호출하려면.
		// 객체를 형성하고, 객체기반에서 호출 가능함.
		
		car1.speedUp();
		
	}
}
