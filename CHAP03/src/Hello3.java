import java.util.Scanner; 
public class Hello3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sLine =new Scanner(System.in); //for String
		Scanner sNum =new Scanner(System.in);	//for Integer
		Scanner sFloat =new Scanner(System.in); //only for Float
		
		System.out.println("������� �������� �Է��Ͻÿ�");
		String str1=sLine.nextLine(); //"nextLine"�� Ű���� enter ������ �Է°��� ��ٸ��� ��ɾ�� 
		System.out.println(str1); //enter�� �Է½� Ÿ������ ���ڸ� str1�� �Էµǰ� �װ� �����
		System.out.println("������ ���ڷ� �Է��Ͻÿ�");
		int price = sNum.nextInt();//nextLine�� ������ import java.util.Scanner;�� �����
		System.out.println(price);
	
		sLine.close();
		sNum.close(); //close���� ������ �Ⱥ����� ������ �ȳ�
	}

}
