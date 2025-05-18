package hw06_task3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

	@Test
	public void testAddition() {
		
		Fraction f1 = new Fraction(1,4);
		Fraction f2 = new Fraction(1,4);
		
		f1.addition(f2);
		
		assertEquals("1/2", f1.toString());
		
		//JUnit sagt erwartet 1/4, aber ergibt 2/4 also flasch wie erwartet
	
	}
	
	@Test 
	public void testMultiplikation() {
		
		Fraction f1 = new Fraction(1,4);
		Fraction f2 = new Fraction(1,4);
		
		f1.multiplikation(f2);
		
		assertEquals("1/16", f1.toString());
	}
	
	@Test
	public void testKehrwert() {
		
		Fraction f1 = new Fraction(1,4);
		Fraction f2 = new Fraction(0,4);
		
		f1.kehrwert();
		
		assertEquals("4/1", f1.toString());
		assertThrows(ArithmeticException.class, () -> {
	        f2.kehrwert();
	    });
	}
	
	@Test
	public void testKuerzen() {
		
		Fraction f1 = new Fraction(4,8);
		
		f1.kuerzen();
		
		assertEquals("1/2", f1.toString());
	}
}
