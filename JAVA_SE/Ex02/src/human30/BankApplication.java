package human30;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	// accountArray 100개의 공간이 있는 배열변수.
	// 100명의 계좌를 담을 수 있는 공간을 만들었다.
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println ("-----------------------------------");
			System.out.println ("1.계좌생성 / 2.계좌목록 / 3.예금 / 4.출금 / 5.종료");
			System.out.println ("-----------------------------------");
			System.out.print(">선택?");
			
			int selectNo = sc.nextInt();
			if (selectNo == 1) {
				createAccount();
			}
			else if (selectNo == 2) {
				accountList();
			}
			else if (selectNo == 3) {
				deposit();
			}
			else if (selectNo == 4) {
				withdraw();
			}
			else if (selectNo == 5) {
				run = false;
			}
		}
		
	}

	private static void createAccount() {
		System.out.print("계좌번호? ");
		String ano = sc.next();
		System.out.print("이름? ");
		String owner = sc.next();
		System.out.print("잔고? ");
		int balance = sc.nextInt();
		
		int i = 0;
		
		Account ac = new Account (ano, owner, balance);
		//ac.getAno()
		// 입력된 정보를 기반으로 Account 객체 생성
		for (i=0; i<accountArray.length; i++) {
			// accountArray.length = 100
			// accountArray변수에 앞에서 탐색하면서 비어있는 곳에 Account 클래스의 객체를 대입함.
			// 대입한 순간 break문으로 반복문 빠져나옴.
			// 빠져나올때의 i값이 신규 생성된 계좌가 담긴 위치임.
			if (accountArray[i] == null) {
				accountArray[i] = ac;
				break;
			}
		}
		System.out.printf ("%d번째 위치에 계좌가 생성되었습니다. \n", i);
	}

	private static void accountList() {
//		System.out.print ("당신의 계좌번호를 입력해주세요 : ");
//		String ano = sc.next();
//		Account ac = findAccounts(ano);
		System.out.println ("계좌목록 : ");
		// 반복문을 통해서 계좌목록을 가져옴.
		// accountArray변수는 Account객체들을 담아놓은 배열변수이므로.
		// i번째 계좌번호를 가져오려면.. accountArray[i].getAno()로 처리가능.
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}

//			}
//		for (
//			if () {
//			else {
//				System.out.println ("계좌번호가 올바르지 않습니다");
//				}
//			}
//		}
			System.out.printf ("계좌번호:%s \t 이름:%s \t 잔고:%d \n", 
					accountArray[i].getAno(), accountArray[i].getOwner(), accountArray[i].getBalance());
		}
	}

	private static void deposit() {
		System.out.print ("당신의 계좌번호를 입력해주세요 : ");
		String ano = sc.next();
		Account ac = findAccounts(ano);
		// 사용자가 입력한 ano 값을 기반으로 accountArray배열변수에서 위치를 찾음.
		System.out.print ("입금액을 입력해주세요 : ");
		int deposit = sc.nextInt();
		
		int currentBalance = ac.getBalance();
		int nextBalance = currentBalance + deposit;
		ac.setBalance(nextBalance);
		System.out.printf ("예금이 성공하였으며 현재잔고는 %d입니다. \n", nextBalance ); // or ac.getBalance()도 가능
	}

	private static void withdraw() {
		System.out.print ("당신의 계좌번호를 입력해주세요 : ");
		String ano = sc.next();
		Account ac = findAccounts(ano);
		System.out.print ("출금액을 입력해주세요 : ");
		int withdraw = sc.nextInt();
		
		int currentBalance = ac.getBalance();
		int nextBalance = currentBalance - withdraw;
		ac.setBalance(nextBalance);
		System.out.printf ("출금이 성공하였으며 현재잔고는 %d입니다. \n", nextBalance ); // or ac.getBalance()도 가능
		
	}
	private static Account findAccounts(String ano) {
		int i=0;
		for (i=0; i<accountArray.length; i++) {
			if (ano.equals(accountArray[i].getAno())) {
				// 사용자가 입력한 ano와 배열변수에 담긴 객체의 ano를 비교해서 같으면 break;
				// break 시점의 i위치에 담긴 accountArray를 리턴
				break;
			}
		}
		return accountArray[i];
	}

}
