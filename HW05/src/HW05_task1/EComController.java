package HW05_task1;

public class EComController {

	public static void main(String[] args) {

		try {
			ShippingInfo info =
			new ShippingInfo (" Munich", 80331 , "Germany ");
			Profile profile = new Profile(info);
			Customer customer = new Customer(profile , 123);
			System.out.println (" Shipping to: " +
			customer. getProfile (). getShippingInfo (). getCity ());
			
			info.validateShippingInfo();
			profile.missingShippingInfo();
			customer.validateCustomerData();
		
		}catch(InvalidShippingInfoException e) {
				
				System.out.println("Fehler bei den Versandinformationen");
				
			}
			catch(MissingShippingInfoException e) {
			
				System.out.println("Fehlende Versanddaten");
			}
			catch(InvalidCustomerException e) {
				
				System.out.println("Fehlende Kundendaten");
			}
		}

}
