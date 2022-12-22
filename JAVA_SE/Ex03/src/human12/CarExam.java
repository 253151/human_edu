package human12;

public class CarExam {
	
	public static void main(String[] args) {
//	Car car = new Car(100);
	// 추상클래스는 객체 생성 불가.
	// 부모클래스로만 존재함
	SportsCar sCar = new SportsCar(100);
	sCar.drive();
	sCar.showInfo();
	sCar.stop();
	}
}
