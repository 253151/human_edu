package human11;

public class BuyerExam {

	public static void main(String[] args) {
		int tvPrice = 100;
		int comPrice = 200;
		int audioPrice = 50;
		Buyer buyer1 = new Buyer(1000);
		
		TV tv = new TV(tvPrice, "TV");
		Computer comp = new Computer(comPrice, "COMPUTER");
		Audio audio = new Audio(audioPrice, "AUDIO");
		
		buyer1.buy(tv);
		buyer1.buy(audio);
		buyer1.buy(comp);
		buyer1.buy(tv);
		buyer1.buy(comp);
		buyer1.buy(comp);
		buyer1.buy(comp);

		
		buyer1.summary();
		System.out.println ("------------------------------");
		
		Buyer buyer2 = new Buyer(500);
		buyer2.buy(tv);
		buyer2.buy(tv);
		buyer2.buy(comp);
		buyer2.buy(comp);

		buyer2.summary();

		

	}

}
