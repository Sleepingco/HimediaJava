import java.awt.Toolkit;

public class BeepTask implements Runnable { //다른 코어에서 실행될 쓰레드(클래스)
	private int limit;//isfj
	BeepTask(int x) {
		this.limit =x;
	}
	@Override
	public void run() { 
		// TODO Auto-generated method stub
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i=0; i<this.limit; i++) {
			tk.beep();
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}

}
