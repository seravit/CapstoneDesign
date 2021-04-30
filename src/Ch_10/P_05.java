package Ch_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P_05 extends JFrame {
	JLabel jl; // JLabel ���� ���� ����
	
	public P_05() {
		setTitle("+, - Ű�� ��Ʈ ũ�� ����");
		setSize(500, 500);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jl = new JLabel("Love Java"); // JLabel ��ü ����
		
		jl.addKeyListener(new MKA()); // Ű �����ʸ� JLabel�� ����
		
		add(jl); // JLabel�� �����ӿ� �߰�
		
		setVisible(true);
		
		jl.requestFocus();
		jl.requestFocus(); // ��Ŀ���� �°ų� �ȸ°ų� �ϴ� ��찡 ����. �� ���� ���� �ʿ�
	}
	
	class MKA extends KeyAdapter { // Ű ����͸� ��ӹ޴� Ŭ����
		public void keyPressed(KeyEvent e) {
			Font f = jl.getFont(); // JLabel�� ��Ʈ ��ü ����
			int size = f.getSize(); // ��Ʈ ��ü�� ��Ʈ ������ ���� ����
			
			switch (e.getKeyChar()) {
			case '+': // �Է��� Ű�� + ���
				jl.setFont(new Font("Arial", Font.PLAIN, size + 5));
					// JLabel�� ��Ʈ�� Arial ��Ʈ, �⺻ ��Ÿ��, ������ + 5 �� ����
				break;
			case '-': // �Է��� Ű�� - ���
				if (size > 5) // ���� ũ�Ⱑ 5���� ũ�ٸ�
					jl.setFont(new Font("Arial", Font.PLAIN, size - 5));
						// JLabel�� ��Ʈ�� Arial ��Ʈ, �⺻ ��Ÿ��, ������ - 5 �� ����
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		new P_05();
		
	}

}
