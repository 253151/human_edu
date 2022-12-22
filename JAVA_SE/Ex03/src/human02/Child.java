package human02;

public class Child extends Parent {
	public Child() {
		super();
		System.out.println("Child() 생성자 호출");
	}
	public Child(int i) {
		super(i);
		System.out.println("Child(i) 생성자 호출");
	}

}
