package human13;

public class CarExam {
	
	public static void main(String[] args) {
		Bus bus1 = new Bus(100);
		bus1.speedUp();
		System.out.printf("Bus의속도 : %d \n", bus1.currentSpeed);
		int busSpeed = bus1.getcharge();
		
		System.out.printf("Return Bus Money : %d \n", busSpeed);
		System.out.println("-------------");
		
		Taxi tax1 = new Taxi (120);
		tax1.speedUp();
		System.out.printf("택시의 속도 : %d \n", tax1.getcharge());
		int taxMoney = tax1.getcharge();
		System.out.printf("Return Taxi Money : %d \n", taxMoney);
	}
}
