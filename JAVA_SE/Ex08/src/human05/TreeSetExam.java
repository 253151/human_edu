package human05;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(new Integer(81));
		ts.add(new Integer(82));
		ts.add(new Integer(70));
		ts.add(new Integer(89));
		ts.add(new Integer(85));
		System.out.println (ts);
		
		System.out.println ("ts.first : "+ts.first());	//70
		System.out.println ("ts.last : "+ts.last());	//70
		System.out.println ("ts.lower(85) : "+ts.lower(new Integer(85)));	//85 (미포함하여 비교)
		System.out.println ("ts.higher(85) : "+ts.higher(new Integer(85)));	//85 (미포함하여 비교)
		System.out.println ("ts.floor(85) : "+ts.floor(new Integer(85)));	//85 (포함하여 작은수찾기)
		System.out.println ("ts.ceiling(85) : "+ts.ceiling(new Integer(85)));	//85 (포함하여 큰수찾기)
		
		System.out.println ("ts.pollFirst(85) : "+ts.pollFirst());	// 가장 낮은 수 찾아주되, 지워버림
		System.out.println (ts);
		System.out.println ("ts.pollLast(85) : "+ts.pollLast());	// 가장 큰 수 찾아주되, 지워버림
		System.out.println (ts);
		
		ts.add(new Integer(70));
		ts.add(new Integer(89));	// 지워진 것 강제로 추가함.
		
		// 정렬.
		NavigableSet<Integer> desc = ts.descendingSet();	// ts를 내림차순으로 정렬
		System.out.println ("내림차순 정렬 : " +desc);
		NavigableSet<Integer> asc = ts.descendingSet();		// 내림차순된 set를 descendingSet하면 오름차순이 됨.
		System.out.println ("오름차순 정렬 : " +asc);
		
		// 부분 검색
		NavigableSet<Integer> bet1 = ts.headSet(new Integer(82),false);	// 앞에서부서 82까지 부분검색. false 82는 미포함
		NavigableSet<Integer> bet2 = ts.headSet(new Integer(82),true);	// 앞에서부서 82까지 부분검색. true 82는 포함
		System.out.println ("bet1 : " +bet1);
		System.out.println ("bet2 : " +bet2);
		
		NavigableSet<Integer> bet3 = ts.tailSet(new Integer(82),false);	// 82부터 끝까지 부분검색. false 82는 미포함
		NavigableSet<Integer> bet4 = ts.tailSet(new Integer(82),true);	// 82부터 끝까지 부분검색. true 82는 미포함
		System.out.println ("bet3 : " +bet3);
		System.out.println ("bet4 : " +bet4);
		
		NavigableSet<Integer> bet5 = ts.subSet(new Integer(81),false,new Integer(85),false);
		System.out.println ("bet5 : " +bet5);
		NavigableSet<Integer> bet6 = ts.subSet(new Integer(81),true, new Integer(85),true);
		System.out.println ("bet6 : " +bet6);
		NavigableSet<Integer> bet7 = ts.subSet(new Integer(81),true, new Integer(85),false);
		System.out.println ("bet6 : " +bet7);


		

		
	}

}
