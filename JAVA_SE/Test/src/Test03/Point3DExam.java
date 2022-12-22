package Test03;

public class Point3DExam {

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);		// 1,2,3은 각각 x,y,z축의 값
		
		System.out.println(p.toString()+"입니다.");
		
		p.moveUp();				// z축으로 위쪽 이동
		System.out.println(p.toString()+"입니다.");
		
		p.moveDown();			// z축으로 아래쪽 이동
		p.move(10,10);			// x,y축으로 이동
		System.out.println(p.toString()+"입니다.");
		
		p.move(100,200,300);	// x,y,z축으로 이동
		System.out.println(p.toString()+"입니다.");

	}

}
