package Test02;

public class ColorPoint extends Point{
	
	int x;
	int y;

	public ColorPoint(int x, int y, String color) {
		super(x, y, color);
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	public void setColor(String color) {
		this.color = color;
		}
	
	@Override
	public String toString () {

		return  color+"색의 ("+x+","+y+")의 점";
	}

}
