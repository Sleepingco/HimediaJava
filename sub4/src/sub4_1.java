import java.util.Scanner;
public class sub4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		
		
//		String s1=s.nextLine();
//		int i1=i.nextInt();
//		int i2=i.nextInt();
//		if(i==100) {
//			System.out.println("100이 입력됐습니다.");
//		}else {
//			System.out.println("100이 아닌 숫자입니다"+i1);
//		}
//		i.close(); 
		
//		System.out.println("Program ended");
//	}
//		if(i1>50) {
//			System.out.println("50보다 크다"+"  "+" 나머지는= "+i1%7);
//		}else{
//			System.out.println("50보다 작거나 같다"+" 나머지는= "+i1%5);
//		}
//		i.close(); 
//		System.out.println("Program ended");

//		if(i1>i2) {
//			System.out.println(i1+"\ti1 is greater than i2");
//		}else {
//			System.out.println(i2+"\ti2 is greater or equal to i1");
//		}
//		i.close(); 
//		System.out.println("Program ended");
//
		
		
//		
// if(조건1){
//		조건1이 참일때 실행문둘
//	}else if(조건2) {
//		조건2가 참일때 실행문들
//	}else if(조건3) {
//		조건3이 참일때 실행문들
//	}else{
//		위의 모든 조건이 거짓일 때 실행문들
//	}
//		if(i1==100) {
//			System.out.println("100이 입력됐습니다.");
//		}else if(i1==90){
//			System.out.println("90이 입력됐습니다");
//			}else if(i1==80) {
//				System.out.println("80이 입력됐습니다");
//			}else {
//				System.out.println("모든 사항에 해당하지 않는 숫자입니다 ["+i1+"]");
//			} 
//		System.out.println("Program ended");
		
		
		
//		if(i1>100) {
//			System.out.println("잘못입력했습니다.");
//			}else if(i1==100) {
//				System.out.println("A+");
//			}else if(i1>=90) {
//				System.out.println("A");
//			}else if(i1>=80) {
//				System.out.println("B");
//			}else if (i1>=70) {
//				System.out.println("C");
//			}else if (i1>=60) {
//				System.out.println("D");
//			}else {
//				System.out.println("F");
//			}
//			if(s1.equals("Hello")) { //if(!s1.equals("Hello")) 낫이라는 뜻
//				System.out.println(s1+" World");
//			}else if(s1.equals("Good")) {
//				System.out.println(s1+" Morning Vetnam");
//			}else if(s1.equals("Bye")) {
//				System.out.println("Good"+s1+" Las vegas");
//			}else if(s1.equals("Star")) {
//				System.out.println(s1+" Wars");
//			}else {
//				System.out.println("I don't know");
//			}
//			switch(s1) {
//			case "hello": //case:는 break;가 없으면 뒤에 코드까지 계속 실행함
//				System.out.println(s1+" World");
//				break;
//			case "good":
//				System.out.println(s1+" Morning Vetnam");
//				break;
//			case "bye":
//				System.out.println("Good"+s1+" Las vegas");
//				break;
//			case "star":
//				System.out.println(s1+" Wars");
//				break;
//				default:
//					System.out.println("I don't know");
//			
//			}
//		System.out.println("Program ended");
		
		
//		int num=(int)(Math.random()*6)+1;
//		switch(num) {
//		case 1:
//			System.out.println("first");
//			break;
//		case 2:
//			System.out.println("second");
//			break;
//		case 3:
//			System.out.println("third");
//			break;
//		case 4:
//			System.out.println("fourth");
//			break;
//		case 5:
//			System.out.println("fifth");
//			break;
//		default:
//			System.out.println(num+"6이 나왔습니다");
//		}
//		if(num==1) {
//			System.out.println("first");
//		}else if(num==2) {
//			System.out.println("second");
//		}else if(num==3) {
//			System.out.println("third");
//		}else if(num==4) {
//			System.out.println("fourth");
//		}else if (num==5) {
//			System.out.println("fifth");
//		}else {
//			System.out.println(num);
//		}
//		
//			
//			s.close(); 
//			i.close(); 
//			System.out.println("Program ended");
		
//		
//		
//		int i1=i.nextInt();
//		
//		if (i1>50&&i1<100) { //복합연산자 두개의 조건이 참인경우에 출력된다 51~99
//			System.out.println("50과 100사이의 숫자입니다");
//		}else {
//			System.out.println("범위밖의 숫자입니다");
//		}
//		System.out.println("Program ended");
		
		int i1=i.nextInt();
		int i2=i.nextInt();
		
		if(i1>10||i2<10) {
			System.out.println("'i1'이 10보다 크거나 'i2'가 10보다 작다");
		}else if(i1<10&&i2<10) {
			System.out.println("'i1'이 10보다 크지않고 'i2'가 10보다 작다");
		}else {
			System.out.println("해당사항없음");
		}
		System.out.println("Program ended");
	}	
}
