
public class Hello2 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		 드래그 ctrl + / 는 주석처리
//		int a=14;
//		float f=2.75f;
//		float result=a+f;
//		System.out.println(result);
//		
//		  String x1="Hello "; //문자열에는 ' 를 쓰면 안됨 
//		  String x2="Nihao";
//		  String x3=x1+x2;
//		  System.out.println(x3);
//		 
//		  boolean bFact = true; 
//		  String sFact = "true";
//		  System.out.println(bFact);
//		  System.out.println(sFact);
//		  
//		  int i = 66; char c = (char)i; 
//		  System.out.println(c);
		
//		 double doublev=4.1;
//		 int i=(int)doublev;
//		 System.out.println(i);
//		 
//		  byte v=126; 
//		  byte b=100; 
//		  byte n=(byte)(v*b); System.out.println(n);
//		 
//		
//		String str1 = "128";
//		int nStr = Integer.parseInt(str1);
//		int x = nStr*3;
//		System.out.println(x); //parse는 훑어본다는 뜻 83p 페이지 참고
//		
//		System.out.println("good"); 
//		System.out.println("Morning");
//		System.out.print("Vietnam \n"); //System.out.println("Vietnam"); 이랑 같음
//		System.out.print("Hello "); //System.out.print("줄바꿈없이 문자를 그대로 출력")
//		System.out.print("world");
//		System.out.print("world \\n"); // "\n"을 출력하고 싶을때는 \\n을 쓰면됨
//		
		
//		System.out.println("\nGood "); //println(\n) = print("\n \n")을 사용하면 한번더 줄을 바꾼다. 
//		System.out.print("\nMorning");
//		System.out.print("\nVietnam");
//		System.out.print("\nHello ");
//		System.out.print("\nWorld");
		int a1=100;
		int a2=1000;
		int a3=1000000;
		System.out.printf("%-7d\n", a1); //-가 붙으면 왼쪽정렬 그냥 쓰면 오른쪽 정렬
		System.out.printf("%7d\n", a2);	//91p 참조
		System.out.printf("%7d\n", a3); //d는 정수 타입에 쓰는거  byte, short, char, int, long
		
		float b1=3.14f;
		float b2=128.357f;
		float b3=1024.3756f;
		
//		System.out.printf("%9.4f\n",b1);
//		System.out.printf("%9.4f\n",b2); //전체 자리( 소수점 포함) 9수 , 소수점 4자리 %9.4f
//		System.out.printf("%9.3f\n",b3); // 소수점 자리가 부족하면 뒤에 숫자 반올림
		
		String s1="Hello";
		String s2="Bon jour";
		String s3="commnet allez vu";
		
		System.out.printf("%-20s\t%d\t%4.2f\n",s1,a1,b1);
		System.out.printf("%-20s\n",s2);
		System.out.printf("%-20s\n",s3);
		
		int n = 012; //8진수는 앞에 0을 붙이고 10진수는 그냥 16진수는 0x를 붙힘
		System.out.printf("%x\n",n);
		
		n=012;
		System.out.println(n);
		System.out.printf("%x\n",n); //16진수
		System.out.printf("%d\n",n); //10진수
		System.out.printf("%o\n",n); //8진수
	}

}
