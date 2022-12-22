package human15;

public class StringLengthExam {

	public static void main(String[] args) {
		String ssn = "760000100000";
		
		int len = ssn.length();
		System.out.println (len);
		
		if(len == 13) {
			System.out.println ("주민번호 자리수가 맞습니다");
		}
		else {
			System.out.println ("주민번호 자리수가 맞지 않습니다.");
		}
	}

}
