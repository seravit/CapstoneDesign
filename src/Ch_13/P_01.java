package Ch_13;

import java.util.Scanner;
	
class MyThread implements Runnable { // Runnable �������̽��� ���
	public void run() {
		System.out.println("������ ���� ����");
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " "); // 1���� 10���� �ѹ��� ���
		}
		
		System.out.println("\n������ ����");
	} // ������ ����
}

public class P_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // ��ĳ��
		Thread th = new Thread(new MyThread()); // ������ ��ü ����
		
		System.out.print("�ƹ� Ű�� �Է�>> ");
		
		sc.nextLine(); // �ٳѱ�(enter)�� �Է��ϸ�
		th.start(); // ������ ����
	}
}
