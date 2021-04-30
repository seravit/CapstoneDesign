package study_sixthClass;

import java.util.Calendar; // JDK�� Calendar Ŭ���� import

public class fifthProblem {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); // Calendar ��ü ����
		
		int hour = now.get(Calendar.HOUR_OF_DAY); // 24�ð��� �ʿ��ϹǷ� HOUR_OF_DAY �ʵ� ���
		int min = now.get(Calendar.MINUTE);
		
		System.out.println("���� �ð��� " + hour + "�� " + min + "���Դϴ�."); // ���� �ð� ���
		
		if(5 <= hour && hour < 12) { // hour�� 5���� 11 ������ ���� ��
			System.out.println("Good Morning");
		}
		else if(12 <= hour && hour < 18) { // hour�� 12���� 17 ������ ���� ��
			System.out.println("Good Afternoon");
		}
		else if(18 <= hour && hour < 23) { // hour�� 18���� 22 ������ ���� ��
			System.out.println("Good Evening");
		}
		else {
			System.out.println("Good Night");
		}
	}
}
