import java.util.Scanner;
public class sub2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rNum =new Scanner(System.in);
		 System.out.println("반지름을 입력하시요");
		 int r=rNum.nextInt();
		 
		 
		 float rnd = 2*3.14f*r;
		 float siz = r*3.14f*r;
		 float wsizs = 4/3*3.14f*r*r*r;
		 System.out.println("원의 둘례:"+rnd);
		 System.out.println("원의 면적:"+siz); //println에서는 자리수 지정이 불가함!!
		 System.out.println("구의 체적:"+wsizs);
		 

	}

}
