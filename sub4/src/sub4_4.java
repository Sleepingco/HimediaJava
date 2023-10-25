import java.util.Scanner;

public class sub4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
//		int a=0;
//		int b=1;
//		for(int c=a+b;c<1000;c=a+b) {
//			System.out.println(c);
//			a=b;
//			b=c;
//			
//		}
		
		
		
//		-------------------소수 구하는 코드--------------------------
//		
//		for(int i=4; i<10000; i++) {
//			int j;
//			for(j=2; j<=i-1; j++) {
//				if(i%j==0) break; 
//			}
//			//j로 나눠져서 break;
//			//j가 점점 증가해서 i와 같아져서 j<i가 거짓이 돼서 for를종료한 경우 => 소수로 판명
//			if(i==j) { //소수임을 확인하는 방법
//				System.out.println(i);
//			}
//		}
		
//		--------------------------------------------------
//		정렬 sorting 알고리즘
//		기준 인덱스
//		보조인덱스 for문 2개
//		
//		자리바꾸기 ;ar0=1, ar1=5
//		int temp =ar[0]
//		temp=ar[0]
//		ar[0]=ar[1]
//		ar[1]=temp
		
		
//		int[] ar= {10,5,13,7,2,4,6};
//		
//		
//		int temp;
//			for(int base=0;base<ar.length; base++) {
//				for(int start=base+1; start<ar.length; start++) {
//					if(ar[base]>ar[start]) {
//						temp = ar[base];
//						ar[base]=ar[start];
//						ar[start]=temp;
//						}
//					}
//				}
//			int ndx=0;						
//			while(ndx<ar.length) {
//				System.out.print(ar[ndx]+" ");
//				ndx++;
//			}
		
		
//		-----------------------------------------------
		
		
//		문자열==배열
//		문자열 추출
//		문자열.substring(시작인덱스,끝인덱스+1(끝인덱스 +1을 생략하면 ,문자열 끝까지 추출))
//		문자열.substring(시작인덱스[,끝인덱스+1])
//	String str="Hello world";
//	System.out.println("["+str.substring(5,10)+"]");
//	System.out.println("["+str.substring(5)+"]");
		
//		------------------------------------
//		문자열 뒤집기 hello world <=> dlrow olleh
//		문자열 길이 문자열.length()
		
//		String str="Hello world",str2="";
//		String str1=s.nextLine();
//			for(int i= str.length()-1;i>=0;i--) {
//				str2=str2+str.substring(i,i+1);
//			}	
		
//		==강사님코드
		
//			System.out.println(str2);
//			for(int i=0; i<str1.length();i++) {
//				str2=str1.substring(i,i+1)+str2;
//			}
//			System.out.println(str2);
	}
	

}
