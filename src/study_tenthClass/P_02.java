package study_tenthClass;

import java.awt.*; // awt ������Ʈ�� Ŭ���� ���� ��ü import
import javax.swing.*; // ���� ������Ʈ�� Ŭ���� ���� ��ü import

public class P_02 extends JFrame { // JFrame ���
	
	public P_02() { // �����ڿ��� ������ ��� ����
		
		setTitle("BorderLayout Practice"); // ������ Ÿ��Ʋ
		setSize(800, 400); // ������ ������ ���� 800�ȼ�, ���� 400�ȼ�
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ������ ����� ���α׷� ����
		
		Container c = getContentPane(); // �����ӿ��� ����Ʈ���� �⺻������ �����Ǿ�����, ����Ʈ�� ��������
		c.setLayout(new BorderLayout(5,7)); // ������Ʈ ������ ���� ���� 5�ȼ�, ���� ���� 7�ȼ�
		
		String[] btn = {"North", "West", "Center", "East", "South"}; // ��ư ���ڿ� �迭
		String[] dir = {BorderLayout.NORTH, BorderLayout.WEST,
				BorderLayout.CENTER, BorderLayout.EAST, BorderLayout.SOUTH}; // ���� �迭
		
		for (int i = 0; i < 5; i++) {
			c.add(new JButton(btn[i]), dir[i]); // ����Ʈ�ҿ� �ε������� dir ���⿡ btn ������ ��ư�� ����
		}
		
		setVisible(true); // �������� ���̵��� ����
	}
	
	public static void main(String[] args) {
		
		P_02 f = new P_02();
		
	}

}
