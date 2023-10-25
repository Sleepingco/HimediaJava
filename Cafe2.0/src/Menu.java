import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<String> alMenu;
	private ArrayList<Integer> alPrice;
	private String filename;
	private Scanner s1,i1;
	
	Menu(){
		this.alMenu = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
		
		this.s1 = new Scanner(System.in);
		this.i1 = new Scanner(System.in);
		this.load("c:\\Temp\\menu.txt");
		
	}
	public String getName(int n) {
		return this.alMenu.get(n);
	}
	public int getPrice(int n) {
		return this.alPrice.get(n);
	}
	void control() {
		while(true) {
			System.out.println("Enter a code[c:addMenu, r:Display Menu, u:updateMenu, d:DeleteMenu]");
			String job=this.s1.nextLine();
			if(job.equals("")) break;
		
			if(job.equals("c")) {
				this.add();
			}else if(job.equals("r")){
				this.display();
			}else if(job.equals("u")) {
				this.update();
			}else if(job.equals("d")) {
				this.delete();
			}
		}
		this.save();
	}
	void load(String fname) {
		this.filename=fname;
		try {
			File file = new File(filename);
			if(file.exists()) {
				
				BufferedReader inFile = new BufferedReader(new FileReader(file)); //open file
				String sLine=inFile.readLine(); 
				while(sLine !=null) {
					String[] ar=sLine.split(",");
					alMenu.add(ar[0]);
					alPrice.add(Integer.parseInt(ar[1]));//정수 타입을 맞추기 위해
					sLine=inFile.readLine();
				}
				inFile.close(); 
			}
			file=null; 
			System.out.println("Menu building successfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Cannot read menu");
		}
	}
	
	void save() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(this.filename));
			for(int i=0; i<alMenu.size();i++) {
				String sLine=alMenu.get(i)+","+alPrice.get(i);
				if(i!=alMenu.size()-1) {
					sLine+="\n";
				}	
				bw.write(sLine);
			}
			bw.flush();
			bw.close(); 
			System.out.println("Savd successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void add() {		
		System.out.println("Enter a menu name:['':End AddMenu]");
		String menu = this.s1.nextLine();
		while(!menu.equals("")) {
				
				System.out.println("Enter the price");
				int price = this.i1.nextInt();
			
				alMenu.add(menu);
				alPrice.add(price);
				
				System.out.println("Enter a menu name:['':End AddMenu]");
				menu=this.s1.nextLine();
				
			}
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
					menuNum = this.i1.nextInt();
				}catch(NumberFormatException e) {
					System.out.println("should input the number format.");
					continue;
				}
				if(menuNum<0||menuNum>=alMenu.size()) {
					System.out.println("Index if out of bound");
					break;
				}
				
				System.out.println("enter a menu name");
				String menu=this.s1.nextLine();
				System.out.println("enter a menu price");
				int price=this.i1.nextInt();
					
				alMenu.set(menuNum,menu);
				alPrice.set(menuNum,price);	
			}
			
		
	}
	void delete() {
		while(true) {
		System.out.println("enter a menu to be deleted.");
		int menuNum = this.i1.nextInt();
		if(menuNum<0) break;
		if(menuNum>=alMenu.size()) break; //방어적 코딩
		if(menuNum<0||menuNum>=alMenu.size()) {
			System.out.println();
			break;
		}
		alMenu.remove(menuNum);
		alPrice.remove(menuNum);
		}
	}
}