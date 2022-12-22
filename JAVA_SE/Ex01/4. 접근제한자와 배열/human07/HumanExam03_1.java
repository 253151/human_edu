package human07;

public class HumanExam03_1 {

	public static void main(String[] args) {
		// 배열의 생성. 초기값 미지정시 아래와 같이 정리됨.
		
		int [] array = new int[2];		// 정수형 배열변수로 2개의 방을 만들겠다.
		double[] arrDouble = new double[2];	// 실수형 배열 초기값 : 0.0
		boolean[] arrBoolean = new boolean[2];	// 논리형 배열 초기값 : false
		String [] arrStr = new String[5];		// 문자열 배열 초기값 : null
		
		System.out.println ("array[0] = " + array[0]);
		System.out.println ("array[1] = " + array[1]);
		
		System.out.println ("arrDouble[0] = " + arrDouble[0]);
		
		System.out.println ("arrBoolean[0] = " + arrBoolean[0]);


		System.out.println ("arrStr[0] = " + arrStr[0]);
		System.out.println ("arrStr[1] = " + arrStr[1]);
		
		// 배열의 초기화 방법
		
		// 첫번째 방법
		int [] human1 = {10,20,30};
		
		//	두번째 방법
		int [] human2 = new int[2];
		human2[0] = 10;
		human2[1] = 20;
		human2[2] = 30;
		
		//	세번째 방법 ==> 2번째 방법을 응용. (반복문 활용)
		int [] human3 = new int[3];
		for (int a=0; a<human3.length; a++) {
			human3[a] = (a+1) *10;
			
		}
	}

}
