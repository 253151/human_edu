package human12;

public abstract class Human extends Creature implements Talkable, Physique {
	
	public Human (int x, int y, int age, int weight) {
		super(x,y,age,weight);
	}

	@Override
	public void attack() {
		System.out.println("도구를 사용하여 공격합니다.");
	}
	@Override
	public void talk() {
		System.out.println("사람은 말을 할 수 있습ㄴ다.");
	}

}
