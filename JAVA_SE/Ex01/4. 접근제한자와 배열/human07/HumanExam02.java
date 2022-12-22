package human07;

public class HumanExam02 {

	public static void main(String[] args) {
		int [] score = {100,90,70,80,60,50,30,40,20,10,100,90,70,80,60,50,30,40,20,10};
		int total=0;
		System.out.println ("score = " + score);
		System.out.println ("score[0] = " + score[0]);
		System.out.println ("score[0] = " + score[1]);
		System.out.println ("score[0] = " + score[2]);
		System.out.println ("score[0] = " + score[19]);
//		System.out.println ("score[0] = " + score[20]);

		
		System.out.println ("전체길이 : " + score.length);
	
		for (int i=0; i<20; i++) {		// score.lenth는 배열의 길이를 의미함.
			total = total + score[i];
		}
	
		System.out.printf ("total = %d \n", total);
	
		score[0] = 20;
		System.out.println ("score[0] = " + score[0]);
		
	}
	

}
