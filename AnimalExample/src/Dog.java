
public class Dog extends Animal {
	
	public Dog() {
		this.kind="강아지";
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println(this.kind+"=멍멍");
	}

}
