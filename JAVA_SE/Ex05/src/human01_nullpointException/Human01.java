package human01_nullpointException;

public class Human01 {

	public static void main(String[] args) {
		// 1. nullpointException 사례
		// 객체 생성 후 객체가 가르키는 heap 주소 null로 변경시
		Human h01 = new Human ("KANG");
		h01.run();
		System.out.println(h01);
		
		h01 = null;
		System.out.println(h01);
//		h01.run();
		
		// 2. 배열변수에 null로 초기화 한 후 배열내ㅐ의 값을 접근할 경우
		int[] intValue = null;
		
		
	}
}
