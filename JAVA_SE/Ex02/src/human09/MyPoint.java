package human09;

public class MyPoint {
	int x;
	int y;
	
	MyPoint (int x, int y)	{
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int i, int j) {
		
		double dist;
		int a,b;
		a = this.x - i;
		b = this.y - j;
		dist = Math.sqrt(a*a+b*b);
		
		return dist;
		
	}

}
