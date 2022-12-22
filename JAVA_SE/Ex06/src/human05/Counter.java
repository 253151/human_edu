package human05;

public class Counter {
	public int no;
	
	public Counter (int no) {
		this.no = no;
	}
	@Override
	public void finalize() throws Throwable{
		System.out.println(this.no+"번째 finalize가 실행됨");
	}

}
