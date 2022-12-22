package human12;

public abstract class Animal extends Creature{

	public Animal(int x, int y, int age, int weight) {
		super(x, y, age, weight);
	}

	@Override
	public void attack() {
		System.out.println("동물은 몸을 이용하여 공격함.");
	}

}
