package EmployeeManagement02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeManagement em = new EmployeeManagement();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("===== 직원 관리 시스템 =====");
			System.out.println("1. 신규 직원 등록");
			System.out.println("2. 전체 직원 정보 조회");
			System.out.println("3. 기존 직원 정보 수정");
			System.out.println("4. 검색");
			System.out.println("5. 종료");
			System.out.println("번호 선택 > ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				em.saveWorker();
				break;
			case 2:
				em.output();
				break;
			case 3:
				em.modify();
				break;
			case 4:
				em.search();
				break;
			case 5:
				System.exit(0);
			}
		}

	}

}
