package study_fourthClass;

import java.util.Scanner;

class Day {
	private String work; // 하루의 할 일을 나타내는 문자열
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}

class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	
	Day[] day;
	
	public MonthSchedule(int x) { //생성자
		day = new Day[x]; //레퍼런스 생성
		
		for(int i = 0; i < day.length; i++) { //객체 생성
			day[i] = new Day();
		}
	}
	
	public void input() { //입력 기능
		System.out.print("날짜(1~30)?");
		int date = sc.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = sc.next();
		
		day[date-1].set(work);
	}
	
	public void view() { //보기 기능
		System.out.print("날짜(1~30)?");
		int date = sc.nextInt();
		System.out.print(date + "일의 할 일은 ");
		day[date-1].show();
	}
	
	public void finish() { //끝내기 기능
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() { //메뉴 출력과 처리
		boolean state = true;
		System.out.println("이번달 스케쥴 관리 프로그램.");
		
		while(state) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int todo = sc.nextInt();
			
			switch(todo) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				state = false;
				break;
			default:
				System.out.println("제시된 기능 중에서 선택해주세요.");
			}
		}
	}
}

public class seventhProblem {

	public static void main(String[] args) {
		
		MonthSchedule april = new MonthSchedule(30); //4월달의 할 일
		april.run();
		
	}

}
