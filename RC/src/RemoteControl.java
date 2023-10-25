
public interface RemoteControl {
	public int MAX_VOLUME =10;
	public int MIN_VOLUME =0;
	
	public void turnOn();
	public void turnoff();
	public void setVolume(int Volume);
	
	static void changeBattery() {
		System.out.println("건전지를 교체했습니다");
	}
}
