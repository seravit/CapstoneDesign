package study_seventhClass;

import java.util.*; // ����, ��ĳ��

public class fourthProblem {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 0�� �Էµɶ����� �ݺ�
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			int rain = sc.nextInt();
			
			if (rain == 0)
				break; // while�� Ż��
			
			v.add(rain); // ���Ϳ� ������ ����
			
			int sum = 0; // ��հ��� ���ϱ� ���� ���հ�
			
			for (int i = 0; i < v.size(); i++) { // ���Ϳ� ��� ��� ���
				System.out.print(v.get(i) + " ");
				sum += v.get(i); // ���հ� ������ i �ε����� ��� ���ϱ�
			}
			
			System.out.println("\n���� ��� " + sum / v.size()); // ����� (���հ�  / ����� ����)
		}
		
		sc.close();
	}

}
/*
5
80
53
22
0

*/