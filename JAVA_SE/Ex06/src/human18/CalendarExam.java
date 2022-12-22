package human18;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
//		System.out.println (now);
		System.out.println (now.toString());
		
		int year = now.get(Calendar.YEAR);			// 2022
		int month = now.get(Calendar.MONTH) +1;		// Calendar.MONTH는 0에서부터 시작 ==> 9
		int day = now.get(Calendar.DAY_OF_MONTH);	// 21
		int week = now.get(Calendar.DAY_OF_WEEK);	// 주 중읨 몇번째 일자
		
		System.out.println (year);
		System.out.println (month);
		System.out.println (day);
		System.out.println (week);
		
		String strWeek = null;
		switch (week) {
			case Calendar.MONDAY :		// Calendar.MONDAY는 2란 수치를 static final로 Calendar 클래스에서 정의
				strWeek = "MON";
				break;
			case Calendar.TUESDAY :
				strWeek = "TUE";
				break;
			case Calendar.WEDNESDAY :
				strWeek = "WED";
				break;
			case Calendar.THURSDAY :
				strWeek = "THU";
				break;
			case Calendar.FRIDAY :
				strWeek = "FRI";
				break;
			case Calendar.SATURDAY :
				strWeek = "SAT";
				break;
			case Calendar.SUNDAY :
				strWeek = "SUN";
				break;
		}
		System.out.println(strWeek);
		
		String strAmPM = null;
		int amPm = now.get(Calendar.AM_PM);
		if (amPm == Calendar.AM) {
			strAmPM = "오전";
		}
		else {
			strAmPM = "오후";
		}
		
		System.out.println(strAmPM);
		
		int hour = now.get(Calendar.HOUR);	//현재시간
		int minute	= now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.printf("%d년도 %d월 %d일 %s요일 %s %d:%d:%d \n", year, month, day, strWeek, strAmPM, hour, minute, second);
	}

}
