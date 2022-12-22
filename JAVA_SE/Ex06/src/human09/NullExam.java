package human09;

import java.util.Objects;

public class NullExam {

	public static void main(String[] args) {
		String str1 = "강현준";
		String str2 = null;
	
	try {
		System.out.println (Objects.requireNonNull(str1));
		
		String name = Objects.requireNonNull(str2);
		// requireNonNull 메서드는 null 데이터가 들어오면 강제로 NullPointException 발생
		System.out.println (name);
	}
	catch(Exception ne) {
		System.out.println (ne.getMessage());
	}
	
	try {
		String name = Objects.requireNonNull(str1, "null입니다");
		// requireNonNull 메서드는 null 데이터가 들어오면 강제로 NullPointException 발생
		System.out.println (name);
	}
	catch(Exception ne) {
		System.out.println (ne.getMessage());
	}
	}
	

}
