package human15;

public class Car {
	public final String company = "현대";
	public final String carId;
	// carId는 null인 상태였다가 한번은 지정 가능 함.
	public String model;
	
	public Car (String carId, String model) {
		this.carId =carId;
		this.model = model;
	}

}
