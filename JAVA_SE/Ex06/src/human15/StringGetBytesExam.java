package human15;

public class StringGetBytesExam {

	public static void main(String[] args) {
		String str = "안녕하세요";
		// 영문일때는 1byte,
		// 한글일때는 UTF-8 인코딩 기반이므로 3byte로 처리됨.
		
		byte[] b1 = str.getBytes();
		System.out.println("b1.length : " +b1.length);
		String str1 = new String(b1);
		System.out.println("byte ==> String : " + str1);
		
		try {
			byte[] b2 = str.getBytes("EUC-KR");
			// EUC-KR이란 인코딩 타입으로 바이트 값으로 얻어온다.
			// EUC-KR은 한글의 경우 1글자가 28byte로 처리됨.
			System.out.println("b2.length : " +b2.length);
			String str2 = new String(b2,"EUC-KR");
			System.out.println("byte ==> String : " + str2);
			
			byte[] b3 = str.getBytes("UTF-8");
			// EUC-KR이란 인코딩 타입으로 바이트 값으로 얻어온다.
			// EUC-KR은 한글의 경우 1글자가 28byte로 처리됨.
			System.out.println("b3.length : " +b3.length);
			String str3 = new String(b3,"UTF-8");
			System.out.println("byte ==> String : " + str3);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
