package study_sixthClass;

import java.util.Calendar; // JDK의 Calendar 클래스 import

public class fifthProblem {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); // Calendar 객체 생성
		
		int hour = now.get(Calendar.HOUR_OF_DAY); // 24시간이 필요하므로 HOUR_OF_DAY 필드 사용
		int min = now.get(Calendar.MINUTE);
		
		System.out.println("현재 시간은 " + hour + "시 " + min + "분입니다."); // 현재 시각 출력
		
		if(5 <= hour && hour < 12) { // hour이 5에서 11 사이의 값일 때
			System.out.println("Good Morning");
		}
		else if(12 <= hour && hour < 18) { // hour이 12에서 17 사이의 값일 때
			System.out.println("Good Afternoon");
		}
		else if(18 <= hour && hour < 23) { // hour이 18에서 22 사이의 값일 때
			System.out.println("Good Evening");
		}
		else {
			System.out.println("Good Night");
		}
	}
}
