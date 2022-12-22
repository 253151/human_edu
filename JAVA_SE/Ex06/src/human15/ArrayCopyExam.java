package human15;

import java.util.Arrays;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// 배열을 카피하는 방법은 아래의 것 중 어떤 것을 사용해도 무방함.
		
		char[] arr1 = {'J','A','V','A'};
		// arr1[0] = 'J'
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		// arr1의 배열을 전체길이만큼 copy
		
		System.out.println (Arrays.toString(arr2));
		
		char[] arr3 = Arrays.copyOfRange(arr2, 1, 3);
		System.out.println (Arrays.toString(arr3));
		
		char[] arr4 = new char[arr1.length];	// arr4의 배열크기를 지정
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		// arr1배열을 0에서부터 카피하는데, arr4에 넣을 때는 0의 위치부터 arr1.length=4의 위치까지 차례로 넣음
		System.out.println (Arrays.toString(arr4));
		
		for (int i=0; i<arr4.length; i++) {
			System.out.printf("arr4[%d] : %c", arr4[i]);
		}
		arr4[2] = 'Z';
		System.out.println (Arrays.toString(arr4));
	}

}
