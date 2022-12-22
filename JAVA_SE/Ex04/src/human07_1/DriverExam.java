package human07_1;

public class DriverExam {

	public static void main(String[] args) {
		Bus b1 = new Bus();
		Taxi t1= new Taxi();
		
		Driver d1 = new Driver();
		d1.drive(b1);	// 택시를 타는 상황

//		Vehicle v = b1;
//		b1은 new Bus에 의해 생성된 객체이므로 아래와 같음. 
//		Vehicle v  new Bus();
	}

}
