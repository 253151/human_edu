package human19;

import java.text.MessageFormat;

public class MessageFormatExam {

	public static void main(String[] args) {
		String id = "Human";
		String name = "강현준";
		String tel = "010-123-1234";
		
		String tempText = "회원ID : {0}. \n회원이름 : {1} \n전화번호 : {2}";
		String text = MessageFormat.format(tempText, id, name, tel);
		System.out.println(text);
	}

}
