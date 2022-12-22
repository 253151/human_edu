package human12;

public class Pigeon extends Animal implements Flyable,Physique {

	public Pigeon(int x, int y, int age, int weight) {
		super(x,y,age,weight);
	}

	@Override
	public void printInfo() {
		System.out.printf ("Pigeon -> X(%d), Y(%d), age(%d) \n",
				this.getX(), this.getY(), this.getAge());
		
	}

	@Override
	public void fly() {
		System.out.println ("새는 날 수 있습니다.");
	}

	@Override
	public void flyMove(int x, int y) {
		this.setX(this.getX() + x);
		this.setY(this.getY() + y);
		
	}

	@Override
	public void getFat(int weight) {
		this.setWeight(getWeight() + weight);
		
	}

	
}
