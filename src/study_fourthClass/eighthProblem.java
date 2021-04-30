package study_fourthClass;

import java.util.Scanner;

class Phone {
	String name;
	String tel;
	public Phone(String name, String tel) { //외부의 전달된 값으로 내부 필드의 상태값 덮어쓰기
		this.name = name;
		this.tel = tel;
	}
}

class PhoneBook {
	Scanner sc = new Scanner(System.in);
	
	String name;
	String tel;
	
	Phone[] p;
	
	public void run() {
		System.out.print("인원수>>");
		int peopleNumber = sc.nextInt();
		input(peopleNumber);
		search();
	}
	
	public void input(int x) {
		p = new Phone[x];
		
		for(int i = 0; i < p.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			
			name = sc.next();
			tel = sc.next();
			
			p[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}
	
	public void search() {
		boolean state = true;
		int i;
		
		while(state) {
			System.out.print("검색할 이름>>");
			name = sc.next();
			
			if(name.equals("그만"))
				return; //run()의 search();로 돌아감
			
			for(i = 0; i < p.length; i++) {
				if(name.equals(p[i].name)) {
					System.out.println(name + "의 번호는 " + p[i].tel);
					break; //i값을 유지하면서 for문 탈출
				}
			}
			if(i == p.length)
				System.out.println(name + "이 없습니다.");
		}
	}
}

public class eighthProblem {

	public static void main(String[] args) {
		PhoneBook p = new PhoneBook();
		p.run();
	}
}
