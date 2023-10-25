
public class Audio implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켭니다");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 끕니다");
	}

	@Override
	public void setVolume(int Volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if(volume<RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else
			this.volume = Volume;
		System.out.println("현대 오디오 볼륨: "+this.volume);
	}

}
