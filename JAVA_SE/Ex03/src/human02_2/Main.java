package human02_2;

public class Main {

	public static void main(String[] args) {
//		Vechicle v1 = new Vechicle();
//		Vechicle v2 = new Vechicle(100);
		
//		Car car1 = new Car();
//		System.out.printf("speed ==> %d, oil ==> %d \n", car1.speed, car1.oil);
//		System.out.println ("--------------------------");
//		Car car2 = new Car(50);
//		System.out.printf("speed ==> %d, oil ==> %d \n", car2.speed, car2.oil);
//		System.out.println ("--------------------------");
//		Car car3 = new Car(10,30);
//		System.out.printf("speed ==> %d, oil ==> %d \n", car3.speed, car3.oil);
//		System.out.println ("--------------------------");

		Hybrid h1 = new Hybrid();
		System.out.printf("speed ==> %d, oil ==> %d elec ==> %d \n", h1.speed, h1.oil, h1.elec);
		System.out.println ("--------------------------");
		Hybrid h2 = new Hybrid(20);
		System.out.printf("speed ==> %d, oil ==> %d elec ==> %d \n", h2.speed, h2.oil, h2.elec);
		System.out.println ("--------------------------");
		Hybrid h3 = new Hybrid(50,10);
		System.out.printf("speed ==> %d, oil ==> %d elec ==> %d \n", h3.speed, h3.oil, h3.elec);
		System.out.println ("--------------------------");
		Hybrid h4 = new Hybrid(50,10,100);
		System.out.printf("speed ==> %d, oil ==> %d elec ==> %d \n", h4.speed, h4.oil, h4.elec);
		System.out.println ("--------------------------");
	}

}
