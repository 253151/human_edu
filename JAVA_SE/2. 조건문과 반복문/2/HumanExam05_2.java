package human04;

public class HumanExam05_2 {

	public static void main(String[] args) {
		// 홀수만 더하는 프로그램.
		// X % 2 == 1; 2로 나누었을 때 나머지가 1인 수 ==> 홀수
		
		int index = 0;
		int total = 0;
		while (index <= 10) {
			index = index + 1;
			if (index % 2 == 1) { // 홀수
			}
			index = index + 1;
			total = total + index;
			System.out.printf("%d번째까지의 누적합산 %d입니다. \n", index, total);
		}
		
		System.out.printf("total = %d \n", total);
	}

}
