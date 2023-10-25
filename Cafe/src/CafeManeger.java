
import java.util.Scanner;

public class CafeManeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i1 = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		
		Menu myMenu = new Menu("c:\\Temp\\menu.txt"); 
									//생성자(Constructor) //(2)자동호출
									//▲매개변수
									//없어도 된다.
									//생성자 이름: 클래스 이름과 동일
									//클래스명 인스턴스변수명 = new 클래스명();
									//주요기능: 초기화(Initialization) 필드초기화가 대부분
									//메소드의 일종
									//호출(1)명시적 호출 (2)자동호출
									//반환값이 없다(반환에 대한 코드가 전혀 없다)
									//매개변수를 사용할 수 있다(매개변수가 없는 생성자 =>기본생성자(default constructor)
									//생성자 오버로딩(매개변수의 갯수과 타입이 다른, 여러개의 생성자를 정의할 수 있다.)
										//매개변수의 갯수가 같은면 타입이 다르던가
										//아니고 매개변수의 타입들이 같으면 갯수가 다르던가
									//new 연산자가 사용될 때, 기술된 매개변의 갯수와 타입에 해당하는 매개변수가 정의된 생성자가 자동 호출된다
									//한 생성자가 다른 생성자를 호출할 수 있다.(단, 가장 먼저 호출해야 한다) this(매개변수1,..,매개변수n);
//	myMenu.load("c:\\Temp\\menu.txt"); //위에 생성자 매개변수가 없으면 쓸 수 있음
	while(true) {
		System.out.println("Select a job [m:Menu, o:Order, s:Sales");
		String sch = s1.nextLine();
		if(sch.equals("")) break;
		
		if(sch.equals("o")) {
			Order order = new Order();
			while(true){
				System.out.println("select an job [c:add Order, d:Delete an order, r:Dispalt Order, '':Exit");
				String oJob=s1.nextLine();
				if(oJob.equals(""))break;
				
				if(oJob.equals("c")) {
					order.add(myMenu);
				} else if(oJob.equals("d")) {
					order.delete();
				} else if(oJob.equals("r")) {
					order.display();
				}
			}
		
	} else if(sch.equals("m")) {
		while(true) {
			System.out.println("Enter a code[c:addMenu, r:Display Menu, u:updateMunu, d:DeleteMenu");
			String job=s1.nextLine();
			if(job.equals("")) break;
				if(job.equals("c")) {
					myMenu.add();
				}else if(job.equals("r")){
					myMenu.display();
				}else if(job.equals("u")) {
					myMenu.update();
				}else if(job.equals("d")) {
					myMenu.delete();
				}
			}
		}
		myMenu.save();
		s1.close();
		i1.close();
		}
	}
}