package human05;

public class HumanExam09_1 {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
		
		// 2중 for문을 사용할 것이고,
		// System.out.print ("*")
		// System.out.println ()
		
		
		int a,b;
		
		for (a=1; a<=5; a++) {
			for (b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
