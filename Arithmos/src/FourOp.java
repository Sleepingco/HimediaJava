//오버로딩
public class FourOp {
	
	private int a;
	private int b;
	

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	void setA(String str1) {
		this.a=Integer.parseInt(str1);
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	void plus() {
		//a와 b를 더한 합을 출력 (a+b=x)
		System.out.println(this.a+"+"+this.b+"="+(this.a+this.b));
	}
	int plus(int x, int y) {
		return x+y;
	}
//	void plus(int x, int y) {
//			System.out.println(x+"+"+y+"="+(x+y));
//	}
	void minus() {
		//a-b
		System.out.println(this.a+"-"+this.b+"="+(this.a-this.b));
	}
	void minus(int x, int y) {
		System.out.println(x+"-"+y+"="+(x-y));
	}
	void minus(int x) {
		System.out.println(x+"-"+this.b+"="+(x-this.b));
	}
	void multiply() {
		//a*b
		System.out.println(this.a+"*"+this.b+"="+(this.a*this.b));
	}
	void divied() {
		//a/b
		try {
			System.out.println(this.a+"/"+this.b+"="+(this.a/this.b));
		}catch(Exception e) {
			System.out.println("cannot");
		}
		
	}
}
