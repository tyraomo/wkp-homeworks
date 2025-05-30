package hw08_task1;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.io.*;

public class PersistentShapeManager {
	
	 //Saves all shapes to the file, one per line, using their toString() format
	public static void saveShapesToFile(Collection<? extends Shape> shapes, String filename) {
		//Append Mode aktivieren
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
		
			for(Shape shape : shapes) {
				writer.write(shape.toString());
				writer.newLine();
			}
		}catch (IOException e) {
			System.out.println("Fehler beim Öffnen der Datei.");
		}
		
		
		
	}
	
	//Uses BufferedReader to read lines from the file.
	 public static List<Shape> loadShapesFromFile(String filename){
		 List<Shape> shapes = new ArrayList<>();
			
			//FileReader – öffnet eine Textdatei
			//
			try(BufferedReader reader = new BufferedReader(new FileReader(filename))){

				String line;
				while((line = reader.readLine()) != null) {
				try{
					Shape shape = ShapeFactory.fromString(line);
					shapes.add(shape);
				}catch(IllegalArgumentException e) {
					System.out.println("Malformed line.");
				}
							
					
				}
				
			}catch(IOException e) {
				System.out.println("Fehler beim Öffnen der Datei.");
			}
			
			return shapes;
		 
	 }
	 
	 //Clears the contents of the specified file
	 static void clearFile(String filename) {
		 try(FileWriter writer = new FileWriter(filename)){
		 //gar nichts reinschreiben – das Öffnen im nicht-Append-Modus 
	 }catch(IOException e) {
		 System.out.println("Fehler beim leeren der Datei.");
	 }
	 }

}
