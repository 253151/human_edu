package human05;

public class HumanExam06 {

	public static void main(String[] args) {
		//	for문 사용, 1~100까지의 정수 중에서 3의 배수 총합 구하기
		
//		Case -1 (나머지를 이용함)
		/*
		int total = 0;
		for (int a=0; a<=100; a++) {
			if (a%3 ==0) {
			total = total+a;
			System.out.printf("%d까지의 누적합 ==> %d \n", a, total);
		}
		}
		*/
		
//		Case -2 (3씩 증감)
		int total = 0;
		for (int a=0; a<=100; a+=3) {
			total = total+a;
			System.out.printf("%d까지의 누적합 ==> %d \n", a, total);
	}

}
}

