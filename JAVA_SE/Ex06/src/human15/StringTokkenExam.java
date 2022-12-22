package human15;

import java.util.StringTokenizer;

public class StringTokkenExam {

	public static void main(String[] args) {
		String text = "홍길동/박연수/이수홍";
		StringTokenizer st = new StringTokenizer(text, "/");
		
		int count = st.countTokens();
		
		for(int i=0; i<count; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		st = new StringTokenizer(text,"/");
		while (st.hasMoreTokens()) {
			// 다음에 토큰이 존재하면 true
			String token = st.nextToken();
			System.out.println(token);
			
		}
	}

}
