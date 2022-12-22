package Test01;

public class CarExam {

	public static void main(String[] args) {
		
		Car c1 = new Car (50, 200, "현대", "소나타");
		Car c2 = new Car (70, 220, "기아", "카니발");
		
		System.out.println("=============================");
		c1.CarInfo();
		System.out.println("=============================");
		c1.speedUp();
		c1.run();
		c1.stop();
		c1.speedUp();
		c1.turbo();
		c1.turbo();
		c1.run();
		c1.stop();
		c1.turnOff();
		
		System.out.println();
		System.out.println();
		
		System.out.println("=============================");
		c2.CarInfo();
		System.out.println("=============================");
		c2.speedUp();
		c2.run();
		c2.stop();
		c2.speedUp();
		c2.turbo();
		c2.run();
		c2.turbo();
		c2.turbo();
		c2.run();
		c2.turbo();
		c2.run();
		
	}

}
