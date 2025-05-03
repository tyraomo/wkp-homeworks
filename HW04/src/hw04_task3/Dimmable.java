package hw04_task3;

public interface Dimmable {

	int MAX_BRIGHTNESS = 100;
	
	void setBrightness(int level);
    int getBrightness();
	
    //kw:DEFAULT - public not allowed
	default void dimToHalf() {
		
		setBrightness(MAX_BRIGHTNESS/2);
	}
	
}
