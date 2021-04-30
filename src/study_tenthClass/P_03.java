package study_tenthClass;

import java.awt.*;
import javax.swing.*;

public class P_03 extends JFrame {
	
	public P_03() {
		
		setTitle("Ten Color Buttons Frame");
		setSize(1000, 500); // 프레임 사이즈 가로 1000픽셀, 세로 500픽셀
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 프레임 종료시 프로그램 종료
		
		Container c = getContentPane(); // 컨텐트팬 가져오기
		c.setLayout(new GridLayout(1, 10)); // 1x10 분할 그리드 레이아웃
		
		for (int i = 0; i < 10; i++) {
			c.add(new JButton(i + "")); // i 정수를 숫자로 인식시키는 방법
		}
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		P_03 f = new P_03();
		
	}

}
