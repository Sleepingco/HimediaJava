//�� ������
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
		System.out.println(f.equals(g));//true ���� �񱳴� a.equals(b), !a.equals(b)
		System.out.println(f.equals(f));
		
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b);//true a>b or a==b
		System.out.println(a<=b);//false a<b or a==b
		System.out.println(a==b);//false == , != �� ���ں񱳸� ��� �ڹٽ�ũ��Ʈ�� �ƴԴ�
		System.out.println(a!=b);//true ���� �񱳴� a.equals(b), !a.equals(b)
								 //���������� &&(and),||(or),(!)not 122p����	
		System.out.println("3����5��ũ��"+" "+(a>b)+" "+"7��7������ũ��"+(c>d)); 
		System.out.println("5����3��ũ��"+(a<b)+" "+"7��7�����۴�"+(c<d)); 
		System.out.println("5��3����ũ�ų�����"+(a>=b)+" "+"7��7��ũ�ų�����"+(c>=d));
		System.out.println("3��5����ũ�ų�����"+(a<=b)+" "+"7��7�����۰ų�����"+(c<=d));
		System.out.println("5��3������"+(a==b)+" "+"7��7������"+(c==d));
		System.out.println("5��3���ٸ���"+(a!=b)+" "+"7��7���ٸ���"+(c!=d));
		System.out.println(f+g);
		System.out.println(char1>char2);
//		System.out.println(f>g);
//		System.out.println(f>g);
		//���ڿ� 1.�������� ���� ������ �۴� 
		//ex)"a"<"b" "a"<"aa" 
		//"Hello"<"hello"
		//"Hello"<"Hello " 
		//"5">"15"
		//"Hello123">"Hello12"
		//"Hello world"<"Hello123"
		//" "<"   "
		//ASCII(American Standard Code for Information Interchange)�ڵ������ ������ ������
		//""<"����"<"0~9"<"A~Z"<"a~z"
		System.out.println(5%2);
		
		int n=3;
		int m=5;
		System.out.print("n=");
		System.out.println(n);
		
		System.out.println(m++*2+ ++n);
		System.out.println(m++*2+(++n));
		System.out.println(m+","+n);
		System.out.println(-13%5); //�������� �������� ��ȣ�� ����
		
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
//		System.out.println(5<=a<7); �Ʒ��� ���� ���� ���̳� ���� ������� ���������� ������ ���� �������
		System.out.println(a>=5 && a<7);
		
		/*
		 * 1.++n => 4 
		 * 2.���ϱ� 5*2=>10 
		 * 3.���ϱ� 10+4=>14 
		 * 4.��� 14 
		 * 5.m++ =>6
		 */	
		}

}