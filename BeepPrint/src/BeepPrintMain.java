import java.awt.Toolkit;

public class BeepPrintMain {

	public static void main(String[] args) {
		int n=5;	//쓰레드한테 데이터를 보내는 방법
					//new BeepTask(n)해서 데이터를 보낼수 있다.
		Runnable bt = new BeepTask(n); // 인터페이스이름 변수 = new 구현클래스이름
		
		Thread thread = new Thread(bt);
		thread.start();//start() -> run()
		// TODO Auto-generated method stub

		for(int i=0; i<n; i++) {
			System.out.println(i);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}//메인프로그램이 끝나도 다른프로그램이 계속 도는 경우가 있다 Deamon은 목적이 있어 백그라운드에서 작업을 하는경우도 있다 하지만
	 //zombie프로그램은 잘못짠 프로그램에 프로그램은 종료되었지만 메모리와 코어를 반납안하고 계속 도는걸 말함 

}
