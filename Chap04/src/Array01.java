import java.util.ArrayList;
import java.util.Scanner;
public class Array01 {
	//배열 인덱스 array arraylist
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i=new Scanner(System.in);
//		배열(Array)
//		int[] mscore; int mscore[];//배열선언 
//		null은 아무것도 없는 값으로 만드느게 null 0과는 다른개념		
//		int mscore[]= {80,96,100,76,36,88};//길이와 값으로 초기화
//		int mscore[]=null;//완전 초기화
//		int mscore[]=new int[6];//길이로만 (초기값없이) 배열 선언
//		int[] mscore= {80,96,100,76,36,88};//길이와 값으로 초기화 교재에 많이 나오는 예제
//		int[] mscore=null;//완전 초기화
//		int[] mscore=new int[6];//길이로만 (초기값없이) 배열 선언
//		int[] mscore= {80,96,100,76,36,88}; //인덱스는 0부터 시작함 길이가 6이면 마지막 인덱스 번호는 6-1==5
//		int escore[]= {70,90,80,40,20,50,30};
		
//		mscore[0]=48; 인덱스 위체에 값을 바꿈
//		mscore[1]=78;
//		mscore[2]=98;
//		mscore[3]=1;
//		System.out.println(mscore[0]);
//		System.out.println(mscore[1]);
//		System.out.println(mscore[2]);
//		System.out.println(mscore[3]);
//		System.out.println(mscore[4]);
//		System.out.println(mscore[5]);
		
//		int ndx=0;						//인덱스 값을 반복문으로 바꿔서 출력할수 있음
//		while(ndx<mscore.length) {
//			System.out.println(mscore[ndx]);
//			ndx++;
//		}
		
//		int ndx =0;
//		System.out.println(mscore[ndx]); //index값을 변수로 바꿔서도 표현가능
//		ndx++;
//		System.out.println(mscore[ndx]);
//		ndx++;
//		System.out.println(mscore[ndx]);
//		ndx++;
//		System.out.println(mscore[ndx]);
//		ndx++;
//		System.out.println(mscore[ndx]);
//		ndx++;
//		System.out.println(mscore[ndx]);
//		ndx++;
		
//		System.out.println("mscore의 길이"+mscore.length); //배열의 길이를 알아낼때 배열이름.length을 쓴다
//		System.out.println("escore의 길이"+escore.length);
		
		
		
		

		
//		int escore[]= {11,22,33,44,55,66,77};
//		int mscore[]= {11,22,33,44,55,66,77};
//		int ndx=0;
//		while(ndx<escore.length) {
//			System.out.println(escore[ndx]);
//			ndx++;
//		}
//		ndx=0;
//		while(ndx<mscore.length) {
//			System.out.println(mscore[ndx]);
//			ndx++;
//		}
		
	//내가 입력한 값을 인덱스에 원소로 저장하는 코드
//		int sscore[]= new int[5];
//		int ndx=0;
//		while(ndx<sscore.length) {
//			sscore[ndx]=ii.nextInt();
//			ndx++;
//		}
//		System.out.println("----------------");
//		ndx=0;
//		while(ndx<sscore.length) {
//			System.out.println(sscore[ndx]);
//			ndx++;
//		}
		
//		arrayList 가변길이
//		ArryList mscore
//		타입 이름을 쓸때 전부써줘야함 558p
		ArrayList<Integer> alMath = new ArrayList<Integer>();
		ArrayList<String> strNames;
		ArrayList<Double> Doubles;
		int score=i.nextInt();
		while(score>-1) {	//스코어가 마이너스 1 보다 큰동안
			alMath.add(score);//인덱스에 게체를 추가
			score=i.nextInt();//입력을 받음
		}
		//배열의 길이:배열명.length
		//배열리스트의 길이: 배열리스트명.size()
		System.out.println("__________________");//스코어가 -1이 입력되면
		int ndx=0;//ndx를 0으로 초기화 하고
		while(ndx<alMath.size()) { //ndx가 배열리스트의 길이보다 작은동안
			System.out.println(alMath.get(ndx));
			ndx++;
			
		}
	}

}
