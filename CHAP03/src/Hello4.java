import java.util.Scanner; //ctrl+shift+o

//������ 103������
public class Hello4 {

	public static void main(String[] args) {
		Scanner g = new Scanner(System.in);
		// TODO Auto-generated method stub
		int p=10/4;		//����/����=���� ����/�Ǽ�=�Ǽ� �Ǽ��� ���ԵǸ� �Ǽ� ��� ����
		float q=10/4f;	//�Ǽ�/����=�Ǽ� �Ǽ�/�Ǽ�=�Ǽ� '='�� �����ʿ� ���� ���ʿ� �����ϴ� ���� ������
		float o=10/4;	//�ڿ� f�� �Ⱥ����� �������� ǥ�����
		float y=4;		//int a=5;
		y=q*y;			//a=a+1 = a+=1
						//a=a-1 = a-=1
						//a=a*2 = a*=2
						//a=a/2 = a/=2
						//a=a%2 = a%=2
		
		int a=5;
		a=a+1;
		System.out.println(a);
		a=-a;
		System.out.println(a);
		int s=5;
		s++;
		System.out.println(s);
		s=5;
		s+=2;
		System.out.println(s);
		System.out.printf("%d %4.2f %f\n",p,q,o);
		System.out.println(y);
		
		
		
		int z=2;
		//int z=�ڿ� ���ڸ� �߰� �����ν� �Է����� �ٲ�g.nextInt();
		int x=3+z;	//����+����
		System.out.println(x);
		
		String str1="hi"+z; //���ڿ�+����
		System.out.println(str1);
		
		str1=z+"hi"; //����+���ڿ�
		System.out.println(str1);
		
		str1="hi"+"world"; //����+����
		System.out.println(str1);
		
		System.out.println(2+3+4+""); //"9"
		System.out.println(""+2+3+4); //"234"
		
		System.out.println(3+5+2+"hi"); //���ڰ� ���ڿ� ���� ���������Ƿ� ���� ������ �����ϰ� ���ڿ��� ������
		System.out.println("hi"+3+5+2); //���ڿ��� ���ں��� ���� �����Ƿ� ���ڵڿ� ���ڸ� �״�� ������ (����x)
		System.out.println(""+3+5+2);	//�� ���ڿ� �ϳ��� �� �տ� �����Ƿ� �ڿ� '+'�� ���Ῥ���ڰ���						
										//������ ���� �ƿ� �ٸ� ����� ����
		System.out.println("�������"+(z+x)+"�Դϴ�");
		System.out.println("z+x="+(z+x)+"�Դϴ�");
		System.out.println(z+"+"+x+"="+(z+x)+"�Դϴ�"); //""�ȿ��� ���״�� ��� 
	}

}