import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	Scanner i1 = new Scanner(System.in);
	Scanner s1 = new Scanner(System.in);
	// 주문내역 - 메뉴명, 수량, 합계금액
	ArrayList<String>alMenu;
	ArrayList<String>alQty;
	ArrayList<String>alSum;
	Order(){
		//alName, alQty, alSum 초기화
	}
	void add(Menu oMenu) {
		while(true) {
			oMenu.display();
			System.out.println("select a menu ['':exit]");
			String job=s1.nextLine();
			if(job.equals(""))break;
			int ndx = Integer.parseInt(job);
			if(ndx<0||ndx>=oMenu.alMenu.size()) continue;
	
			String menuName = oMenu.alMenu.get(ndx);
			int price = oMenu.alPrice.get(ndx);
			System.out.println("How many order you want?");
			int qty = i1.nextInt();
			if(qty<1) continue;
	
//		order.add(menuName,qty);
		//alName에 menuName추가
		//alQty에 qty 추가
		//alSum에 qty*price 추가
			System.out.println(menuName+" x"+qty+"=>"+(qty*price));
		}
	}
	void delete() {
		while(true) {
			//주문내역 출력
			//지울 주문번호 입력
			//삭제
		}
	}
	void display() {
		//주문 내역 출력
	}
}
