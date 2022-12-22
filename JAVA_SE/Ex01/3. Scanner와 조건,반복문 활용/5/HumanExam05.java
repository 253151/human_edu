package human05;

public class HumanExam05 {

	public static void main(String[] args) {
		// 홀수 단만 출력할 수 있도록
	
		
		int a,b;
		

		for (a=1; a<=9; a++) {	
			if (a%2==1) { 		// a를 2로 나누어 나머지가 1인 수.


				System.out.printf("%d단입니다.\n", a);

				for (b=1; b<=9; b=b+2) {
//					if (b%2==1) {
				
					System.out.printf("%d X %d = %d \n", a,b, a*b);

					}
				System.out.println ("-----------------------");
			}

		}


	}

}


