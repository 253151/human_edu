package human02_2;

public class Vechicle {
	public int speed;
	public Vechicle() {
		this.speed = 0;
		System.out.println ("Vechicle 생성");
	}
	public Vechicle(int speed) {
		this.speed=speed;
		System.out.printf ("Vechicle(%d) 생성 \n", speed);
	}
}
