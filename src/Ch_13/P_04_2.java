package Ch_13;

import javax.swing.*;
import java.awt.*;

class thread4 extends Thread { // ������ Ŭ������ ��ӹ޴� Ŭ����
	private JLabel jl; // ���̺� ����
	int x = 10; // ���̺� ��ǥ�� �� ���� ����
	
	public thread4(JLabel jl) {
		this.jl = jl; // ���ڿ��� ����� ���̺�
	}
	
	public void run() {
		while(true) { // ���ѹݺ�
			if(x == 10)
				x += 5; // 15
			else
				x -= 5; // 10
			jl.setLocation(x + 100, x); // ���̺��� ������ �߾ӿ� ��ġ��Ű�� ���� x��ǥ�� 100 �߰�
		}
	}
}

public class P_04_2 extends JFrame {
	public P_04_2() {
		setTitle("�����ϴ� ���̺� �����");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane(); // ����Ʈ�� ��������
		JLabel jl = new JLabel("Vibrating Label"); // ���̺� ��ü ����
			// ���ڿ��� �ѱ��� ������ ������(�׸�� ����) ����� �ۼ�
		
		jl.setFont(new Font("Arial", Font.PLAIN, 30)); // ���̺� ��Ʈ ����
			// �ָ��� ��Ʈ, �⺻ ��Ÿ��, 30 ������
		c.add(jl); // ����Ʈ�ҿ� ���̺� �߰�
		
		thread4 th = new thread4(jl); // ���̺��� �����ϸ鼭 ������ ��ü ����
		th.start(); // ������ ����
	}
	
	public static void main(String[] args) {
		new P_04_2();
	}
}
