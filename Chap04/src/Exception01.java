import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int i,j;
//		444~452p
//		I.RunTime Exception
//			1.NullPointer Exception
//			2.IndexOutOfBound Exception
//			3.NumberFrotmat Exception
//			4.classCast Exception
//			5.Arithmethic(산술에러)
//		try catch는 제어문 안에 넣는건 권장하지 않음
//		직렬로 쓸때는 범위가 확장되는 순서로 쓴다 범위가 작은거에서 큰거 순서
		
		do {
			i=s.nextInt();
			j=s.nextInt();
			try {
		
			System.out.println(i/j); //에러가 날 수 도 있는 중대한 코드만 넣는다
		
			}catch(Exception e) {
				
				System.out.println("j==0, cannot divide by zero");//사용자가 처리후 실행할 코드
				
				}
		}while (j==0);
		System.out.println("program terminated");
		s.close();
		
	}

}
