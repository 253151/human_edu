package human16;

public abstract class Notebook extends Computer {

	@Override
	public void display() {
		System.out.println("노트북의 화면이 디스플레이됩니다");	
	}

	@Override
	public abstract void typing();
}
