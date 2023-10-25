import java.util.Scanner;
public class sub1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fNum =new Scanner(System.in); //Scanner 뒤에 글자는 변수이므로 임의로 설정가능
		Scanner sd =new Scanner(System.in);
		Scanner tn =new Scanner(System.in);
		Scanner fw =new Scanner(System.in);
		Scanner sw =new Scanner(System.in);
		
		//Scanner sLine =new Scanner(System.in); //for String
		//Scanner sNum =new Scanner(System.in);	//for Integer
		//Scanner sFloat =new Scanner(System.in); //only for Float
		
		String str1 = fw.nextLine(); //for String
		String str2 = sw.nextLine(); 
		int f = fNum.nextInt(); //for Integer
		float s = sd.nextFloat(); //only for Float
		int t = tn.nextInt();
		int sum=t+f;
//		System.out.println(f+s-t);
//		System.out.printf("%2.3f\n",f*s-t);
//		System.out.print(f+","+s+"\n"); //이런식으로 쓰면 f,s를 출력 가능
//		System.out.println((f+t)+","+(f*t)+","+(f/t)); //각 괄호안에 계산 출력 가능 printf는 (%d,변수) 이런식으로 문장에 형식을 맞춰야함
//		System.out.printf("%9d\n",f/s);
		System.out.printf("\t%o\n",f*t);
		System.out.printf("\t%d",sum);
		
		
		System.out.printf("%s\n",str1+" "+str1+" "+str1);
		System.out.printf("%s:%s\n",str1,str2);
		System.out.printf("%s:%d\n",str1,sum);//문자열이 중간에 들어가면 3+5를 했을때 35가 나옴
		System.out.printf("%s:%d\n",str1,sum);
		System.out.println(str1+":"+sum);
		
		

	}

}
