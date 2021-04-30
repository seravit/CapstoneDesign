package study_tenthClass;

import java.awt.*;
import javax.swing.*;

public class P_04 extends JFrame {
	
	public P_04() {
		
		setTitle("Ten Color Buttons Frame");
		setSize(1000, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 프레임 종료시 프로그램 종료
		
		Container c = getContentPane(); // 컨텐트팬 가져오기
		c.setLayout(new GridLayout(1, 10)); // 1x10 분할 그리드 레이아웃
		
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
				Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY}; // 색 종류 배열
		
		for (int i = 0; i < 10; i++) {
			JButton btn = new JButton(i + ""); // 인덱스에 따른 문자의 버튼 객체 생성
			btn.setBackground(color[i]); // 버튼에 색 설정
			c.add(btn); // 버튼을 컨텐트팬에 추가
		}
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		P_04 f = new P_04();
		
	}

}
