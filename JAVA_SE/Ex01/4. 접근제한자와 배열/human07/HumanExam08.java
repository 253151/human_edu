package human07;

import java.util.Scanner;

public class HumanExam08 {

	public static void main(String[] args) {
		// 전역변수
//		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수를 입력하세요. >> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				System.out.printf ("학생수는 총 %d명입니다. \n", studentNum);
				
			}else if(selectNo == 2) {
				for (int x=0; x<studentNum; x++) {
				System.out.printf("score [%d] = ", x);
				scores[x] = sc.nextInt();
				}
				
			}else if(selectNo == 3) {
				for (int x=0; x<studentNum; x++) {
					System.out.printf("score [%d] = %d \n", x,scores[x]);
				}
				
			}else if(selectNo == 4) {
				int max = 0;		// 최대값을 구하기 위해서는 작은수부터 탐색이 필요함.
				int min = 100;		// 최솟값을 구하기 위해서는 큰수부터 탐색이 필요함.
				int sum = 0; 
				for (int x=0; x<studentNum; x++) {
					if (max < scores[x]) {
						max = scores[x];
					}
					if (min > scores[x]) {
						min = scores[x];
					}
					sum = sum + scores[x];
					
				}
				System.out.printf("MAX = %d \n", max);
				System.out.printf("MIN = %d \n", min);
				System.out.printf("SUM = %d \n", sum);
				System.out.printf("ABG = %f \n", (double)sum/studentNum);
				
			}else if(selectNo == 5) {
//				run = false;	// 또는 break;
				break;
			}
		}
		System.out.println ("프로그램을 종료합니다.");
		sc.close();
	}

}

