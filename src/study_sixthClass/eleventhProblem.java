package study_sixthClass;

import java.util.Scanner;

public class eleventhProblem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">>");
		
		String str = scan.nextLine(); // ������ ���ڿ� �Է¹ޱ�
		StringBuffer sb = new StringBuffer(str); // StringBuffer ��ü�� �Է¹��� str �����ϰ� ���� 
		
		while(true) { // "�׸�" �Է��Ҷ����� �ݺ�
			
			System.out.print("���: ");
			String order = scan.nextLine(); // ��� ���ڿ� �Է¹ޱ�
			
			if(order.equals("�׸�")) { // ����� "�׸�" �̶��
				System.out.println("�����մϴ�");
				break; // while�� Ż��
			}
			
			String[] texts = order.split("!"); // ��� ���ڿ��� !�� ������ ���� ���ڿ��� texts �迭�� ����
			int firstIndex = sb.indexOf(texts[0]);
				// sb ���ڿ����� texts[0]�� ���ڿ��� ���۵Ǵ� �ε��� ���� firstIndex�� ����
			
			if(texts.length != 2) { // texts �迭�� ������ 2���� �ƴ϶��
				System.out.println("�߸��� ����Դϴ�!");
			}
			else { // texts �迭�� ������ 2�����
				if(firstIndex == -1) { // firstIndex ���� -1 �̶�� sb ���ڿ��� texts[0]�� ���ٴ� �ǹ�
					System.out.println("ã�� �� �����ϴ�!");
				}
				else {
					sb.replace(firstIndex, firstIndex + texts[0].length(), texts[1]);
						// texts[0]���ڿ��� ���۵Ǵ� �������� �ش� ���ڿ��� ���̸�ŭ�� ���ڿ��� texts[1]�� ���ڿ��� ��ġ
					System.out.println(sb); // ��ġ�� sb ���ڿ� ���
				}
			}
		}
		
		scan.close();
	}
}

/* 
�츮�� love Java Programming.
�츮��!We
LOV!���
!Java
love!LOVE
�׸�
*/