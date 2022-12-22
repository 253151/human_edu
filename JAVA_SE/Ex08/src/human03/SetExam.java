package human03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		Set <String> set1 = new HashSet<String>();
		set1.add("휴먼");
		boolean set1Result = set1.add("교육");
		boolean set2Result = set1.add("교육");		// 인자가 동일한 것이 있으면 무시됨.
		System.out.println(set1);
		System.out.printf("set1Result(%b) \t set1Result(%b) \n",set1Result,set2Result);
		
		int size = set1.size();		// set 컬렉션 안에 있는 데이터 수
		System.out.println ("set1 size : " + size);
		boolean isEmpty = set1.isEmpty();	// set 컬렉션이 비어 있는지를 판단하는 내용
		System.out.println ("set1 isEmpty : " + isEmpty);
		
		boolean isContain1 = set1.contains("휴먼");
		boolean isContain2 = set1.contains("센터");
		// contains는 검색하려는 객체가 있는지를 판단하는 true/false 되돌려 주는 기능
		System.out.println (isContain1);
		System.out.println (isContain2);
		
		// set은 순서가 없기 때문에 인덱스를 활용한 방법이 불가능하다. 아래문법은 사용불가 
//		for (int i=0; i<set1.size();i++) {
//			set1.get(i);
//		}
		// #1 첫번째 방법.
		for (String str : set1) {
			System.out.println ("for문 활용 : " +str);
		}
		
		System.out.println ("------------------------------------");
		
		
		// #2 두번째 방법
		Iterator<String> iter = set1.iterator();	// set1의 값만큼 반복할 수 있는 환ㄴ경을 만들어 낸다
		while (iter.hasNext()){
			String str = iter.next();
					System.out.println ("Iterator문 활용 : " +str);
		}
		
		
		boolean remove1Result = set1.remove("센터");
		// set은 내부의 데이터를 기반으로 삭제할 수 있으며, 성공여부를 되돌려준다.
		System.out.println(set1);
		System.out.println("remove1Result : "+remove1Result);
		
		boolean remove2Result = set1.remove("휴먼");
		// set은 내부의 데이터를 기반으로 삭제할 수 있으며, 성공여부를 되돌려준다.
		System.out.println(set1);
		System.out.println("remove2Result : "+remove2Result);
		System.out.println(set1);
		
		set1.clear();
		System.out.println(set1);
		
	}

}
