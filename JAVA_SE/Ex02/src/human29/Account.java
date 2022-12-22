package human29;

public class Account {
	private int Balance;		// 계좌잔고	0<balance<1,000,000
	private final int MIN_BALANCE = 0;
	private final int MAX_BALANCE = 1000000;
	
	
	
	public Account() {
		this.Balance = 0;
	

	}

	public int getBalance() {
		return this.Balance;
	}

	public void setBalance(int balance) {
		if (Balance >MIN_BALANCE && Balance <MAX_BALANCE ) {
		this.Balance = Balance;
	}
	else {
		System.out.println ("계좌 허용한도 이상 또는 이하의 값을 갖게 됩니다");
	}
	}
}
