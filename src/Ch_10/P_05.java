package Ch_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P_05 extends JFrame {
	JLabel jl; // JLabel 전역 변수 선언
	
	public P_05() {
		setTitle("+, - 키로 폰트 크기 조절");
		setSize(500, 500);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jl = new JLabel("Love Java"); // JLabel 객체 생성
		
		jl.addKeyListener(new MKA()); // 키 리스너를 JLabel에 적용
		
		add(jl); // JLabel을 프레임에 추가
		
		setVisible(true);
		
		jl.requestFocus();
		jl.requestFocus(); // 포커스가 맞거나 안맞거나 하는 경우가 있음. 더 많은 조사 필요
	}
	
	class MKA extends KeyAdapter { // 키 어댑터를 상속받는 클래스
		public void keyPressed(KeyEvent e) {
			Font f = jl.getFont(); // JLabel의 폰트 객체 생성
			int size = f.getSize(); // 폰트 객체의 폰트 사이즈 변수 생성
			
			switch (e.getKeyChar()) {
			case '+': // 입력한 키가 + 라면
				jl.setFont(new Font("Arial", Font.PLAIN, size + 5));
					// JLabel의 폰트를 Arial 폰트, 기본 스타일, 사이즈 + 5 로 설정
				break;
			case '-': // 입력한 키가 - 라면
				if (size > 5) // 만약 크기가 5보다 크다면
					jl.setFont(new Font("Arial", Font.PLAIN, size - 5));
						// JLabel의 폰트를 Arial 폰트, 기본 스타일, 사이즈 - 5 로 설정
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		new P_05();
		
	}

}
