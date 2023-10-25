//import a.Aa;

public class Student {
	//접근제한자(Access Modifier)
	//-private(같은 패키지에 속했건 외부 패키지에 속했건 접급불가)
	//-public(private과는 정반대 프로젝트 전체 내에서 공유 가능)
	//-(default)(같은패키지 안에 다른 패키지만 접근가능)
	//-protected((ex)extends a 'a2는 a에서 상속 받은거다')같은 패키지는 접근가능+이 클래스를 상속받은 다른 클래스도 접근가능
	//private<default<protected<public 범위순
	//
//	School s1 = new School(); //같은 패키지 접근
//	Aa s2 = new Aa();//다른 패키지 접근
	private String name;
	private String mobile;
	private String birthday;
	private String schoolName;
	private int entryYear;
		
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getEntryYear() {
		return entryYear;
	}

	public void setEntryYear(int entryYear) {
		this.entryYear = entryYear;
	}

	public String getName() {
		return name;
	}

	void setName(String s) {//private 을 쓰면 완전 접근 불가
		this.name=s;
	}
}
