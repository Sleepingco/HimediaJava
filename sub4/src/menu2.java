import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class menu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i1 = new Scanner(System.in);
//		Scanner i2 = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
//		Scanner s2 = new Scanner(System.in);
		
		
		
		//컴퓨터 기능 4가지
		//C:reate
		//R:ead
		//U:pdate
		//D:elete
		//1.설명을출력("C:메뉴추가,R메뉴목록보기,U:메뉴수정,D:메뉴삭제,":프로그램 종료")
				//2.작업을 입력받는다(jpb)
		//3.while(!job.equals("")){
		//		if(job.equals("c")){
		//			while(!menu.equals("")) {
			/*				int price = i1.nextInt();
		
						alMenu.add(menu);
						alPrice.add(price);
		
						menu=s1.nextLine();
					} */
		//if(job.equals("r")){
		//4.System.out.println("------------------------------");
		/*  for(int i1=0; i<alMenu.size(); i++) {
			System.out.printf("%-15s %-4d\n",alMenu.get(i),alPrice.get(i));
		} */
		
		
		
//		ArrayList<String> alMenu = new ArrayList<String>();
//		ArrayList<Integer> alPrice = new ArrayList<Integer>();
//	
//		String menu=s1.nextLine();
//		while(!menu.equals("")) {
//			int price = i1.nextInt();
//			
//			alMenu.add(menu);
//			alPrice.add(price);
//			
//			menu=s1.nextLine();
//		}
//		System.out.println("------------------------------");
//		for(int i=0; i<alMenu.size(); i++) {
//			System.out.printf("%-15s %-4d\n",alMenu.get(i),alPrice.get(i));
//		}
//		s1.close();
//		s2.close();
		
//		while문은 아래 둘중하나로 써야한다 !!!!!!!!!!!!!!!!!!!!!!!!!
//		Strinf str=s.nextLine();				while(true){
//		while(!str.equals("")) {					String str = s.nextInt();
//			~~										if(str.equals("")) break;
//			str=s.nextLine//이게 없으면 무한반복		~~~~
//		}											}
		
		ArrayList<String> alMenu = new ArrayList<String>();
		ArrayList<Integer> alPrice = new ArrayList<Integer>();
		
		String filename ="c:\\Temp\\menu.txt";
		/*
		 * 1.file open 
		 * 2.한줄씩 읽는다 
		 * 3.한줄을 메뉴명과 가격으로 분리 "Latte,3000" ->["Latte","3000"]
		 * 4.ArrayList alMenu,alPrice에 추가한다(Buildup) 
		 * 5.읽을 줄이 없을 때까지 2로 돌아가서 반복한다
		 * 버퍼 라이터 리더 둘다 try안에 묶어야 한다
		 */
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
//				inFile=null; //파일닫기
				inFile.close(); //파일닫기
			}
			file=null; //파일객체 리셋
			System.out.println("Menu building successfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Cannot read menu");
		}
		
		System.out.println("Enter a job[c:addMenu, r:Display Menu, u:updateMenu, d:DeleteMenu");
		String job=s1.nextLine();
		
		//try
		//read menu
		while(!job.equals("")) {
			if(job.equals("c")) {
				System.out.println("Enter a menu name:['':End AddMunu]");
				String menu = s1.nextLine();
				while(!menu.equals("")) {
					System.out.println("Enter the price");
				int price = i1.nextInt();
			
				alMenu.add(menu);
				alPrice.add(price);
				
				System.out.println("Enter a menu name:['':End AddMunu]");
				menu=s1.nextLine();
				}
			}else if(job.equals("r")){
				System.out.println("------------------------------");
				for(int i=0; i<alMenu.size(); i++) {
					System.out.printf("%2d %-15s %-4d\n",i,alMenu.get(i),alPrice.get(i));
				}	
			}else if(job.equals("u")) {
				while(true) {
					// "enter a menu number"
					// read a menu number
					// if menu number < 0 then break
					
					// show "enter a menu name"
					// read a menu name
					// show "enter menu price"
					// read new price
					//alMenu.set(Menu Number,Menu Name)
					//alPrice.set("Menu Number,Menu Price)
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
//					if(menuNum<0) break;
//					if(menuNum>=alMenu.size()) break;
					
					System.out.println("enter a menu name");
					String menu=s1.nextLine();
					System.out.println("enter a menu price");
					int price=i1.nextInt();
						
					alMenu.set(menuNum,menu);
					alPrice.set(menuNum,price);
						
					
				}
				
			}else if(job.equals("d")) {
				while(true) {
					// show "enter a menu to be deleted."
					// red a menu number
					// if menu number < 0 then break
					
					// alMenu.remove(Menu Number)
					// alPrice.remove(Menu Number)
					// if remove n index lefted index move foward
					// ex)int[] ndx{1,2,3,4}
					//indexPosition	0 1 2 3
					// remove(2);
					// 				ndx{1,3,4}
					//indexPosition	    0 1 2
					// if insert index backward index
					// ex)int[] ndx{1,2,3,4}
					//indexPosition	0 1 2 3
					// x.insert(2,7);
					//		ndx {0,1,7,3,4}
					//indexPos	 0 1 2 3 4
					System.out.println("enter a menu to be deleted.");
					int menuNum = i1.nextInt();
					if(menuNum<0) break;
//					if(menuNum>=alMenu.size()) break; //방어적 코딩
					if(menuNum<0||menuNum>=alMenu.size()) {
						System.out.println();
						break;
					}
					alMenu.remove(menuNum);
					alPrice.remove(menuNum);
					
				}
			}//catch (Exception e)
			System.out.println("Enter a job[c:addMenu, r:Display Menu, u:updateMunu, d:DeleteMenu");
			job=s1.nextLine();
		}
		//alMenu, alPrice to file 데이터 보관
		try {
		// 기존 내용은 모두 리셋(clear)
		/*
		 * read mode 
		 * write mode (기존 내용 날린체 추가) 아주 주의가 필요함
		 * append mode (기존 내용 유지한체 추가)
		 * operating system
		 * s/w engineering
		 * data structure
		 * algorithm
		 */
		BufferedWriter bw = new BufferedWriter(new FileWriter(filename));//open
		for(int i=0; i<alMenu.size();i++) {//alMenu.size 마지막 값 만큼 i를 증가
			String sLine=alMenu.get(i)+","+alPrice.get(i);
			if(i!=alMenu.size()-1) {//마지막 메뉴는 줄바꿈을 안함 메뉴의 마지막 줄인지 체크
				sLine+="\n";
			}	
			bw.write(sLine);
		}
		s1.close();
		i1.close();
		bw.flush(); //main Memory -> Secondary Memory
		bw.close(); //file close
		System.out.println("Savd successfully.");
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("Menu Program terminated");
	}
}
