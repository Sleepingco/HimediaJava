
import java.util.Scanner;

//for,while,do-while

public class Control_Statement02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while(비교/논리){
		//조건이 '참일 때, 실행문들
		//}
		Scanner i = new Scanner(System.in);
		
//		int a;
//		a=1;
//		
//		while(a<=10) { //거짓이되지않게끔 조건을 안 넣어주면 무한루프됨
//			System.out.println(a);
//			a++;		//변동부는 프로그램 맨 마지막에 쓰는걸 권장
//		}				//1.초기화 2.조건 3.변동부
//						//while문은 최소 0회 실행된다
//		System.out.println("Program Ended");
		
		
//		a=101;
//		while(a<=130) {
//			System.out.println(a);
//			a++;
//		}
//		System.out.println("Program Ended");
		
		
//		1~100까지 홀수
//		a=1;
//		while(a<100) {
//			System.out.println(a);
//			a+=2; //a=a+2;
//		}
//		System.out.println("Program Ended");
		
//		int g=0;
//		int total=0;
//		while(g<=100) {
//			total+=g; 	//위 아래 순서가 바뀌면  0~101까지 더한다
//			g++;		//왜냐하면 i가 100을 도달한 다음에 a++를 더한다 그러고
//						//101을 더한다음에 i가 101이라는 것을 인식 101도 더함
//			
//		}
//		System.out.println(total);
//		System.out.println("Program Ended");
//		
//		int i,j;
//		i=0;	//구구단을 작성할 수 있다
//		while(i<3) {
//			j=10;
//			while (j<13) {
//				System.out.println(i+","+j);
//				j++;
//			}
//			i++;
//		}
//		System.out.println("Program Ended");

//		------------------------------------------
		
//do=while문(일단 실행하고 조건 비교함)
//do {					while(비교/논리) {
//실행문들;//1회이상 실행		실행문들;	//0회 실행 이상
//}while(비교/논리);		}				
		
		int i1=0;
		while(i1<10) {
			System.out.println(i1);
			i1++;
		}
		
		System.out.println("-------------");
		i1=0;
		do {
			System.out.println(i1);
			i1++;
		}while(i1<10);
		
		
	}				

}
