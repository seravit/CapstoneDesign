package study_sixthClass;

import java.util.Scanner;

public class ninthProblem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] kgb = {null, "����", "����", "��"}; // ������ ���ڿ� �����ϴ� ���ڸ� �����ϴ� �迭
		
		while(true) {
			
			System.out.print("ö��[����(1), ����(2), ��(3), ������(4)]>>");
		
			int select = scan.nextInt(); // ������ ������ ��
			
			if(select == 4) // 4���� ������
				break; // while�� Ż��
		
			if(1 <= select && select <=3) { // select�� 1, 2, 3�϶�
				
				int com = (int)(Math.random() * 3 + 1); // ���� com�� ���� 1���� 3������ ���� ����
				
				switch(select - com) { // ������ ������ �� - ��ǻ���� ����
				case -2: // ���� - ��
					System.out.println("ö��(" + kgb[select] + ") : ��ǻ��(" + kgb[com] + ")");
					System.out.println("ö���� �̰���ϴ�.");
					break;
				case -1: // ���� - ����, ���� - ��
					System.out.println("ö��(" + kgb[select] + ") : ��ǻ��(" + kgb[com] + ")");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				case 0: // ���
					System.out.println("ö��(" + kgb[select] + ") : ��ǻ��(" + kgb[com] + ")");
					System.out.println("�����ϴ�.");
					break;
				case 1: // �� - ����, ���� - ����
					System.out.println("ö��(" + kgb[select] + ") : ��ǻ��(" + kgb[com] + ")");
					System.out.println("ö���� �̰���ϴ�.");
					break;
				case 2: // �� - ����
					System.out.println("ö��(" + kgb[select] + ") : ��ǻ��(" + kgb[com] + ")");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				}
			}
			else
				System.out.println("1, 2, 3, 4 �߿��� ����ּ���"); // ������ 1~4 ���� ���� ���� ����������
		}
		scan.close();
	}
}
