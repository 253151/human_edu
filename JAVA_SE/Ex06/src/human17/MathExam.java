package human17;

public class MathExam {

	public static void main(String[] args) {
		int v1 = Math.abs(-5);			// 절댓값
		double v2 = Math.abs(-3.14);
		System.out.println ("v1 : "+ v1);
		System.out.println ("v2 : "+ v2);
		
		double v3 = Math.abs(5.3);		// 올림값 ==> 6.0
		double v4 = Math.abs(-5.3);		// 올림값 ==> -5.0
		System.out.println ("v3 : "+ v3);
		System.out.println ("v4 : "+ v4);
		
		double v5 = Math.floor(5.3);	// 내림값 ==> 5.0
		double v6 = Math.floor(-5.3);	// 내림값 ==> -6.0
		System.out.println ("v5 : "+ v5);
		System.out.println ("v6 : "+ v6);
		
		int v7 = Math.max(5, 9);		// 2개의 수 중 큰 수
		double v8 = Math.max(5.0, 9.0);		// 2개의 수 중 큰 수
		System.out.println ("v7 : "+ v7);
		System.out.println ("v8 : "+ v8);
		
		int v9 = Math.min(5,9);		// 2개의 수 중 작은 수
		double v10 = Math.min(5.0,9.0);	// 2개의 수 중 작은 수
		System.out.println ("v9 : "+ v9);
		System.out.println ("v10 : "+ v10);
		
		double v11 = Math.random();		// 0~1 사이의 난수 단, 1은 포함되지 않음
		System.out.println ("v11 : " + v11);
		
		double v12 = Math.rint(5.3);	// 정수에 가까운 실수값 (반올림 실수값, 단 소수점은 모두 0)
		double v13 = Math.rint(5.5);	// 정수에 가까운 실수값 (반올림 실수값, 단 소수점은 모두 0)
		System.out.println ("v12 : "+ v12);
		System.out.println ("v13 : "+ v13);
		
		long v14 = Math.round(5.3);		// round는 반올림 정수형 (되돌림 값의 타입은 long)
		long v15 = Math.round(5.7);		// round는 반올림 정수형 (되돌림 값의 타입은 long)	
		System.out.println ("v14 : "+ v14);
		System.out.println ("v15 : "+ v15);
		
		// 12.3456, 소수점 둘째자리에서 반올림.
		double value = 12.3456;	// ==>12.35
		// 1. value *100 --> round로 반올림 --> 100.0으로 나눔 (소수점 처리를 위해)
		double temp1 = value * 100;		// 1234.56
		long temp2 = Math.round(temp1);	// 1235
		double v16 = temp2 / 100.0;		// 12.35
		System.out.println ("v16 : "+ v16);
		
		
	}

}
