import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<String> alName;	// 메뉴명 목록
	ArrayList<Integer> alPrice;	// 메뉴가격 목록
	
	Menu() {
		this.alName=new ArrayList<String>();
		this.alPrice=new ArrayList<Integer>();
		//	alName, alPrice 초기화 (Initialization)
		// "d:\\temp\\menu.txt"를 찾고 열어서 메뉴면/가격을 읽어들인다.
		File file = new File("d:\\temp\\menu.txt");
		
		try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) 
		{
			while (sc.hasNextLine()) {
				String line=sc.nextLine();
				String[] token=line.split(",");	// ["Americano","2500"]
				this.alName.add(token[0]);
				this.alPrice.add(Integer.parseInt(token[1]));
//                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
		}
	}
	private void save() {
		// alName,alPrice의 메뉴명과 가격을 menu.txt에 저장
		try {
			File file = new File("d:\\temp\\menu.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			PrintWriter writer = new PrintWriter(fw);
			for(int i=0; i<this.alName.size();i++) {
				writer.write(this.alName.get(i)+","+this.alPrice.get(i)+"\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void add(String name, int price) {
		this.alName.add(name);
		this.alPrice.add(price);
		// alName, alPrice에 name,price를 추가

	}
	void delete(int index) {
		this.alName.remove(index);
		this.alPrice.remove(index);
		// alName, alPrice 양쪽에서 index 번호를 가진 것을 제거
	}
	void update(int index, String name, int price) {
		this.alName.set(index, name);
		this.alPrice.set(index, price);
		// alName, alPrice 양쪽에서 index번호의 이름과 가격을 수정
	}
	String getName(int ndx) {
		return this.alName.get(ndx);
	}
	int getPrice(int ndx) {
		return this.alPrice.get(ndx);
	}
	void display() {
		for(int i=0; i<this.alName.size();i++) {
			System.out.println((i+1)+"."+this.alName.get(i)+", "+this.alPrice.get(i));
		}
		// 메뉴명과 가격을 표시
		/*
		 * Americano, 2500
		 * Moca, 3200
		 * Espresso, 2700
		 * Cappuccino, 3500
		 * Latte, 3000
		 */
	}
	void control() {
		Scanner s1 = new Scanner(System.in); // 문자열 입력전용
		Scanner s2 = new Scanner(System.in); // 숫자 입력전용
		
		while(true) {
			System.out.print("메뉴작업을 선택하시오 [c:추가,r:목록표시,u:수정,d:삭제,'':종료]:");
			String instr = s1.nextLine();
			if(instr.equals("")) {
				this.save();
			} else if(instr.equals("c")) {
				System.out.print("메뉴이름? ");
				String name=s1.nextLine();
				System.out.print("가격? ");
				int price=s2.nextInt();
				this.add(name, price);
			} else if(instr.equals("r")) {
				this.display();
			} else if(instr.equals("u")) {
				int ndx=s2.nextInt();
				String name=s1.nextLine();
				int price=s2.nextInt();
				this.update(ndx,name,price);
			} else if(instr.equals("d")) {
				int ndx=s2.nextInt();
				this.delete(ndx-1);
			}
		}
		
	} 
} 
