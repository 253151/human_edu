import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	private ArrayList<String> alName;
	private ArrayList<Integer> alQty;
	private ArrayList<Integer> alPrice;	// 합계 (단가*수량)
	private String mobile;
	private Menu m1;
	
	Order(Menu m) {
		//	초기화
		this.alPrice= new ArrayList<Integer>();
		this.mobile="";
		this.m1 = m;
	}
	void add() {
		Scanner s1= new Scanner(System.in);
		Scanner s2= new Scanner(System.in);

		// 메뉴번호를 입력받는다 (""이 아닌 동안)
		// 수량을 입ㄹ력받는다
		// 단가*수량=>합계
		// alName/alQty/alPrice에 각각 추가
		
		// 모바일번호 입력 받는다
		while(true) {
			this.m1.display();
			System.out.print("메뉴번호? ['':조ㅗㅇ료]");	// 메뉴 번호를 입력받아 해당 메뉴를 가져와야함		
			String pMenuNum=s1.nextLine();
			if(pMenuNum.equals("")) break;
			
			int ndx = Integer.parseInt(pMenuNum)-1;	// 메뉴번호->메뉴인뎃구
			String name = this.m1.getName(ndx);
			int net=this.m1.getPrice(ndx);
			System.out.print("수량? ");		// 메뉴 번호에서 가격 정보를 받아 수량 곱하기
			int qty = s2.nextInt();
			this.alName.add(name);
			this.alQty.add(qty);
			this.alPrice.add(qty*net);
		}
			System.out.print("모바일 번호? ");
			this.mobile = s1.nextLine();

		
		
	}
	void display() {
		int sum =0;
		for(int i=0; i<this.alName.size(); i++) {
			System.out.println((i+1)+"."+this.alName.get(i)+", x"+this.alQty.get(i)+", "+this.alPrice.get(i)+"원");
			sum+=this.alPrice.get(i);
		}
		System.out.println("총액:"+sum+", 모바일번호:"+this.mobile);
		
		// 주문내역을 출력(화면표시)
	}
//	void update() {
//		// 취소할 주문번호를 입력받는다. (""이 아닌 동안)
//		// 주문 삭제
//	}
	void delete() {
		Scanner s =new Scanner(System.in);
		while(true) {
			this.m1.display();
			System.out.print("지울 주문내역번호를 입력하시오['':종료]");
			String pMenuNum=s.nextLine();
			if(pMenuNum.equals("")) break;
			
			int ndx = Integer.parseInt(pMenuNum)-1;
			this.alName.remove(ndx);
			this.alQty.remove(ndx);
			this.alPrice.remove(ndx);
			
		}
		
	}
	void control() {
		Scanner s1 = new Scanner(System.in);	// 문자열 입력
		Scanner s2 = new Scanner(System.in);	// 숫자 입력
		
		while(true) {
		System.out.print("작업을 선택하시오 [c:추가, r:목록표시, u:수정, d:삭제, '':종료 ] ");
		String instr= s1.nextLine();
		if(instr.equals("")) {
			break;
		}
		if(instr.equals("c")) {
			this.add();
		}
		if(instr.equals("r")) {
			this.display();
		}
//		if(instr.equals("u")) {
//			this.update();
//		}
		if(instr.equals("d")) {
			this.delete();
		}
		}
	}
	int getSize() {
		return this.alName.size();
	}
	String getName(int ndx) {
		return this.alName.get(ndx);
	}
	int getQty(int ndx) {
		return this.alQty.get(ndx);
	}
	int getPrice(int ndx) {
		return this.alPrice.get(ndx);
	}
	String getMobile() {
		return this.mobile;
	}
}
