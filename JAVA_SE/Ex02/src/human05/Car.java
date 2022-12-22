package human05;

public class Car {
	public int speed = 0;
	public String color = null;
	
	// Car() 생성자는 오버로딩된 생성자가 있을 경우 생략 불가함.
	public Car() {
//		this.speed = 100;
//		this.color = "GREEN";
		// 위의 내용은 아래와 같음
		this(100, "GREEN");  
	}
	
	public Car(int speed) {
//		this.speed = speed;
//		this.color = "BLUE";
		// 위의 내용은 아래와 같음
		this(speed, "BLUE");
	}
	
	public Car (int speed, String color) {
		this.speed = speed;
		this.color = color;
	}

}
