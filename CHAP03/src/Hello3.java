import java.util.Scanner; 
public class Hello3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sLine =new Scanner(System.in); //for String
		Scanner sNum =new Scanner(System.in);	//for Integer
		Scanner sFloat =new Scanner(System.in); //only for Float
		
		System.out.println("과목명을 영문으로 입력하시오");
		String str1=sLine.nextLine(); //"nextLine"은 키보드 enter 전까지 입력값을 기다리는 명령어다 
		System.out.println(str1); //enter를 입력시 타이핑한 문자를 str1에 입력되고 그걸 출력함
		System.out.println("점수를 숫자로 입력하시오");
		int price = sNum.nextInt();//nextLine을 쓸려면 import java.util.Scanner;을 써야함
		System.out.println(price);
	
		sLine.close();
		sNum.close(); //close문을 붙히든 안붙히든 에러는 안남
	}

}
