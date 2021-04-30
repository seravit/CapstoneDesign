package study_fourthClass;

import java.util.Scanner;

class Day {
	private String work; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}

class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	
	Day[] day;
	
	public MonthSchedule(int x) { //������
		day = new Day[x]; //���۷��� ����
		
		for(int i = 0; i < day.length; i++) { //��ü ����
			day[i] = new Day();
		}
	}
	
	public void input() { //�Է� ���
		System.out.print("��¥(1~30)?");
		int date = sc.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		String work = sc.next();
		
		day[date-1].set(work);
	}
	
	public void view() { //���� ���
		System.out.print("��¥(1~30)?");
		int date = sc.nextInt();
		System.out.print(date + "���� �� ���� ");
		day[date-1].show();
	}
	
	public void finish() { //������ ���
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void run() { //�޴� ��°� ó��
		boolean state = true;
		System.out.println("�̹��� ������ ���� ���α׷�.");
		
		while(state) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
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
				System.out.println("���õ� ��� �߿��� �������ּ���.");
			}
		}
	}
}

public class seventhProblem {

	public static void main(String[] args) {
		
		MonthSchedule april = new MonthSchedule(30); //4������ �� ��
		april.run();
		
	}

}
