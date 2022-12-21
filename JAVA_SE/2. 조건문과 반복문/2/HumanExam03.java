package human04;

public class HumanExam03 {

	public static void main(String[] args) {
		// for문을 활용하여 1~10까지 누적합 구하기.
		
		int total =0;
		int index;		// for문 밖에서 index를 사용하는 부분이 있기 때문에 변수 선언은 for문 밖에서 사용
		
		for (index=0; index<10; index=index+1) {
			// index=1		==> 초기값을 설정.
			// index<=10	==> 반복에 대한 조건.
			// index++		==>	for문 마감시 처리하는 실행문.
			total = total + index;
			
			System.out.printf("%d번째까지의 누적합은 %d입니다. \n", index, total);
		}
		System.out.printf("index = %d \t total = %d \n", index, total);
	}

}
