
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CafeManeger {
	// .java->.class(중간언어코드)->기계어
	//		▲javac.exe   	   ▲jvm,jre
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i1 = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:nn:ss");
		String Day =sdf.format(now);
		System.out.println("now "+Day);
		
		Menu myMenu = new Menu(); 
		Sales sales = new Sales();
		
	while(true) {
		
		System.out.println("Select a job [m:Menu, o:Order, s:Sales]");
		String job=s1.nextLine();
		if(job.equals("")) break;
	
		if(job.equals("m")) {
			myMenu.control();
		}else if(job.equals("o")) {
			Order order = new Order();
			order.control(myMenu);
			//save order data to sales data
			sales.add(order);
		} else if(job.equals("s")) {
			
			sales.display();
		}
	}
		
		s1.close();
		i1.close();
		System.out.println("Program terminated");
	}
}