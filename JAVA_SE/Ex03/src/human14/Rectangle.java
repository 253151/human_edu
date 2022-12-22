package human14;

public class Rectangle extends Shape{
	
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;

	}
	@Override
	public double calcArea() {
		double area;
		area = this.height * this.width;
		return area;
	}

}
