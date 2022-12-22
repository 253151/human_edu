package human05;

public class HumanExam09_4 {

	public static void main(String[] args) {
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		// 2중 for문을 사용할 것이고,
		// System.out.print ("*")
		// System.out.println ()
		// System.out.print (" ")
		
		
		int a,b;
		
		for (a=1; a<=5; a++) {
			for (b=0; b<=a-1; b++) {
				System.out.print(" ");
			}
			for (int c=a; c<=5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
