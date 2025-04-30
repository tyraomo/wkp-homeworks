package external_company;

import hw3_task1.Account;

public class CompanyAccount extends Account {
	
	//super constructor
	 public CompanyAccount(String owner, double balance, int pin, String internalNote) {
	        super(owner, balance, pin, internalNote);
	    }
	
	 //da Vererbung -> muss nicht als Param angegeben werdeb
	public void accessHere() {
		System.out.println("owner:" + owner);//works bc public
		//System.out.println("balance:" + balance);//private -not visible/erlaubt
		System.out.println("pin:" + pin);//protected -geht weil Vererbung
		//System.out.println("internalNote:" + internalNote);//private- package: nicht erglaubt weil anderes package
	}
}

