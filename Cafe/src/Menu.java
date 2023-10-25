import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<String> alMenu;
	ArrayList<Integer> alPrice;
	Scanner i1 = new Scanner(System.in);
	Scanner s1 = new Scanner(System.in);
	String filename;
	Menu(){//생성자는 메소드의 일종이라 메소드 오버로딩과 같다
		this.alMenu = new ArrayList<String>();//main에 매개변수가 없으면 실행됨
		this.alPrice = new ArrayList<Integer>();
	}
	Menu(String fname){//생성자 초기화	//생성자 오버로딩 
//		this();	//다른 생성자 호출하는 메소드//다른 생성자 호출은 맨앞에 써야함
		this.filename=fname;
		this.alMenu = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
//		this.filename ="c:\\Temp\\menu.txt";
		this.load();//생성자 안에서 다른 생성자 호출 가능
	}
	void load(String fname) {//매소드 오버로딩
		this.filename=fname;
		this.load();
	}
	String load(int ndx) { //매소드 오버로딩은 타입 개수 순서중 하나가 달라야함
		return ""+ndx;
	}

	void load() {
//		String filename ="c:\\Temp\\menu.txt";
		try {
			File file = new File(filename);
			if(file.exists()) {
				
				BufferedReader inFile = new BufferedReader(new FileReader(file)); //open file
				String sLine=inFile.readLine(); //Latte,3000
				while(sLine !=null) {
					String[] ar=sLine.split(",");
					alMenu.add(ar[0]);
					alPrice.add(Integer.parseInt(ar[1]));//정수 타입을 맞추기 위해
					sLine=inFile.readLine();
				}
				inFile.close(); //파일닫기
			}
			file=null; //파일객체 리셋
			System.out.println("Menu building successfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Cannot read menu");
		}
	}
	
	void save() {
		try {
//			String filename ="c:\\Temp\\menu.txt";
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(this.filename));//open
			for(int i=0; i<alMenu.size();i++) {//alMenu.size 마지막 값 만큼 i를 증가
				String sLine=alMenu.get(i)+","+alPrice.get(i);
				if(i!=alMenu.size()-1) {//마지막 메뉴는 줄바꿈을 안함 메뉴의 마지막 줄인지 체크
					sLine+="\n";
				}	
				bw.write(sLine);
			}
			bw.flush(); //main Memory -> Secondary Memory
			bw.close(); //file close
			System.out.println("Savd successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void add() {		
		while(true) {
				System.out.println("Enter a menu name:['':End AddMenu]");
				String menu = s1.nextLine();
				System.out.println("Enter the price");
				int price = i1.nextInt();
			
				alMenu.add(menu);
				alPrice.add(price);
				
				System.out.println("Enter a menu name:['':End AddMenu]");
				menu=s1.nextLine();
				if(!menu.equals(""));break;
			}
			
//		=========same function======
//			System.out.println("Enter a menu name:['':End AddMenu]");
//			String menu = s1.nextLine();
//			while(!menu.equals(""));{
//				System.out.println("Enter the price");
//				int price = i1.nextInt();
//		
//				alMenu.add(menu);
//				alPrice.add(price);
//			
//				System.out.println("Enter a menu name:['':End AddMenu]");
//				menu=s1.nextLine();
//			}
		}
	
	void display(){
			System.out.println("------------------------------");
			for(int i=0; i<alMenu.size(); i++) {
				System.out.printf("%2d %-15s %-4d\n",i,alMenu.get(i),alPrice.get(i));
			}
		}
	void update(){
			while(true) {
				
				System.out.println("enter a menu number[negative number:End AddMenu]");
				int menuNum;
				try {
					menuNum = i1.nextInt();
				}catch(NumberFormatException e) {
					System.out.println("should input the number format.");
					continue;
				}
				if(menuNum<0||menuNum>=alMenu.size()) {
					System.out.println("Index if out of bound");
					break;
				}
				
				System.out.println("enter a menu name");
				String menu=s1.nextLine();
				System.out.println("enter a menu price");
				int price=i1.nextInt();
					
				alMenu.set(menuNum,menu);
				alPrice.set(menuNum,price);	
			}
			
		
	}
	void delete() {
		while(true) {
		System.out.println("enter a menu to be deleted.");
		int menuNum = i1.nextInt();
		if(menuNum<0) break;
//		if(menuNum>=alMenu.size()) break; //방어적 코딩
		if(menuNum<0||menuNum>=alMenu.size()) {
			System.out.println();
			break;
		}
		alMenu.remove(menuNum);
		alPrice.remove(menuNum);
		}
	}
}