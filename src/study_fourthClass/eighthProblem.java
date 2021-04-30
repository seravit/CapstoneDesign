package study_fourthClass;

import java.util.Scanner;

class Phone {
	String name;
	String tel;
	public Phone(String name, String tel) { //�ܺ��� ���޵� ������ ���� �ʵ��� ���°� �����
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
		System.out.print("�ο���>>");
		int peopleNumber = sc.nextInt();
		input(peopleNumber);
		search();
	}
	
	public void input(int x) {
		p = new Phone[x];
		
		for(int i = 0; i < p.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�)>>");
			
			name = sc.next();
			tel = sc.next();
			
			p[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
	}
	
	public void search() {
		boolean state = true;
		int i;
		
		while(state) {
			System.out.print("�˻��� �̸�>>");
			name = sc.next();
			
			if(name.equals("�׸�"))
				return; //run()�� search();�� ���ư�
			
			for(i = 0; i < p.length; i++) {
				if(name.equals(p[i].name)) {
					System.out.println(name + "�� ��ȣ�� " + p[i].tel);
					break; //i���� �����ϸ鼭 for�� Ż��
				}
			}
			if(i == p.length)
				System.out.println(name + "�� �����ϴ�.");
		}
	}
}

public class eighthProblem {

	public static void main(String[] args) {
		PhoneBook p = new PhoneBook();
		p.run();
	}
}
