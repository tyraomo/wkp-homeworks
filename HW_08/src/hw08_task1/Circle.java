package hw08_task1;

public class Circle extends Shape {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	//radius = pi mal r quadrat - nutze Math.PI
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
    public String toString() {
		return "Circle radius: "+ radius;
	}
}
