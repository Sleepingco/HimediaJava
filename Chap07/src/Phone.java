
public class Phone {//부모클래스,SuperClass,ParentClass
//	private String model;	//부모클래스가 Private이면 상속이 안된다.
	String model;			//상속을 전재로 코딩할거면 private쓰면 안됨
	String color;
	
	Phone(){
		
	}
	Phone(String m, String c){
		this.model=m;
		this.color=c;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
