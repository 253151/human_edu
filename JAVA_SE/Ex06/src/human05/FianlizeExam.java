package human05;

public class FianlizeExam {

	public static void main(String[] args) {
		Counter cnt = null;
		
		for (int i=0; i<=50; i++) {
			cnt = new Counter(i);
			
			cnt = null;
			
			System.gc();
			// gc는 GarbageCollecter를 의미하고,
			// gc() 메서드 호출에 의해서 finalize()가 호출.
		}

	}

}
