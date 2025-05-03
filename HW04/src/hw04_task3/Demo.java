package hw04_task3;

public class Demo {

	public static void main(String[] args) {
		
		Lamp lamp = new Lamp();
		
		lamp.turnOn(); // an
		lamp.setBrightness(80);//lvl 80
        lamp.dimToHalf();//halb
        
        System.out.println("Lampe Status(on?): " + lamp.isOn());
        System.out.println("Lampe Brighness: " + lamp.getBrightness());
	}

}
