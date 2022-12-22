package human18;

import java.util.TimeZone;

public class TimeZoneExam {

	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		
		for(String a : availableIDs) {
			System.out.println(a);
		}

	}

}
