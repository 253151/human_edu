package human11;

public class Buyer {
	
	public int money;
	public Product[] cart = new Product[10];
	public int index;
	
	public Buyer(int money) {
		this.money = money;
		this.index = 0;
	}
	public void buy(Product product) {
		// Product product = tv
		
		if (this.money - product.price < 0) {
			System.out.println ("현재잔고가 부족하여 추가구매가 어렵습니다");
			System.out.printf("현재잔액: %d / 제품(%s): %d \n", this.money, product.name, product.price);
			return ;
		} 
		else { 
			this.money = this.money - product.price;
			add(product);
		}
	}
	public void add (Product product) {
		this.cart[this.index] = product;
		System.out.printf("Cart[%d] : %s(%d) \n", this.index, product.name, product.price);
		this.index = this.index+1;
	}
	public void summary() {
		
		String itemList = "";
		int sum = 0;
		for (int i=0; i<cart.length; i++) {
			if (this.cart[i] == null) {
				break;
			}
			itemList = itemList+cart[i].name+", ";
			sum = sum + cart[i].price;
		}
		System.out.printf("구입한 물건 : %s \n", itemList);
		System.out.printf("총 사용금액 : %d \n", sum);
		System.out.printf("현재잔고 : %d \n", this.money);
	}
}
