import java.util.Scanner;

public class self001 {

	public static void main(String[] args) {
		Scanner ii=new Scanner(System.in);
		// TODO Auto-generated method stub
//		1~���ϴ� �� ����
		System.out.println("���ϴ� ���� �Է��ϼ���");
		int n=ii.nextInt();
		int sum=0;
			if(n>0){
				for(int i=0;i<=n;i++) {
				sum+=i;
				}System.out.println(sum);
			}else {
				System.out.println("�Է��� �ڿ��� �Դϴ�");
			}
			ii.close();
			

	}

}
