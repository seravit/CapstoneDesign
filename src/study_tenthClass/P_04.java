package study_tenthClass;

import java.awt.*;
import javax.swing.*;

public class P_04 extends JFrame {
	
	public P_04() {
		
		setTitle("Ten Color Buttons Frame");
		setSize(1000, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ������ ����� ���α׷� ����
		
		Container c = getContentPane(); // ����Ʈ�� ��������
		c.setLayout(new GridLayout(1, 10)); // 1x10 ���� �׸��� ���̾ƿ�
		
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
				Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY}; // �� ���� �迭
		
		for (int i = 0; i < 10; i++) {
			JButton btn = new JButton(i + ""); // �ε����� ���� ������ ��ư ��ü ����
			btn.setBackground(color[i]); // ��ư�� �� ����
			c.add(btn); // ��ư�� ����Ʈ�ҿ� �߰�
		}
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		P_04 f = new P_04();
		
	}

}
