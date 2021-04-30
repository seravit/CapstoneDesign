package study_tenthClass;

import java.awt.*; // awt 컴포넌트의 클래스 파일 전체 import
import javax.swing.*; // 스윙 컴포넌트의 클래스 파일 전체 import

public class P_02 extends JFrame { // JFrame 상속
	
	public P_02() { // 생성자에서 프레임 요소 설정
		
		setTitle("BorderLayout Practice"); // 프레임 타이틀
		setSize(800, 400); // 프레임 사이즈 가로 800픽셀, 세로 400픽셀
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 프레임 종료시 프로그램 종료
		
		Container c = getContentPane(); // 프레임에는 컨텐트팬이 기본적으로 생성되어있음, 컨텐트팬 가져오기
		c.setLayout(new BorderLayout(5,7)); // 컴포넌트 사이의 수평 간격 5픽셀, 수직 간격 7픽셀
		
		String[] btn = {"North", "West", "Center", "East", "South"}; // 버튼 문자열 배열
		String[] dir = {BorderLayout.NORTH, BorderLayout.WEST,
				BorderLayout.CENTER, BorderLayout.EAST, BorderLayout.SOUTH}; // 방향 배열
		
		for (int i = 0; i < 5; i++) {
			c.add(new JButton(btn[i]), dir[i]); // 컨턴트팬에 인덱스마다 dir 방향에 btn 내용의 버튼을 생성
		}
		
		setVisible(true); // 프레임이 보이도록 설정
	}
	
	public static void main(String[] args) {
		
		P_02 f = new P_02();
		
	}

}
