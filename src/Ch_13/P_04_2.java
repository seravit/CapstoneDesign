package Ch_13;

import javax.swing.*;
import java.awt.*;

class thread4 extends Thread { // 스레드 클래스를 상속받는 클래스
	private JLabel jl; // 레이블 선언
	int x = 10; // 레이블 좌표에 쓸 변수 선언
	
	public thread4(JLabel jl) {
		this.jl = jl; // 문자열을 출력할 레이블
	}
	
	public void run() {
		while(true) { // 무한반복
			if(x == 10)
				x += 5; // 15
			else
				x -= 5; // 10
			jl.setLocation(x + 100, x); // 레이블을 프레임 중앙에 위치시키기 위해 x좌표에 100 추가
		}
	}
}

public class P_04_2 extends JFrame {
	public P_04_2() {
		setTitle("진동하는 레이블 만들기");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane(); // 컨텐트팬 가져오기
		JLabel jl = new JLabel("Vibrating Label"); // 레이블 객체 생성
			// 문자열에 한글을 넣으면 깨져서(네모로 나옴) 영어로 작성
		
		jl.setFont(new Font("Arial", Font.PLAIN, 30)); // 레이블 폰트 설정
			// 애리얼 폰트, 기본 스타일, 30 사이즈
		c.add(jl); // 컨텐트팬에 레이블 추가
		
		thread4 th = new thread4(jl); // 레이블을 전달하면서 스레드 객체 생성
		th.start(); // 스레드 시작
	}
	
	public static void main(String[] args) {
		new P_04_2();
	}
}
