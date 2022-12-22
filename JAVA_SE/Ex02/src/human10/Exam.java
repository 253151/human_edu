package human10;

public class Exam {

	public static void main(String[] args) {
		Student s1 = new Student("james", 500);
		Student s2 = new Student("thomas", 5000);
		Student s3 = new Student("jisu", 10000);
		
		Bus b1 = new Bus("100번", 0, 0);
		Bus b2 = new Bus("200번", 0, 0);
		
		Train t1 = new Train("1호선", 0, 0);
		Train t2 = new Train("2호선", 0, 0);
		
		
		
		s1.takeBus(b1);
		// 첫번째 학생이 첫번째 버스를 탄다.
		// 첫번째 학생 : 나의 돈이 1000 빠져나감
		// 첫번째 버스 : 승객이 +1, 수입이 1000 늘어남
		
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		System.out.printf("%s버스는 승객이 %d명이고, 수입이 %d입니다. \n", b1.busNo, b1.passengerCnt, b1.income);
		System.out.println("------------------------------------------------------");
		
		s2.takeTrain(t2);
		
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s2.name, s2.money);
		System.out.printf("%s열차는 승객이 %d명이고, 수입이 %d입니다. \n", t2.trainNo, t2.passengerCnt, t2.income);
		System.out.println("------------------------------------------------------");
		
		s3.takeBus(b2);
		s2.leaveTrain(t2);
	
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s2.name, s2.money);
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s3.name, s3.money);
		System.out.printf("%s버스는 승객이 %d명이고, 수입이 %d입니다. \n", b1.busNo, b1.passengerCnt, b1.income);
		System.out.printf("%s버스는 승객이 %d명이고, 수입이 %d입니다. \n", b2.busNo, b2.passengerCnt, b2.income);
		System.out.printf("%s열차는 승객이 %d명이고, 수입이 %d입니다. \n", t1.trainNo, t1.passengerCnt, t1.income);
		System.out.printf("%s열차는 승객이 %d명이고, 수입이 %d입니다. \n", t2.trainNo, t2.passengerCnt, t2.income);
		
		Student s4 = new Student("edward", 20000);
		Taxi taxi1 = new Taxi("잘나간다운수", 0);
		
		s4.takeTaxi(taxi1);
		
		System.out.printf("%s가 가지고 있는 돈 ==> %d \n", s4.name, s4.money);
		taxi1.showInfo();
	}

}
