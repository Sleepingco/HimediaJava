
public class MobilityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스 이름은 대문자로 써야 한다.
		//캡슐화(encapsulization)
		//다형성(poly mophism)
		//상속(inheritance)
		//추상화(Abstraction)
//		Car seltos = new Car(); //실체(instance)생성 (메모리에 출현)
		Car car1 = new Car("white",4,180,0,"KIA","Nobless",1596);
			System.out.println(car1.getColor());
			System.out.println(car1.getWheelCount());
			System.out.println(car1.getMaxSpeed());
			System.out.println(car1.getSpeed());
			System.out.println(car1.getMaker());
			System.out.println(car1.getModelName());
			System.out.println(car1.getDisplacement());
			
			
//		seltos.color ="white";
//		seltos.setColor("white");//메소드는 괄호를 써야함
//		seltos.setWheelCount(4);
//		seltos.setMaxSpeed(180);
//		seltos.setSpeed(0);
//		seltos.setMaker("KIA");
//		seltos.setModelName("Nobless");
//		seltos.setDisplacement(1596);
		
		
		
//		System.out.println(seltos.getModelName()+" color "+seltos.getColor());//메소드는 괄호를 써야함
//		System.out.println(seltos.getModelName()+" wheel "+seltos.getWheelCount());
//		System.out.println(seltos.getModelName()+" maxSpeed "+seltos.getMaxSpeed());
//		System.out.println(seltos.getModelName()+" speed "+seltos.getSpeed());
//		System.out.println(seltos.getModelName()+" maker "+seltos.getMaker());
//		System.out.println(seltos.getModelName()+" modelName "+seltos.getModelName());
//		System.out.println(seltos.getModelName()+" displacement "+seltos.getDisplacement());
//		seltos.drive(80);
//		seltos.stop();
		
//		System.out.println("_____________________\n");
//		
//		Car avante = new Car(); //instance 변수
//		avante.setColor("silver");
//		avante.setWheelCount(4);
//		avante.setMaxSpeed(240);
//		avante.setSpeed(0);
//		avante.setMaker("Hyundai");
//		avante.setModelName("Avante N");
//		avante.setDisplacement(1496);
//		
//		System.out.println(avante.getModelName()+" Color"+avante.getColor());
//		System.out.println(avante.getModelName()+" wheel"+avante.getWheelCount());
//		System.out.println(avante.getModelName()+" maxSpeed"+avante.getMaxSpeed());
//		System.out.println(avante.getModelName()+" speed"+avante.getSpeed());
//		System.out.println(avante.getModelName()+" maker"+avante.getMaker());
//		System.out.println(avante.getModelName()+" modelName"+avante.getModelName());
//		System.out.println(avante.getModelName()+" displace ment"+avante.getDisplacement());
//		
//		avante.drive(120);
//		avante.stop();
	}
	
}