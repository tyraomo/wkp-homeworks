package hw08_task1;

public class ShapeFactory {
	
	 public static Shape fromString(String input) {
		 try {
			 if(input.equals("Circle: radius=2.0")) {
				 return new Circle(2.0);
			 }else if(input.equals("Rectangle: width=3.0, length=4.0")) {
				 return new Rectangle(3.0, 4.0);
			 }else {
				 throw new IllegalArgumentException("Unrecognized shape ");
			 }
			
		 }
		 catch( IllegalArgumentException e) {
			 System.out.println("Invalid Input" + input);
			 throw new IllegalArgumentException(" no shape", e);
		 }
	 }

}
/**
 * Qestions:
 * 
 * 1)Mit <? extends Shape> erlaubt man, dass die Methode auch Collections verarbeitet, die Untertypen von Shape enthalten
 *  * z.B. List<Circle>. 
 * Ohne diese Wildcard müsste man sich auf genau Collection<Shape> beschränken
 * 
 * 2)<? extends Shape> ist nur lesbar, aber du kannst damit nichts Neues bauen.
T extends Shape ist ein konkreter Typparameter, den man mehrfach verwenden
 * 
 * 3) (?)
 * Die Methoden sind static, weil sie keinen Zustand speichern und nicht von Objektattributen abhängen.
 *  (Hilfsfunktionen)
 *  diese tun nur mit übergebenen Parametern arbeiten = gehören  zur Klasse, nicht zu einer Instanz.
 * 
 */
