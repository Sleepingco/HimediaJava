
public class RCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		Audio audio = new Audio();
		
		tv.turnOn();
		tv.setVolume(10);
		tv.turnoff();
		System.out.println("------------");
		RemoteControl.changeBattery();//스테틱으로 선언되었으므로 앞에 선언이 클래스 이름으로 선언됨
		
		audio.turnOn();
		audio.setVolume(2);
		audio.turnoff();
		
		RemoteControl rc1 = new Television();
		RemoteControl rc2 = new Audio();
		rc1 = tv;
		rc2 = audio;
		rc1.turnOn();
		rc1.turnoff();
		rc2.turnOn();
		rc2.turnoff();
	}

}
