package human17;

public class MathRandomExam {

	public static void main(String[] args) {
		// Math.random() : 0~1 사이의 난수.. (단, 1은 미포함)
		// 주사ㅏ위는 1~6 동일확률로 나와야 함
		// 0 <= Math.random() < 1
		// 0*6 <= 6*Math.random() < 1*6 => 0~6
		// 0*6+1 < 6*Math.random()+1 < 1*6+1 ==> 1~7 (7은 미포함)
		// 현상태에서 소수점 버림.
		
		double temp1 = Math.random() * 6 + 1;	// 1~7 사이의 난수
		double num1 = Math.floor(temp1);		// 소주점 버림
		System.out.printf("주사위의 눈 : %d \n", (int)num1);
		
		// 로또 번호 (1~45 사이의 수)
		System.out.printf("1~45 사이의 수사 : %d \n", (int)Math.floor(Math.random()*45+1));
	}

}
