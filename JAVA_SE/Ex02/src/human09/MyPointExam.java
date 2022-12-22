package human09;

public class MyPointExam {

	public static void main(String[] args) {
//		System.out.println (Math.sqrt(4));		//2.0*2.0 == 4
//		System.out.println (Math.sqrt(9));		//3.0*3.0 == 9

		MyPoint p = new MyPoint(1,1);
		
		// p와 (2,2)의 거리를 구한다.
		
		double distance = p.getDistance(2, 2);
		
		System.out.printf("두점 사이의 거리는 = %f \n", distance);
	}

}
