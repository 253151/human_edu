package human12;

public class Student extends Human implements Programable, Swimable,Physique{

	public Student(int x, int y, int age, int weight) {
		super(x,y,age,weight);
	}

	@Override
	public void printInfo() {
		System.out.printf ("Student -> X(%d). Y(%d). age(%d), weight(%d) \n",
				this.getX(), this.getY(), this.getAge(),this.getWeight());
	}

	@Override
	public void swimDown(int y) {
		this.setY(this.getY() - y);
		// 현재 나의 Y 위치에서 y만큼 밑으로 내려감
		if (this.getY() < -50) {
			System.out.println("위험하니 조심하세여.");
		}
	}

	@Override
	public void coding() {
		System.out.println("학새은 코딩할 수 있습니다.");
	}

	@Override
	public void getFat(int weight) {
		this.setWeight(getWeight() + weight);
		
	}

}
