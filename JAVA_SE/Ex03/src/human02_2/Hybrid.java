package human02_2;

public class Hybrid extends Car {
	int elec;
	public Hybrid() {
		super();
		System.out.println("Hybrid() 생성");
	}
	public Hybrid(int elec) {
		super();
		this.elec = elec;
		System.out.printf("Hybrid(%d) \n", elec);
	}
	public Hybrid(int elec, int oil) {
		super(oil);
		this.elec = elec;
		System.out.printf("Hybrid(%d,%d) \n", elec, oil);
		
	}
	public Hybrid(int elec, int oil, int speed) {
		super(oil, speed);
		this.elec = elec;
		System.out.printf("Hybrid(%d, %d, %d) \n", elec, oil, speed);
	}
}
