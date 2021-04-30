package Ch_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P_02 extends JFrame {
	Container c = getContentPane(); // 컨텐트팬 가져오기
	
	public P_02() { // 생성자
		setTitle("드래깅동안 YELLOW");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 프레임 종료시 프로그램 종료
		
		MMA mma = new MMA(); // 마우스 어댑터 객체 생성
		
		c.setLayout(new FlowLayout()); // 레이아웃 설정
		c.setBackground(Color.GREEN); // 컨텐트팬의 초기 배경색은 초록색
		c.addMouseMotionListener(mma); // 드래그를 인식하기위한 마우스모션리스너를 컨텐트팬에 적용
		c.addMouseListener(mma); // 릴리즈를 인식하기위한 마우스리스너를 컨텐트팬에 적용
		
		setVisible(true); // 프레임이 보이도록 설정
	}
	
	class MMA extends MouseAdapter { // 마우스어댑터를 상속받는 클래스
		public void mouseDragged(MouseEvent e) { // 드래그 하고있는 경우
			c.setBackground(Color.YELLOW); // 컨텐트팬의 배경색을 노란색으로
		}
		public void mouseReleased(MouseEvent e) { // 드래그 상태에서 마우스 버튼을 때는 경우
			c.setBackground(Color.GREEN); // 컨텐트팬의 배경색을 초록색으로
		}
	}

	public static void main(String[] args) {
		
		new P_02();
	
	}

}
