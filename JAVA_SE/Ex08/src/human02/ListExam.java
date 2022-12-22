package human02;

import java.util.LinkedList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
//		List <String>list1 = new ArrayList<String>();
		List <String>list1 = new LinkedList<String>();
		// List는 인터페이스이고, ArrayList 및 LinkedList는 구현클래스이므로
		// 구현클래스를 상황에 맞추어 바꾸어도 시스템ㅁ 동작의 결과에는 이상이 없음.
		// 예를 들면 ArrayList로 구현해ㅓ 사용하고 있었으나
		// 데이터 추가, 삭제가 빈번하려 속도상 이슈가 이씅면, ArrayList ==> LinekdList로 바꾸어도 무방하다
		
	
		list1.add("KANG");
		list1.add("HUMAN");
		System.out.println(list1);
		list1.add("a");list1.add("a");list1.add("a");list1.add("a");list1.add("a");
		list1.add("a");list1.add("a");list1.add("a");list1.add("a");
		// list 컬렉션은 초기 용량보다 더 많은 add가 되면 스스로 증량을 해주는 기능이 있음.	
		System.out.println(list1);
		list1.clear();		// list 안의 데이터를 모두 삭제함
		System.out.println(list1);		
		
		list1.add("휴먼");
		list1.add("교육");
		list1.add("센터");
		boolean a1 = list1.add("휴먼");
		System.out.println(list1);
		System.out.println("a1 : " +a1);
		list1.add(1,"영등포");	
		// add에 인덱스를 추가할 경우 인덱스 위치에 내용을 축하고, 뒤의 내용은 한칸씩 미룬다
		System.out.println(list1);
		String isSet = list1.set(1, "처난");		
		// set은 특정위치에 데이터를 변경함. 되돌려준 값은 변경이전의 값을 되돌려줌.
		System.out.println(list1);
		System.out.println ("isSet : "+isSet);	// isSet : 영등포.
		
		boolean isE1 =list1.isEmpty();
		// list1이 비어 있으면 true, 비어있지 않으면 false
		System.out.println(isE1);
		int list1Length = list1.size();
		System.out.println("list1Length ==> " +list1Length);
		
		String remove4 = list1.remove(4);   
	    // list의 인덱스 위치에서 객체를 삭제함. 되돌려주는 값은 지워진 값
		System.out.println(list1);
	    System.out.println ("remove4 : " + remove4);
	    boolean isRemove1 = list1.remove("천안");
	    System.out.println(list1);
	    System.out.println("isRemove1 : " + isRemove1);

		
		
	}

}
