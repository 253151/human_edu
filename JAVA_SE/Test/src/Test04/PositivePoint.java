package Test04;

public class PositivePoint extends Point {

	
	
	public PositivePoint(int x, int y) {
		super(x, y);
		}

	public void move(int x, int y) {
		if (x>0 && y>0) {
				this.x = this.x+x;
				this.y = this.y+y;
			}
	}
	
	@Override
	public String toString () {
	
		return "("+x+","+y+")의 점";
}
}
