import java.util.Calendar;
public class weekClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		week today=null;
		Calendar cal = Calendar.getInstance(); //오늘 //오늘의 월일시간등 모든 데이터가 저장됨 Calendar 타입
		int Week=cal.get(Calendar.DAY_OF_WEEK);//오늘의 요일 //DAY_OF_WEEK는 요일정보를 숫자로 가지고 있음 1~7
		//1~7:일~토
		switch(Week){
		case 1: today=week.SUNDAY;break;
		case 2: today=week.MONDAY; break;
		case 3: today=week.TUESDAY; break;
		case 4: today=week.WEDNESDAY; break;
		case 5: today=week.THURSDAY; break;
		case 6: today=week.FRIDAY; break;
		case 7: today=week.SATURDAY; break;
		}
		System.out.println("Today' DOW:"+today); //today에는 열거값을 가져옴 ex)SUNDAY
		if(today==week.SUNDAY) { //열거 타입 이름 열가값 외워야함
			System.out.println("paly football");
		}else {
			System.out.println("work hard");
		}

	}

}
