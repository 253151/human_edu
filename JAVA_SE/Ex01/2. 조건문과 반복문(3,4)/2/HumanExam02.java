package human04;

public class HumanExam02 {

	public static void main(String[] args) {

		int index = 0;
		int total = 0;

		do {
			index = index + 1;		//index++;
			total = total + index;	//total += index;
			
			System.out.printf("%d번째까지의 누적합은 %d \n", index, total);
		} while (index<10);

		System.out.printf("index=%d \t total=%d \n", index, total);
	}

}
