package human10;

public class Taxi {
	public String taxiNo;
	public int income;
	
	public Taxi(String taxiNo, int income) {
		this.taxiNo = taxiNo;
		this.income = income;
	}
	public void take (int money) {
		this.income = this.income + money;
	}
	public void showInfo() {
		System.out.printf ("%s택시는 %d의 수입이 있습니다.", this.taxiNo, this.income);
	}
}
