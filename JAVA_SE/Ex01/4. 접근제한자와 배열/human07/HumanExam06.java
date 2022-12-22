package human07;

public class HumanExam06 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		System.out.println ("arr = " + arr.length);
		System.out.println ("arr = " + arr[0].length);
		System.out.println ("arr = " + arr[1].length);
		System.out.println ("arr = " + arr[2].length);
	
		System.out.println ("arr[0][0] = " +arr[0][0]);		
		System.out.println ("arr[0][1] = " +arr[0][1]);
		System.out.println ("arr[2][4] = " +arr[2][4]);
		System.out.println ("arr[1][2] = " +arr[1][2]);		
		System.out.println ("arr[2][3] = " +arr[2][3]);		
				
		

		int sum = 0;
		int count = 0;
		double avg = 0.0;
		
		for (int a=0; a<arr.length; a++) {
			for (int b=0; b<arr[a].length; b++) {
				sum = sum + arr[a][b];
				count++;
			}
		}
		avg = (double) sum / count;
		

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}


