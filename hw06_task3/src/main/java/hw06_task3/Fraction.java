package hw06_task3;

public class Fraction {
	private int zaehler;
	private int nenner;

//icomplete
	public Fraction(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

//corrected
	public void kehrwert() {
		if(zaehler == 0) {
			throw new ArithmeticException("Nenner cannot be 0");
		}
		int temp = this.zaehler;
		this.zaehler = this.nenner;
		this.nenner = temp;
		
	}

//corrected
	public void multiplikation(Fraction a) {
		this.nenner *= a.nenner;
		this.zaehler *= a.zaehler;
	}

//corrected
	public void addition(Fraction a) {
		if (a.getNenner() != this.getNenner()) {
			int neuerNenner = this.getNenner() * a.getNenner();
			int neuerZaehler;

			neuerZaehler = a.getZaehler() * neuerNenner; //1*4
			this.setZaehler(this.getZaehler() + neuerZaehler); //1 +
		} else {
			this.setZaehler(this.getZaehler() + a.getZaehler());
		}
		kuerzen();
	}

//corrected
	public void kuerzen() {
		int ggt = ggt(Math.abs(zaehler), Math.abs(nenner));
		this.zaehler /= ggt;
		this.nenner /= ggt;
	}

//helper method Euklidian algorithm,
// here are no mistakes
	private int ggt(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	@Override
	public String toString() {
		return this.getZaehler() + "/" + this.getNenner();
	}

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}
}
