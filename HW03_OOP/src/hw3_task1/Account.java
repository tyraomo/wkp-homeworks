package hw3_task1;

public class Account {

	 public String owner;
	 private double balance;
	 protected int pin;
	 String internalNote;//package-private
	 
	 public Account(String owner, double balance, int pin, String internalNote) {
		 this.owner = owner;
		 this.balance = balance;
		 this.pin = pin;
		 this.internalNote = internalNote;
	 }
	 
	 public double getBalance() {
		 return balance;
	 }
	 public boolean changePin(int oldPin, int newPin) {
		 if(this.pin == oldPin) { //correct pin so change possible
			 this.pin = newPin;
			 return true;
		 }
		 return false;//remains same bc false pin
	 }
	 
}
