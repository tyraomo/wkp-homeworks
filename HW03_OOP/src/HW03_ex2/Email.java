package HW03_ex2;

public class Email extends Message {
	
	@Override
	public String getType() {
		return "Email";
	}
	
	public void send() {
		System.out.println("E-Mail sent");
	}
}
