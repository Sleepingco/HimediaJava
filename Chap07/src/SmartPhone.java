
public class SmartPhone extends Phone {//자식 클래스,Sub Class,Child Class
	SmartPhone(){//일반 생성자를 만들고 기본 생성자가 없으면 에러남 반드시 써야함
		
	}
//	SmartPhone(){
//		super("zflip3","gray")
//	}
	SmartPhone(String x,String y){
//		this();//다른생성자 호출코드
//		super();부모 생성자호출
		super(x,y);
//		this.model=x; 부모 생성자를 직접 쓸 수 도 있지만 
//		this.color=y; super를 써서 부모 생성자 호출해서 파라미터를 넣을 수 있다.
//					이런식으로 써서 자체 처리가 가능하다
//					근데 부모클래스를 고치면 자녀클래스도 고쳐야 하기 때문에 일을 2번해야함		
	}
//	오버라이딩(Overriding)상속에 개념
	public String getModel(){	//메소드의 재정의 
		return "["+this.model+"]";//부모의 것을 무시하고 OverRiding(재정의) 한다
	}								//같은 이름의 method가 부모,자식 클래스 간에 여러개
	//오버로딩은 선택가능 오버라이딩은 선택이 아니라 자식클래스 안에써만 써야한다 자식클래스 우선
										//업데이트할때 오버라이딩을 씀
	public String getColor(){
		return "["+super.getColor()+"]";//부모 메소드 호출: 부모의 메소드를 호출하고 그 위에 붙히는 형식
		//메소드1
		//메소드2//2메소드가 1메소드 호출하는 코드
		//this.메소드명();
		//부모메소드를 호출하려면super.메소드()
	}
	public String getColornModel() {//자식 클래스에서 메소드 생성하고 그안에서 부모 메소드 호출 가능
		return super.getModel()+","+this.color;//static,final에 관한 내용은 273p에 있음 나중에 책 꼭 보자
	}
}
