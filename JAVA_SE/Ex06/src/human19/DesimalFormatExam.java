package human19;

import java.text.DecimalFormat;

public class DesimalFormatExam {

	public static void main(String[] args) {
		double num = 1123456.789;
		
		DecimalFormat df = new DecimalFormat("0");	// 소수점 반올림.
		System.out.println (df.format(num));
		
		df = new DecimalFormat("0.0");	// 소수점 둘째자리에서 반올림하여 첫째자리까지만 표시.
		System.out.println (df.format(num));

		df = new DecimalFormat("0.0000");
		System.out.println (df.format(num));
		
		df = new DecimalFormat("#");		// 십진수 표시. 
		System.out.println (df.format(num));
		
		df = new DecimalFormat("#.#");		// 십진수 표시. 소수점까지 출력
		System.out.println (df.format(num));
		
		df = new DecimalFormat("#.0");		
		System.out.println (df.format(num));
		
		df = new DecimalFormat("+#.0");			// 부호를 붙여서 표시
		System.out.println (df.format(num));

		df = new DecimalFormat("-#.0");			// 표시만 음수일뿐 num이란 수치가 음수로 변환된 것은 아님.
		System.out.println (df.format(num));
		
		df = new DecimalFormat("#,###");		// 1000단위 콤마 표시
		System.out.println (df.format(num));
		
		df = new DecimalFormat("0.0E0");		// 1.1E6 ==> 1.1 * 10의 6승. = 1.2*1000000
		System.out.println (df.format(num));
		
		df = new DecimalFormat("+#,### ; -#,### ");		// 양수이면 +, 음수이면 -를 붙임.	
		System.out.println (df.format(num));

		df = new DecimalFormat("#.#%");			// % 표시
		System.out.println (df.format(num));
		
		df = new DecimalFormat("\u00A4#,###");	// 원(화폐단윈) 표시.		
		System.out.println (df.format(num));




	}

}
