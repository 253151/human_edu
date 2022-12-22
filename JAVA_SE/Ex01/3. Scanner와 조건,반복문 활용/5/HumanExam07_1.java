package human05;

public class HumanExam07_1 {

	public static void main(String[] args) {
//		for (int i=0; i<10; i++) {
//		double a;
//		a = Math.random();	// 0~1 사이의 난수를 만들어줌.
//		System.out.println (a);
//		}

		// 1~6까지의 주사위 눈을 생성하는 난수 프로그램 (단, 주사위는 2개)
		// 반복하면서 2개의 주사위의 합이 5가 되면 프로그램을 종료하는 로직.
//		
//		for (int i=0; i<10; i++) {
//		double a;
//		a = Math.random()*6+1;	// 0~1 사이의 난수를 만들어줌.
//		int b = (int)a;			// 실수인 a를 정수인 b로 강제 casting.
//		System.out.printf ("%f / %d \n", a,b);
		
		boolean z = true;
		while (z) {
			double a1,a2;
			a1 = Math.random()*6+1; // 1~7 사이의 난수 (단, 7을 미포함)
			a2 = Math.random()*6+1;

			int x1,x2;		// 주사위 눈은 정수형으로 선언
			x1= (int) a1;	// 첫번째 주사위 눈
			x2 = (int) a2;	// 두번째 주사위 눈
			
			System.out.printf("(%d, %d)==> %d \n", x1,x2, x1+x2);
			
			if (x1+x2==5 || x1+x2 == 10) {		// x1+x2=5 또는 10일 때 종료의 조건.
				z=false;
			}
		
			}
	}

}



//0.6969287721550992
//0.09528151805131424
//0.3262563132778533
//0.2474377740985909
//0.7366835931728063
//0.04879071755575026
//0.5130735155341948
//0.4246699587001883
//0.663442167943652
//0.9520772681372206
//0.2398093291046357
//0.6772189926730775