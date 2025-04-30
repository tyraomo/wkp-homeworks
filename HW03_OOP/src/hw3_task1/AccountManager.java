package hw3_task1;

public class AccountManager {

	public void access(Account acc) {
		System.out.println("owner:" + acc.owner);//works bc public
		//System.out.println("balance:" + acc.balance);//private -not visible
		//System.out.println("pin:" + acc.pin);//protected -funktioniert nur bei inheritance 
		System.out.println("internalNote:" + acc.internalNote);//private- package: erlaubt im selben package
	}
}
