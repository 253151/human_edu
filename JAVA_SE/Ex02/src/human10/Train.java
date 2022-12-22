package human10;

public class Train {
	
	public String trainNo;
	public int passengerCnt;
	public int income;
	
	public Train(String trainNo,int passengerCnt, int income) {
		this.trainNo = trainNo;
		this.passengerCnt = passengerCnt;
		this.income = income;
	}
	public void take(int money) {
		this.passengerCnt++;
		this.income = this.income + money;
	}
	public void leave(int passengerCnt) {
		this.passengerCnt--;
	}
}
