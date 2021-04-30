package Ch_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P_04 extends JFrame {
	String str = "Love Java"; // 문자열 전역 변수 선언
	JLabel jl; // JLabel 전역 변수 선언
	
	public P_04() {
		
		setTitle("Left 키로 문자열 이동");
		setSize(500, 500);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jl = new JLabel(str); // str 문자열의 JLabel 객체 생성
		
		jl.addKeyListener(new MKA()); // 키 리스너를 JLabel에 적용
		jl.setFont(new Font("Arial", Font.PLAIN, 50)); // 글자가 너무 작아서 임의로 크게 함
		
		add(jl); // JLabel을 프레임에 추가
		
		setVisible(true);
		
		jl.requestFocus();
		jl.requestFocus(); // 포커스가 맞거나 안맞거나 하는 경우가 있어 포커스를 두번 명령함. 더 많은 조사 필요
	}
	
	class MKA extends KeyAdapter { // 키 어댑터를 상속받는 클래스
		public void keyPressed(KeyEvent e) { // 키보드가 누를 경우, 키 프레스 메소드
			if(e.getKeyCode() == KeyEvent.VK_LEFT) { // 누른 키가 왼쪽 방향키라면
				str = str.substring(1) + str.substring(0, 1);
					// 문자열을 첫번째 문자와 나머지 문자열로 나눈 다음 반대로 합쳐(나머지 문자열 + 첫번째 문자) 문자열 변수에 저장
				jl.setText(str); // JLabel에 저장된 문자열 적용
			}
		}
	}
	
	public static void main(String[] args) {
		
		new P_04();
		
	}

}
