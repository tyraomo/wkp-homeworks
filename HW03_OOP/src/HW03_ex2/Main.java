package HW03_ex2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m1 = new Email();
		Message m2 = new SMS();

		System.out.println(m1.getType());
		System.out.println(m2.getType());

	}

}
