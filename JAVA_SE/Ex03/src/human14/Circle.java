package human14;

public class Circle extends Shape {
	private double r;
	private static final double PI = 3.141592;
	
	public Circle (double r) {
		this.r = r;
	}

	@Override
	public double calcArea() {
		double area;
		area = PI *r*r;
		return area;
	}
}
