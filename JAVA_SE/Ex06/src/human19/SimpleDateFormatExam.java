package human19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExam {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println (now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// yyyy : 년도
		// MM : 월
		// dd : 일
		// hh : 시간
		// mm : 분
		// ss : 초
		System.out.println (sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println (sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println (sdf.format(now));
		
		// 오전, 오후 / 요일. ~번째날.
		
		sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		// a는 오전, 오후를 의미함.
		System.out.println (sdf.format(now));

		sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");
		System.out.println (sdf.format(now));
		
		// D ==> 올해의 몇번째날, d ==> 이달의 몇번째날
		sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일. 오늘은 올해의 D번째날");
		System.out.println (sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일. 오늘은 이달의 d번째날");
		System.out.println (sdf.format(now));
	}

}
