package human08;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(new Integer(80), "human1");
		tm.put(new Integer(70), "human2");
		tm.put(new Integer(99), "human3");
		tm.put(new Integer(90), "human4");
		
		System.out.println ("firstEntry() key : " +tm.firstEntry().getKey());
		System.out.println ("firstEntry() Value : " +tm.firstEntry().getValue());
		System.out.println ("----------------------------------------------------");
		
		System.out.println ("lastEntry() key : " +tm.lastEntry().getKey());
		System.out.println ("lastEntry() Value : " +tm.lastEntry().getValue());
		System.out.println ("----------------------------------------------------");
		
		System.out.println ("lowerEntry(80) key : " +tm.lowerEntry(80).getKey());		// 주어진 값을 미포함하여 작은 key의 값
		System.out.println ("lowerEntry(80) Value : " +tm.lowerEntry(80).getValue());
		System.out.println ("----------------------------------------------------");
		
		System.out.println ("higherEntry(80) key : " +tm.higherEntry(80).getKey());		// 주어진 값을 미포함하여 큰 key의 값
		System.out.println ("higherEntry(80) Value : " +tm.higherEntry(80).getValue());
		System.out.println ("----------------------------------------------------");
		
		System.out.println ("floorKey(80) : " +tm.floorEntry(80).getKey());				// 주어진 값을 포함하여 작은 key의 값
		System.out.println ("floorValue(80) Value : " +tm.floorEntry(80).getValue());
		System.out.println ("----------------------------------------------------");
		
		System.out.println ("ceilingKey(80) : " +tm.ceilingEntry(80).getKey());			// 주어진 값을 포함하여 큰 key의 값
		System.out.println ("ceilingValue(80) Value : " +tm.ceilingEntry(80).getValue());
		System.out.println ("----------------------------------------------------");
		
		Map.Entry<Integer, String> me =null;
		NavigableMap<Integer, String> descMap = tm.descendingMap();
		// descMap은 key 기준으로 정렬이 됨.
		Set <Map.Entry<Integer, String>> descEntrySet = descMap.entrySet();
		// descEntrySet에는 Map의 Key값을 key 기준으로 낾차순으로 정렬하되, 결과는 set로 처리함.
		System.out.println("deseEntrySet : " + descEntrySet);
		
		NavigableMap<Integer, String> ascMap = tm.descendingMap();
		Set <Map.Entry<Integer, String>> ascEntrySet = ascMap.entrySet();
		System.out.println("aseEntrySet : " + ascEntrySet);
	
		NavigableMap<Integer, String> rangeMap = tm.subMap(80, true, 90, true);
		System.out.println("rangeMapSet : " + rangeMap);
	}

}
