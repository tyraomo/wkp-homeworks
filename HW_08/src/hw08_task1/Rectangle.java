package hw08_task1;

public class Rectangle extends Shape{

	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double getArea() {
		
		double area;
		area = width * length;
		return area;
	}
	
	@Override
	public String toString() {
		//return "Rectangle: width=" + width + ", length=" + length;
		return "Rectangle: area:" + getArea();
	}
}
