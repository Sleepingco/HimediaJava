

import java.util.Timer;
import java.util.TimerTask;

public class Countdown {
	
	//ī��Ʈ�ٿ��� ������ ���� ���� �ǽ�
	static int count = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[Ÿ�̸� Timer,TimerTask ����� �ǽð� ī��Ʈ�ٿ�(countdown) �� �ڵ����� �ǽ�]");		

		/*[�� ��]
		 * 1. Timer, TimerTast�� ����ؼ� ī��Ʈ�ٿ� ����� ������ �� �ֽ��ϴ�
		 * 2. timer.schedule - Ÿ�̸� �����ٷ� �۾� ���� �� �ݺ� �ð��� �����մϴ�
		 * 3. timer.cancle - Ÿ�̸� ������ �����մϴ�
		 */
		Timer timer=new Timer();
		TimerTask task=new TimerTask(){
		    @Override
		    public void run() {
		    //TODO Auto-generated method stub
				if(count <= 10){ //count���� 5���� �۰ų� ���������� ����
					System.out.println("[ī��Ʈ�ٿ� : "+count+"]");
					count++; //����Ƚ�� ���� 
				}
				else{
					timer.cancel(); //Ÿ�̸� ����
					System.out.println("[ī��Ʈ�ٿ� : ����]");
				}
		    }	
		};
		timer.schedule(task, 1000, 1000); //���� Task, 1�ʵ� ����, 1�ʸ��� �ݺ�
		
	}//���� ����

}//Ŭ���� ����