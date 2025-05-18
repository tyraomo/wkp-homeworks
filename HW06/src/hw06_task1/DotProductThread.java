package hw06_task1;

public class DotProductThread extends Thread {

	private int[] v1;
	private int[] v2;
	private int dot;
	
	public DotProductThread(int[] v1, int[] v2) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.dot = 0;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < v1.length; i++) {
			dot += v1[i] * v2[i];
		}
	}
	
	//um auf Erg. zuzugreifen
	public int getDot() {
		return dot;
	}
}
