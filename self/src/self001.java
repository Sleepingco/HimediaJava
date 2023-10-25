import java.util.Scanner;

public class self001 {

	public static void main(String[] args) {
		Scanner ii=new Scanner(System.in);
		// TODO Auto-generated method stub
//		1~원하는 수 덧셈
		System.out.println("원하는 수를 입력하세요");
		int n=ii.nextInt();
		int sum=0;
			if(n>0){
				for(int i=0;i<=n;i++) {
				sum+=i;
				}System.out.println(sum);
			}else {
				System.out.println("입력은 자연수 입니다");
			}
			ii.close();
			

	}

}
