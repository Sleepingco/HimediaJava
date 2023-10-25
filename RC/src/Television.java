
public class Television implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("텔레비전을 켰습니다");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("텔레비전을 껐습니다");
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
			System.out.println("현재 텔레비전 볼륨: "+this.volume);
	}

}
