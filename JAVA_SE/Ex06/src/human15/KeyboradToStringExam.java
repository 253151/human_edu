package human15;

import java.io.IOException;

public class KeyboradToStringExam {

	public static void main(String[] args) throws IOException {
		byte[] b = new byte[100];
		System.out.print ("입력 : ");
		int readByteNo = System.in.read(b);
		// 키보드에서 입력한 글자를 bytes의 배열변수에 담는 기능을 수행
		// 엔터를 치는 순간 그때까지 담겨진 글자의 수를 readByteNo 대입을 함.
		// 엔터를 치는 순간. 2개의 문자가 더 붙음. (캐리지리턴(\ㄱ), 라인피드(\ㅜ) 2개의 문자가 더 붙음.
		
		System.out.println ("readByteNo : " + readByteNo);
		
		String str1 = new String(b,0,readByteNo-2);
		System.out.println (str1);
		// 영문은 한글자당 1byte단위로 처리 되는데
		// 영문외에는 한글자당ㅇ 2~3 byte 단위로 처리를 함.
		// 아스키코드는 영문위주고, UTF-8등등의 다른 코드체계가 생겼는데, 이는 다국어 지원을 위한 것임.
	}

}
