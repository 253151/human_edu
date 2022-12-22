package human30;

public class Account {
	private String ano;		//계좌번호
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;			// this.ano
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;		// this.owner
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;		// this.balance
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
