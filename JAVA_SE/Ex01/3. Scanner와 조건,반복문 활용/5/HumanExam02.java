package human05;

import java.util.Scanner;

public class HumanExam02 {

	public static void main(String[] args) {
		int a;
		
		System.out.print ("몇단을 출력할까요?");
		Scanner sc = new Scanner (System.in);	
		// 사용자 입력 시작 Scanner 객체 생성
		a = sc.nextInt();
		sc.close();	// Scanner 객체 소멸
/*		
		for (int b=1; b<=9; b++) {
			System.out.printf("%d X %d = %d \n", a,b, a*b);
		}
*/		
		int b = 1;
		while (b<=9) {
			System.out.printf("%d X %d = %d \n", a, b, a*b);
			b++;
			
		}
	}

}
