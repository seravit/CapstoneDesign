package Ch_13;

import java.util.Calendar;
import javax.swing.*;
import java.awt.*;

class thread3 extends Thread { // 스레드 클래스를 상속받는 클래스
	private JLabel jl; // 레이블 선언
	
	public thread3(JLabel jl) {
		this.jl = jl; // 시간을 출력할 레이블
	}
	
	public void run() {
		while(true) { // 무한반복
			Calendar c = Calendar.getInstance(); // 캘린더 인스턴스 가져오기
			int hour = c.get(Calendar.HOUR_OF_DAY); // 시
			int min = c.get(Calendar.MINUTE); // 분
			int sec = c.get(Calendar.SECOND); // 초
			
			String clock = Integer.toString(hour); // 시간 정수 문자열에 대입
			clock = clock.concat(":"); // 콜론 붙이기
			clock = clock.concat(Integer.toString(min)); // 분 정수 문자열에 붙이기
			clock = clock.concat(":"); // 콜론 붙이기
			clock = clock.concat(Integer.toString(sec)); // 초 정수 문자열에 붙이기
			
			jl.setText(clock); // 레이블에 문자열 배치
		}
	}
}

public class P_03 extends JFrame { // 제이프레임 상속
	
	public P_03() {
		setTitle("디지털 시계 만들기");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 프레임 종료시 프로그램 종료
		
		Container c = getContentPane();	// 컨텐트팬 가져오기
		c.setLayout(new FlowLayout()); // 컨텐트팬에 플로우 레이아웃 설정
		
		JLabel jl = new JLabel(); // 레이블 객체 생성
		jl.setFont(new Font("Arial", Font.PLAIN, 50)); // 레이블 폰트 설정
			// 애리얼 폰트, 기본 스타일, 50사이즈
		
		thread3 th = new thread3(jl); // 레이블을 전달하면서 스레드 객체 생성
		
		c.add(jl); // 컨텐트팬에 레이블 추가
		th.start(); // 스레드 시작
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new P_03();
	}
}
