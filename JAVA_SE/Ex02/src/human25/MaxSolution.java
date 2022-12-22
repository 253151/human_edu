package human25;

public class MaxSolution {
	// 멤버변수
	private int[] array;
	
	//생성자
	public MaxSolution(int[] array) {
		this.array = array;
		// this.array[0] = 5, this.array[1] = 4;
		
	}
	
	//메서드
	public int getMax() {
		int max = -99;
		for (int a=0; a<array.length; a++) {
			if (max < array[a]) {
				max = array[a];
			}
		}
		
		return max;
	}
}
