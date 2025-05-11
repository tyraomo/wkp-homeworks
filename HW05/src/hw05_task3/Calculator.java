package hw05_task3;

public class Calculator {
	
		 public static double divide(double a, double b) throws ArithmeticException{
			 if(b == 0) {
				 throw new ArithmeticException("niemals durch 0 teilen!");
			 }
		 return a/b;
		 }

	public static void main(String[] args) {
		
		try {
		System.out.println(Calculator.divide(3, 0));

		}catch(ArithmeticException e) {
			
			System.out.println("niemals durch 0 teilen!");
		}
	}

}
/*(Questions)
 * 1.handling the exception directly in the divide method can make more sense because the risk (division by zero) 
 * is very well defined and can be checked immediately.
 * 
 * 2.using the second method heavily depends on the context. For instance, when working with data bases,
 * it is better to call the exception later on to have more flexibility to deal with the error and hence decide 
 * how to manage it at the time instead of pointing it out right away.
 */

