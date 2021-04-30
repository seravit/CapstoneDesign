package Ch_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P_04 extends JFrame {
	String str = "Love Java"; // ���ڿ� ���� ���� ����
	JLabel jl; // JLabel ���� ���� ����
	
	public P_04() {
		
		setTitle("Left Ű�� ���ڿ� �̵�");
		setSize(500, 500);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jl = new JLabel(str); // str ���ڿ��� JLabel ��ü ����
		
		jl.addKeyListener(new MKA()); // Ű �����ʸ� JLabel�� ����
		jl.setFont(new Font("Arial", Font.PLAIN, 50)); // ���ڰ� �ʹ� �۾Ƽ� ���Ƿ� ũ�� ��
		
		add(jl); // JLabel�� �����ӿ� �߰�
		
		setVisible(true);
		
		jl.requestFocus();
		jl.requestFocus(); // ��Ŀ���� �°ų� �ȸ°ų� �ϴ� ��찡 �־� ��Ŀ���� �ι� �����. �� ���� ���� �ʿ�
	}
	
	class MKA extends KeyAdapter { // Ű ����͸� ��ӹ޴� Ŭ����
		public void keyPressed(KeyEvent e) { // Ű���尡 ���� ���, Ű ������ �޼ҵ�
			if(e.getKeyCode() == KeyEvent.VK_LEFT) { // ���� Ű�� ���� ����Ű���
				str = str.substring(1) + str.substring(0, 1);
					// ���ڿ��� ù��° ���ڿ� ������ ���ڿ��� ���� ���� �ݴ�� ����(������ ���ڿ� + ù��° ����) ���ڿ� ������ ����
				jl.setText(str); // JLabel�� ����� ���ڿ� ����
			}
		}
	}
	
	public static void main(String[] args) {
		
		new P_04();
		
	}

}
