import java.util.Scanner;
public class sub2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rNum =new Scanner(System.in);
		 System.out.println("�������� �Է��Ͻÿ�");
		 int r=rNum.nextInt();
		 
		 
		 float rnd = 2*3.14f*r;
		 float siz = r*3.14f*r;
		 float wsizs = 4/3*3.14f*r*r*r;
		 System.out.println("���� �ѷ�:"+rnd);
		 System.out.println("���� ����:"+siz); //println������ �ڸ��� ������ �Ұ���!!
		 System.out.println("���� ü��:"+wsizs);
		 

	}

}