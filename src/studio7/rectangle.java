package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {

	private double length;
	private double width;

	public rectangle(double theLength, double theWidth) {
		length = theLength;
		width = theWidth;
	}

	public double area() {
		return length * width;
	}

	public double perimeter() {
		return (2 * length) + (2 * width);
	}

	public boolean isSquare() {
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean greaterThan(rectangle otherRect) {
		if (area() > otherRect.area()) {
			return true;
		}
		return false;
		
	}
	
	public void draw(double x, double y) {
		StdDraw.rectangle(x, y, (1/2 * length), (1/2 * width));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r1 = new rectangle(0.3, 0.4);
		rectangle s1 = new rectangle(0.2, 0.2);
		
		System.out.println(r1.greaterThan(s1));
	}

}
