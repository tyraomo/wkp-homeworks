package hw08_task1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class ShapeAnalyzer {
	
	//vor der Schleife initialisiert,
	//innerhalb der Schleife gefüllt,
	//nach der Schleife zurückgegeben.

	 static List<Shape> filterByMinArea(Collection<? extends Shape> shapes, double minArea){
		 List<Shape> result = new ArrayList<>();
		 for(Shape shape : shapes) {
			 if(shape.getArea() >= minArea) {
				 result.add(shape); 
				
			 }
		 } return result;
	 }
	 
	 static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes) {
		 double maxArea = Double.NEGATIVE_INFINITY;
		 Shape maxShape = null;
		 
		 for(Shape shape : shapes) {
			 if(shape.getArea() > maxArea)
				 maxArea = shape.getArea();
			     maxShape = shape;
		 }
		 return maxShape;
		 
	 }
	 
	 static <T extends Shape> Map<String, List<T>> groupByType(Collection<T> shapes){
		 //neue Map erstellen
		 Map<String, List<T>> groupedShapes = new HashMap<>();
		 
		 for(T Shape : shapes) {
			String type = Shape.getClass().getSimpleName();
			//Schlüssel überprüfen
			 if(!groupedShapes.containsKey(type)) {
				groupedShapes.put(type, new ArrayList<>());
				groupedShapes.get(type).add(Shape);
			 }
		 } return groupedShapes;
	 }
}
