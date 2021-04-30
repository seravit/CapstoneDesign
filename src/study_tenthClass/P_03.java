package study_tenthClass;

import java.awt.*;
import javax.swing.*;

public class P_03 extends JFrame {
	
	public P_03() {
		
		setTitle("Ten Color Buttons Frame");
		setSize(1000, 500); // ������ ������ ���� 1000�ȼ�, ���� 500�ȼ�
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ������ ����� ���α׷� ����
		
		Container c = getContentPane(); // ����Ʈ�� ��������
		c.setLayout(new GridLayout(1, 10)); // 1x10 ���� �׸��� ���̾ƿ�
		
		for (int i = 0; i < 10; i++) {
			c.add(new JButton(i + "")); // i ������ ���ڷ� �νĽ�Ű�� ���
		}
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		P_03 f = new P_03();
		
	}

}
