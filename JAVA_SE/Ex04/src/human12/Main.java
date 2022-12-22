package human12;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student (10,10,5,20);
		s1.printInfo();
		s1.age();
		s1.printInfo();
		s1.coding();
		s1.talk();
		s1.attack();
		s1.move(5, 10);
		s1.printInfo();
		
		System.out.println ("-------------------");
		Student s2 = new Student (15,1,17,50);
		s2.printInfo();
		
		s2.getAge();
		s2.weight(5);
		s2.printInfo();
		
		
		System.out.println ("-------------------");
		
		Pigeon p1 = new Pigeon(1,1,1,5);
		p1.printInfo();
		p1.attack();
		p1.fly();
		p1.flyMove(10, 20);
		p1.printInfo();
		
		System.out.println ("-------------------");
		Turtle t1 = new Turtle(2,2,100,26);
		t1.printInfo();
		t1.swimDown(10);
		t1.eat();
		t1.printInfo();
		
		

	}

}
