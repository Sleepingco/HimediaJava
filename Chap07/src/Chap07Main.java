
public class Chap07Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone galaxy = new SmartPhone("Z flip II", "magenta");
		//아래 코드 대신에 직접 데이터를 넣어서 출력함
//		galaxy.model="Z flip";
//		galaxy.color="Black";
//		
//		galaxy.setModel("Z flip");
//		galaxy.setColor("black");
		
		System.out.println("Model : "+galaxy.getModel());
		System.out.println("Color : "+galaxy.getColor());
	
		Phone anycall = new Phone();
		
		anycall.model="AnyCall II";
		
	}

}
