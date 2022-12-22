package human08;

public class VehicleExam {

	public static void main(String[] args) {
		Car car = new Bus();

		// car라는 객체는 버스에서 구체화된 run()만 실행가능
		// checkFare()는 강제타입변환 후 실행가능.
		car.run();
//		car.checkFare();
		
		Bus b1 = (Bus) car;
		b1.run();
		b1.checkFare();
		
		// car는 Bus를 통해서 구현된 객체이므로
		// Taxi 클래스로 강제타입변환 불가함.
		// ClassCastException이 발생함.
		/*
		Taxi t1 = (Taxi) car;
		t1.run();
		t1.checkFare();
		*/
		
		boolean isBus = (car instanceof Bus);
		// true가 나올 것임.
		// 강제타입변환은 꼭 instanceof를 통해서 점검 필요
		if (car instanceof Bus) {
			Bus b2 = (Bus) car;
			b2.run();
			b2.checkFare();
		}
		else {
			System.out.println ("강제타입변환할 수 없습니다.");
		}
	}

}
