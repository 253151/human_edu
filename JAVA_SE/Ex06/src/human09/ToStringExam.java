package human09;

import java.util.Objects;

public class ToStringExam {

	public static void main(String[] args) {
		String str1 = "강현준";
		String str2 = null;
		
		System.out.println (Objects.toString(str1));
		System.out.println (Objects.toString(str2));
		System.out.println (Objects.toString(str1, "널입니다"));



	}

}
