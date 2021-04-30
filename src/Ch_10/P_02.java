package Ch_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P_02 extends JFrame {
	Container c = getContentPane(); // ����Ʈ�� ��������
	
	public P_02() { // ������
		setTitle("�巡�뵿�� YELLOW");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ������ ����� ���α׷� ����
		
		MMA mma = new MMA(); // ���콺 ����� ��ü ����
		
		c.setLayout(new FlowLayout()); // ���̾ƿ� ����
		c.setBackground(Color.GREEN); // ����Ʈ���� �ʱ� ������ �ʷϻ�
		c.addMouseMotionListener(mma); // �巡�׸� �ν��ϱ����� ���콺��Ǹ����ʸ� ����Ʈ�ҿ� ����
		c.addMouseListener(mma); // ����� �ν��ϱ����� ���콺�����ʸ� ����Ʈ�ҿ� ����
		
		setVisible(true); // �������� ���̵��� ����
	}
	
	class MMA extends MouseAdapter { // ���콺����͸� ��ӹ޴� Ŭ����
		public void mouseDragged(MouseEvent e) { // �巡�� �ϰ��ִ� ���
			c.setBackground(Color.YELLOW); // ����Ʈ���� ������ ���������
		}
		public void mouseReleased(MouseEvent e) { // �巡�� ���¿��� ���콺 ��ư�� ���� ���
			c.setBackground(Color.GREEN); // ����Ʈ���� ������ �ʷϻ�����
		}
	}

	public static void main(String[] args) {
		
		new P_02();
	
	}

}
