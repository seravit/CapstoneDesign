package study_seventhClass;

import java.util.*; // �ؽø�, ��ĳ��, ���ͷ�����, ��

public class seventhProblem {

	public static void main(String[] args) {
		
		HashMap<String, Double> student = new HashMap<String, Double>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̷����бݰ����ý����Դϴ�.");
		
		for (int i = 0; i < 5; i++) { // �ټ� �л��� �̸��� ���� �Է�
			System.out.print("�̸��� ����>> ");
			String name = sc.next();
			double score = sc.nextDouble();
			
			student.put(name, score); // �ؽøʿ� ����
		}
		
		System.out.print("���л� ���� ���� ���� �Է�>> ");
		double std = sc.nextDouble();
		
		Set<String> keys = student.keySet(); // ��� key�� ���� Set �÷��� ����
		Iterator<String> it = keys.iterator(); // Set�� �ִ� ��� key�� ������� �˻��ϴ� Iterator
		
		System.out.print("���л� ��� : ");
		
		while(it.hasNext()) { // while���� ��� ���� ���
			String name = it.next(); // ���� Ű. �л� �̸�
			Double score = student.get(name); // ���� �˾Ƴ���
			
			if(score > std) { // ������ ���������� ���ٸ� �̸� ���
				System.out.print(name + " ");
			}
		}
		
		sc.close();
	}

}

/*

������ 3.1
��Ż�� 2.4
�ְ��� 4.3
����� 3.9
����� 4.0

3.2

 */
