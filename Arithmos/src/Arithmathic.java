//오버로딩
public class Arithmathic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FourOp first = new FourOp();
		
		first.setA(10);
		first.setA("100");
		first.setB(5);
		
//		first.setB(0);
		//a와 b값을 지정
		//더하기
		//빼기
		//곱하기
		//나누기
		first.plus();
		first.plus(12,4);
		first.minus();
		first.multiply();
		first.divied();
	}

}
