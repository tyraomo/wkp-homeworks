package HW05_task1;

public class ShippingInfo {

	private String city;
	private int zip;
	private String country;
	
	public ShippingInfo(String city, int zip, String country) {
		this.city = city;
		this.zip = zip;
		this.country = country;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getZip() {
		return zip;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void validateShippingInfo() throws InvalidShippingInfoException {
		
		if (zip <= 0) {
			 throw new InvalidShippingInfoException("zip fehlt oder wert ungültig.");
			
		}
		if(city.length() <= 0) {
			throw new InvalidShippingInfoException("city fehlt oder wert ungültig.");
		}
	}
}
