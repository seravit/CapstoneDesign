package study_seventhClass;

import java.util.*; // �ؽø�, ��ĳ��

public class thirdProblem {

	public static void main(String[] args) {
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)");
		
		String contry; // ���� �̸�
		int popul; // �α�
		
		while(true) { // "�׸�" �Է±��� �ݺ�
			System.out.print("���� �̸�, �α� >> ");
			
			contry = sc.next();
			
			if (contry.equals("�׸�")) { // �Էµ� ���ڿ��� "�׸�" �̶��
				break; // while�� Ż��
			}
			
			popul = sc.nextInt(); // �α��� �Է�
			
			nations.put(contry, popul); // �ؽøʿ� ����� �α��� ����
		}
		
		while(true) { // "�׸�" �Է±��� �ݺ�
			System.out.print("�α� �˻� >> ");
			
			contry = sc.next();
			
			if (contry.equals("�׸�")) { // �Էµ� ���ڿ��� "�׸�" �̶��
				break; // while�� Ż��
			}
			
			if (nations.get(contry) == null) { // �ؽøʿ� ����Ǿ��ִ� ���� ���ٸ�
				System.out.println(contry + " ����� �����ϴ�.");
			}
			else {
				System.out.println(contry + "�� �α��� " + nations.get(contry));
			}
			
		}
		
		sc.close();
	}

}

/*
Korea 5000
USA 1000000
�׸�

Korea
������
�׸�
*/