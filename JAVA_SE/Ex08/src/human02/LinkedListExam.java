package human02;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		List<String> list1 = new LinkedList<String>();
		list1.add("Data1");
		System.out.println(list1);
		list1.add("Data2");
		System.out.println(list1);
		list1.add(0,"Data0");
		System.out.println(list1);
		
		// LinkedList를 사용한느 첫번째 이유. ==> LinkedList만의 특정 메서드를 사용할 수 있다.
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("휴먼");
		linkedList.addFirst("영등포");	// = linkedList.add(0,"영등포") 이것과 같ㅌ은 개념
		System.out.println (linkedList);
		linkedList.addFirst("센터");	// = linkedList.add(linkedList.size(), "센터") 이것과 같ㅌ은 개념
		System.out.println (linkedList);
	}

}
