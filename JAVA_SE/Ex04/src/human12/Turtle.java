package human12;

public class Turtle extends Animal implements Swimable,Physique {

	public Turtle(int x, int y, int age, int weight) {
		super(x,y,age,weight);
	}
	
	@Override
	public void printInfo() {
		System.out.printf ("Turtle -> X(%d), Y(%d), age(%d) \n",
				this.getX(), this.getY(), this.getAge());
		
	}

	@Override
	public void swimDown(int y) {
		this.setY(this.getY() - y);
		
	}

	@Override
	public void getFat(int weight) {
		this.setWeight(getWeight() + weight);
		
	}


}
