package human05;

public class HumanExam04 {

	public static void main(String[] args) {

		
	int a, b;
	
	a=1;
	while (a<=9) {
		System.out.printf("%d단입니다.\n", a);
		b=1;
		while (b<=9) {
			System.out.printf("%d X %d = %d \n", a, b, a*b);
			b++;
			
		}
		a++;
		System.out.println ("-----------------------");
		}
	}
}
	
	
	