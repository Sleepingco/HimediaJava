//비교 연산자
public class hello5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5,b=3, c=7,d=7;
		String f="Hello";
		String g="hello";
		char char1 = 'a';
		char char2 = 'b';
		boolean res1 = (char1>char2);
		System.out.println(res1);
		System.out.println(char1>char2);
		System.out.println(f.equals(g));//true 문자 비교는 a.equals(b), !a.equals(b)
		System.out.println(f.equals(f));
		
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b);//true a>b or a==b
		System.out.println(a<=b);//false a<b or a==b
		System.out.println(a==b);//false == , != 은 숫자비교만 사용 자바스크립트는 아님다
		System.out.println(a!=b);//true 문자 비교는 a.equals(b), !a.equals(b)
								 //논린연산자 &&(and),||(or),(!)not 122p참고	
		System.out.println("3보다5가크다"+" "+(a>b)+" "+"7은7은보다크다"+(c>d)); 
		System.out.println("5보다3이크다"+(a<b)+" "+"7은7보다작다"+(c<d)); 
		System.out.println("5는3보다크거나같다"+(a>=b)+" "+"7은7과크거나같다"+(c>=d));
		System.out.println("3은5보다크거나같다"+(a<=b)+" "+"7은7보다작거나같다"+(c<=d));
		System.out.println("5와3은같다"+(a==b)+" "+"7과7은같다"+(c==d));
		System.out.println("5와3은다르다"+(a!=b)+" "+"7과7은다르다"+(c!=d));
		System.out.println(f+g);
		System.out.println(char1>char2);
//		System.out.println(f>g);
//		System.out.println(f>g);
		//문자열 1.사전에서 먼저 나오면 작다 
		//ex)"a"<"b" "a"<"aa" 
		//"Hello"<"hello"
		//"Hello"<"Hello " 
		//"5">"15"
		//"Hello123">"Hello12"
		//"Hello world"<"Hello123"
		//" "<"   "
		//ASCII(American Standard Code for Information Interchange)코드로인해 순서가 정해짐
		//""<"공백"<"0~9"<"A~Z"<"a~z"
		System.out.println(5%2);
		
		int n=3;
		int m=5;
		System.out.print("n=");
		System.out.println(n);
		
		System.out.println(m++*2+ ++n);
		System.out.println(m++*2+(++n));
		System.out.println(m+","+n);
		System.out.println(-13%5); //피제수와 나머지는 부호가 같다
		
		boolean q=true;
		boolean w=false;
		
		System.out.println(w&&w);
		System.out.println(w&&q);
		System.out.println(q&&w);
		System.out.println(q&&q);
		System.out.println(w||w);
		System.out.println(w||q);
		System.out.println(q||w);
		System.out.println(q||q);
//		System.out.println(5<=a<7); 아래랑 위는 같은 뜻이나 위에 방식으로 수식을쓰면 에러남 따로 써줘야함
		System.out.println(a>=5 && a<7);
		
		/*
		 * 1.++n => 4 
		 * 2.곱하기 5*2=>10 
		 * 3.더하기 10+4=>14 
		 * 4.출력 14 
		 * 5.m++ =>6
		 */	
		}

}
