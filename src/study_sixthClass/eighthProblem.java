package study_sixthClass;

import java.util.Scanner; // JDK의 Scanner 클래스 import

public class eighthProblem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Scanner 객체 생성
		
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		
		String str = scan.nextLine(); // 줄바꿈까지의 문자열 str 변수에 입력
		
		for(int i = 0; i < str.length(); i++) { // 문장의 길이만큼 반복해야 한 글자씩 회전해서 원 문장이 나옴
			
			String fir = str.substring(0, 1); // 첫번째 문자
			String rem = str.substring(1); // 두번째부터 끝까지의 문자열
			
			str = rem + fir; // 두번째 부터의 문자열 뒤에 첫번째 문자를 붙여서 회전시킴
			
			System.out.println(str); // 회전시킨 문장 출력
		}
		
		scan.close();
	}
}

/*
I Love You
*/