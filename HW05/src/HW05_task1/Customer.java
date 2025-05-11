package HW05_task1;

public class Customer {

	private Profile profile;
	private int id;
	
	public Customer(Profile profile, int id) {
		this.profile = profile;
		this.id = id;
	}
	
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void validateCustomerData() throws InvalidCustomerException{
		if (id <= 0) {
			throw new InvalidCustomerException("id missing or invalid(neg. value)");
		} 
		if(profile == null) {
			throw new InvalidCustomerException("invalid costumer profile");
		}
	}
	
	
}
