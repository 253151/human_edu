package human05;

import java.util.Scanner;

public class HumanExam10 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		try (Scanner scanner = new Scanner (System.in)) {
			while (run) {
				System.out.println("---------------------------------");
				System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
				System.out.println("---------------------------------");
				System.out.print("선택> ");
				int choice = scanner.nextInt();
				switch(choice) {
				case 1: 
					System.out.print("예금액 > ");
					int x = scanner.nextInt();
					balance = balance + x;
					System.out.printf ("예금액 > %d , 현재 잔액 > %d \n", x, balance);
					break;
					
				case 2:
					System.out.print("출금액 > ");
					int y = scanner.nextInt();
					balance = balance - y;
					System.out.printf ("출금액 > %d , 현재 잔액 > %d \n", y, balance);
					break;
					
				case 3:
					System.out.printf("잔고 > %d \n", balance);
					break;
					
				case 4:
					run=false;
					System.out.println ("프로그램을 종료합니다.");
					break;	
			}	
}
			scanner.close();
			
		}
	
	}


}
