package Sample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CompanyCARELAB company = new CompanyCARELAB();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("====== 사원 관리 프로그램 ======");
            System.out.println("1. 등록");
            System.out.println("2. 출력");
            System.out.println("3. 수정");
            System.out.println("4. 검색");
            System.out.println("5. 종료");
            System.out.print(">>>");
            int select = sc.nextInt();
            switch (select) {
            case 1:
                company.saveWorker();
                break;
            case 2:
                company.output();
                break;
            case 3:
                company.modify();
                break;
            case 4:
                company.search();
                break;
                
            case 5:
                System.exit(0);
            default:
                System.out.println("잘못된 입력");
                break;
            }
        }
    }
}
