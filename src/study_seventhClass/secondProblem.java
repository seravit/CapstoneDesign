package study_seventhClass;

import java.util.*; // ��ĳ��, ��̸���Ʈ

public class secondProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> al = new ArrayList<Character>();
		
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>> ");
		
		for (int i = 0; i < 6; i++) {
			char grade = sc.next().charAt(0);
				// �Է¹��� ���ڿ��� 0��° �ε��� ���ڸ� grade�� ����
				// ���� ���ڸ� �Է¹������� charAt() �޼ҵ� �ʿ�
			al.add(grade); // 6���� ���� ���ڸ� al�� ����
		}
		
		sc.close(); // �Է��� �������Ƿ� close()
		
		double score = 0; // ���� ����
		
		for (int i = 0; i < al.size(); i++) {
			switch(al.get(i)) { // al�� i��° �ε����� ���
			case'A':
				score += 4.0;
				break;
			case'B':
				score += 3.0;
				break;
			case'C':
				score += 2.0;
				break;
			case'D':
				score += 1.0;
				break;
			case'F':
				score += 0;
				break;
			}
		}
		
		double average = score / al.size(); // ����� (����  / ����� ����)
		System.out.println(average);
	}

}

/*

A C A B F D

 */