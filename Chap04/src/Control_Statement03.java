
public class Control_Statement03 {
//	for,advanced for
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for문 안에서 선언한 i 는 for문 안에서만 동작함 for문이 끝나면 변수i를 반납함
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//		}
//		for(int i=10;i>0;i--) {
//			System.out.println(i);
//		}
//		문제는 변수를 for문 밖에 선언하면 항상 메모리를 잡아먹음 변수의 가용 범위 안에서 
//		변수를 선언하는걸 추천함
//		자바는 안쓰는 변수를 보관안하려고함 변수는 메모리를 차지하기 때문ㄴ
//		변수의 선언에 가용범위를 결정 짓는건 "{}" 다 n이 if안에 선언되었으므로
//		else에 n은 선언되지 않은 변수이다 if가 끝나는 순간 n은 삭제된.
//		int i=10;
//		int j=20;
//		if(i<20) {
//			int n;
//			n=i;
//			i=j;
//			j=n;
//		}else {
//			n=j;
//			j=i;
//			i=n;
//		}
//		-------------------------
		
		
//		for(int i=0; i<10; i++); //int i=0 //같은코드
//		System.out.println(i);	//while(i<10){
								//system.out.println(i);
								//i++;
//		int i=0;
//		while(true) {				for (int i=0;true;i++;) {
//			if (i>=10) break;		if(i>=10) break;
//			System.out.println(i);	System.out.println(i);
//			i++;
//			}						}
//				
//				

//		

//		Algorithm(알고리즘,문제해결방안/절차)
//		1. 1~100까지합
//		2. 변수선언
//		3. 누적합계용 변수 선언
//		4. 누적합계변수를 0으로 초기화
//		4. 변수가 1~100까지 변화
//		int sum=0;
//		for(int k=0;k<=100;k++) {
//			sum+=k;
//		}
		
		
//		--------------------------advanced for
		
		int [] score = {10,20,30,40,50,60,70,-1};
		
//		for(int i=0;i<score.length;i++) {
//			score[i]*=2;
//			System.out.println(score[i]);
//		}
		System.out.println("----------------");
		
		for(int x:score) {//향상된 for문은 x에 배열을 저장해 사본을 만들고 거기에 연산을한다
			x*=2;			//원래 값은 바뀌지 않는다
			System.out.println(x);	//향상된 for문은 index 0부터 끝자리까지 출력한다.
									//for(int i=0;i<score.length;i++) 을 대체함
		}							//하지만 위에 코드는 배열 원본을 바꾼다
		System.out.println("----------------");//즉 향상된 for문은 원본을 유지하고 값을 바꾼다
		for(int x:score) {						//주로 값을 읽을때 쓴다
			System.out.println(x);				//레거시 for는 create update delete할때 쓴다
		}
	}

}
