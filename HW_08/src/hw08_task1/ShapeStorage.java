package hw08_task1;
import java.util.ArrayList;


public class ShapeStorage <T extends Shape> extends ArrayList<T>  {

	public double getTotalArea() {
		
		double totalArea = 0.0;
		
		//T weil T extends Shape
		//this - aktuelle liste
		for(T shape : this) {
			totalArea += shape.getArea();
		}
		return totalArea;
	};
	
	public void displayAllShapes() {
		for(T shape : this) {
		System.out.println(shape);
		}
	}
	
	//U ist ein Untertyp oder genau gleich wie T
	public <U extends T> void importLargeShapes(ShapeStorage<U> other, double minArea) {
		for(U shape : other) {
			if(shape.getArea() >= minArea) {
				this.add(shape);
			}
		}
	}
	
}
