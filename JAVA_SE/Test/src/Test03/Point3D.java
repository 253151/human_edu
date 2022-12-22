package Test03;

public class Point3D extends Point {



	public Point3D (int x, int y, int z) {
		super(x,y,z);
	}
	
	public void moveUp() {
		this.z = this.z+1;
		
	}

	public void moveDown() {
		this.z = this.z-1;
		
	}

	public void move(int x, int y) {
		this.x= x;
		this.y= y;
	}
	
	public void move(int x, int y, int z) {
		this.x= x;
		this.y= y;
		this.z= z;
		
	}
	@Override
	public String toString () {

		return  "("+x+","+y+","+z+")의 점";
	}


}
