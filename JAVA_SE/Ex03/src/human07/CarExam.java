package human07;

public class CarExam {

	public static void main(String[] args) {
		int money = 0;
		Car car1 = new Bus();	// 자동타입변환
		money = car1.getCharge();	// money = 1450
		
		Car car2 = new Taxi();
		money = car2.getCharge();	// money = 8000
		

		System.out.println (car1 instanceof Bus);	// true
		System.out.println (car2 instanceof Bus);	// false
		
		if(car1 instanceof Bus) {
		Bus bus1 = (Bus) car1;
		bus1.busRun();
//		System.out.printf("요금 %d \n", bus1.money);
		}
		else {
			System.out.println ("변환할 수 없습니다");
		}
		
		if(car2 instanceof Taxi) {
		Taxi taxi1 = (Taxi) car2;
		taxi1.taxiRun();
		}
		else {
			System.out.println ("변환할 수 없습니다");
		}
		
		if(car2 instanceof Bus) {
			Bus bus2 = (Bus) car2;
			bus2.busRun();
			}
			else {
				System.out.println ("변환할 수 없습니다");
			}
//		Bus bus2 = (Bus) car2;
//		bus2.busRun();
	}

}
