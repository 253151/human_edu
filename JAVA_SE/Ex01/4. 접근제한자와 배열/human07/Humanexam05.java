package human07;

public class Humanexam05 {

	public static void main(String[] args) {
		// 연습문제 5장 7 최솟값 구하기
		
		
		int[] arr = { 1,5,3,8,2 };
		int min = 9999;
		
		for (int a = 0; a<arr.length; a++) {
			if (min > arr[a]) {
				min = arr[a];
			}
		}
		System.out.printf("MIN = %d \n", min);
	}

}
