package human15;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car("2022-1011K", "그랜져");
		
		System.out.println (car1.company);
		System.out.println (car1.carId);
		System.out.println (car1.model);
		
//		car1.company = "현대차";
//		car1.carId = "20222-1011H";
		// final은 한번 지정되면 변경 불가한 특성 이씀.
		car1.model = "소나타";
		
		Car car2 = new Car("2022-1012K", "그랜져");
		// car2도 생성자를 통해서 carId 확정되는 순간 변경불가함
//		car2.carId = "2022-1012H0";
	}

}
