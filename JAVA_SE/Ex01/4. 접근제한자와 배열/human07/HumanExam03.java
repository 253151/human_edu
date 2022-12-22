package human07;

public class HumanExam03 {

	public static void main(String[] args) {
		int [][] score = {
					{10,20,30,40},
					{50,60,70,80},
					{90,100,110,120}
					};
		
		int total=0;
		
		System.out.println ("score = " +score);
		System.out.println ("score[0] = " +score[0]);		
		System.out.println ("score[0][0] = " +score[0][0]);		
		System.out.println ("score[0][1] = " +score[0][1]);
		System.out.println ("score[0][2] = " +score[0][2]);
		System.out.println ("score[1][2] = " +score[1][2]);		
		System.out.println ("score[2][3] = " +score[2][3]);		
		

		System.out.println ("score[0] = " +score[0]);		
		System.out.println ("score[1] = " +score[1]);
		System.out.println ("score[2] = " +score[2]);
		
		System.out.println ("score = " + score.length);
		System.out.println ("score = " + score[0].length);
				
		for (int a=0; a<score.length; a++) {
			for (int b=0; b<score[a].length; b++) {
				total = total + score[a][b];
			}
		}
		System.out.printf("total = %d \n", total);
		
		
	}

}
