
public class Anonymous {
	Person field;
	
	Anonymous(){
//		this.field = new Person1();
		this.field = new Person(){
		void work() {
			System.out.println("go to work");
		}
		@Override
		void wake() {
			System.out.println("wake up at 6am");
			work();
			}
		};
	}
}
