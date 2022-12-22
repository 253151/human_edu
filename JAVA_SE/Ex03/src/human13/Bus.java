package human13;

public class Bus extends Car {

	public Bus(int speed) {
		super(speed);
	
	}

	@Override
	public void speedUp() {
		currentSpeed++; // 속도 1씩 증가
		
	}

	@Override
	public int getcharge() {
		System.out.println ("버스요금 : 1450");
		return 1450;
	}
	

}
