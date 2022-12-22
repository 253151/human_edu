package human12;

public abstract class Creature {

	
	private int x;
	private int y;
	private int age;
	private int weight;
	
	public Creature(int x, int y, int age, int weight) {
		this.x = x;
		this.y = y;
		this.age = age;
		this.weight = weight;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		// int y = this.getY() - y;
		this.y = y;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void age() {
		// 나이를 1살 먹다.
		this.age++;	
	}
	public void move(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}
	public void eat() {
		System.out.println ("모든 생물은 영양분을 섭취합니다");
	}
	public void weight(int weight) {
		this.weight = this.weight + weight;
	}
	public abstract void attack();
	public abstract void printInfo();
}
