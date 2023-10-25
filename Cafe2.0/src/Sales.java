import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Sales {
	private ArrayList<String> alMobile;
	private ArrayList<String> alMenu;
	private ArrayList<Integer> alQty;
	private ArrayList<Integer> alSum;
	private ArrayList<String> alTime;
	private Scanner s1;
	
	
	Sales(){
		//reset
		this.alMobile=new ArrayList<String>();
		this.alMenu=new ArrayList<String>();
		this.alQty=new ArrayList<Integer>();
		this.alSum=new ArrayList<Integer>();
		this.alTime=new ArrayList<String>();
		
		this.s1=new Scanner(System.in);
	}
	void add(Order sOrder) { //mobile,menuname.qty,sum from order,time(yyyymmddhhmiss)//save in alTime
		//  Order<=클래스가 타입이 될수 있음 sOrder
		//ask mobile number
		if(sOrder.getSize()<1) return; //실행종료, 아래코드는 실행안함
			
		System.out.println("Input Mobile number for Membership");
		String mobileNum = s1.nextLine();
		if(mobileNum.equals("")) mobileNum="-";
		
		
		for(int i=0; i<sOrder.alName.size();i++) {
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:nn:ss");
			String Day =sdf.format(now);
			this.alMobile.add(mobileNum);
			this.alMenu.add(sOrder.getAlName(i));
			this.alQty.add(sOrder.getAlqty(i));
			this.alSum.add(sOrder.getAlSum(i));
			this.alTime.add(Day);
			
		}
	}
	void display(){
		//매출 데이터 전체 출력
		//매출 총액 계산&출력
		long total=0L;
		System.out.println();
		System.out.println("------------------------------------");
		for(int i=0; i<this.alMenu.size();i++) {
			System.out.printf("%-12s%-20s%-2d%-5d%-19s\n",
					this.alMobile.get(i),
					this.alMenu.get(i),
					this.alQty.get(i),
					this.alSum.get(i),
					this.alTime.get(i));
			total+=this.alSum.get(i);
		}
		System.out.println("Total sale:"+total+"won");
	}
}
