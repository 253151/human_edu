package human12;

public class CarExam2 {

	public static void main(String[] args) {
//		Car car1 = new Car();
//		car1.company;
		
		String str1 = Car.company;
		// static은 객체차원이 아닌 클래스 차원이므로 
		// 객체를 주체로 하여 접근하지 않고 클래스를 주체로 접근한다.
		String str2 = Car.model;
		String str3 = Car.info;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
