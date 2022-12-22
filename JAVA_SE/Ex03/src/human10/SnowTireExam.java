package human10;

public class SnowTireExam {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}

}
