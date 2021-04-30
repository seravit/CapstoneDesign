package Ch_13;

import java.util.Calendar;
import javax.swing.*;
import java.awt.*;

class thread3 extends Thread { // ������ Ŭ������ ��ӹ޴� Ŭ����
	private JLabel jl; // ���̺� ����
	
	public thread3(JLabel jl) {
		this.jl = jl; // �ð��� ����� ���̺�
	}
	
	public void run() {
		while(true) { // ���ѹݺ�
			Calendar c = Calendar.getInstance(); // Ķ���� �ν��Ͻ� ��������
			int hour = c.get(Calendar.HOUR_OF_DAY); // ��
			int min = c.get(Calendar.MINUTE); // ��
			int sec = c.get(Calendar.SECOND); // ��
			
			String clock = Integer.toString(hour); // �ð� ���� ���ڿ��� ����
			clock = clock.concat(":"); // �ݷ� ���̱�
			clock = clock.concat(Integer.toString(min)); // �� ���� ���ڿ��� ���̱�
			clock = clock.concat(":"); // �ݷ� ���̱�
			clock = clock.concat(Integer.toString(sec)); // �� ���� ���ڿ��� ���̱�
			
			jl.setText(clock); // ���̺� ���ڿ� ��ġ
		}
	}
}

public class P_03 extends JFrame { // ���������� ���
	
	public P_03() {
		setTitle("������ �ð� �����");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ������ ����� ���α׷� ����
		
		Container c = getContentPane();	// ����Ʈ�� ��������
		c.setLayout(new FlowLayout()); // ����Ʈ�ҿ� �÷ο� ���̾ƿ� ����
		
		JLabel jl = new JLabel(); // ���̺� ��ü ����
		jl.setFont(new Font("Arial", Font.PLAIN, 50)); // ���̺� ��Ʈ ����
			// �ָ��� ��Ʈ, �⺻ ��Ÿ��, 50������
		
		thread3 th = new thread3(jl); // ���̺��� �����ϸ鼭 ������ ��ü ����
		
		c.add(jl); // ����Ʈ�ҿ� ���̺� �߰�
		th.start(); // ������ ����
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new P_03();
	}
}
