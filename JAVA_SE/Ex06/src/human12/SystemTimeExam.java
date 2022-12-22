package human12;

public class SystemTimeExam {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		System.out.println(time1);
		
		int sum=0;
		for (int i=0; i<10000000; i++) {
			sum = sum+i;
		}
		long time2 = System.nanoTime();
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time2 - time1);
		
		
		long time3 = System.currentTimeMillis();
		sum=0;
		for (int i=0; i<10000000; i++) {
			sum = sum+i;
		}
		long time4 = System.nanoTime();
		
		System.out.println(time3);
		System.out.println(time4);
		System.out.println(time4 - time3);

	}

}
