
public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuGuDan gugudan = new GuGuDan();
		
		for(int i=2;i<10;i++) {
			//출력메소드 호출
			gugudan.setDan(i);
			gugudan.showone2nine();
		}
		
	}

}
