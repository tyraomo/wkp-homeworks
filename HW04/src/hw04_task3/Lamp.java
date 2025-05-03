package hw04_task3;

public class Lamp implements Dimmable, Switchable {

	private boolean on = false;
	private int brightness = 0;
	
	public Lamp() {
		this.on = false;
		this.brightness = 0;
	}
	
	@Override
	  public void turnOn() {
        this.on = true;
    }
	
	@Override
	 public void turnOff() {
		this.on = false;
		
	}
	
	@Override
	public boolean isOn() {
		return this.on;
	}
	
	@Override
	public void  setBrightness(int level) {
		if(on && level >= 0 && level <= MAX_BRIGHTNESS) {
			this.brightness = level;
		}
	}
	
	@Override
	public int getBrightness() {
		return this.brightness;
	}
}
