package study_sixthClass;

import java.util.Scanner; // JDK�� Scanner Ŭ���� import

public class eighthProblem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Scanner ��ü ����
		
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		
		String str = scan.nextLine(); // �ٹٲޱ����� ���ڿ� str ������ �Է�
		
		for(int i = 0; i < str.length(); i++) { // ������ ���̸�ŭ �ݺ��ؾ� �� ���ھ� ȸ���ؼ� �� ������ ����
			
			String fir = str.substring(0, 1); // ù��° ����
			String rem = str.substring(1); // �ι�°���� �������� ���ڿ�
			
			str = rem + fir; // �ι�° ������ ���ڿ� �ڿ� ù��° ���ڸ� �ٿ��� ȸ����Ŵ
			
			System.out.println(str); // ȸ����Ų ���� ���
		}
		
		scan.close();
	}
}

/*
I Love You
*/