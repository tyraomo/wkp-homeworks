package external_audit;

import hw3_task1.Account;

public class ExternalAudit {

	public void access(Account acc) {
		System.out.println("owner:" + acc.owner);//works bc public
		//System.out.println("balance:" + acc.balance);//private -not visible
		//System.out.println("pin:" + acc.pin);//protected -kein Zugriff, anderes Package, keine Vererbung
		//System.out.println("internalNote:" + acc.internalNote);//private- package: nicht erglaubt weil anderes package
	}
}
