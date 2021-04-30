package study_sixthClass;

import java.util.Scanner;

public class ninthProblem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] kgb = {null, "가위", "바위", "보"}; // 선택할 숫자에 대응하는 문자를 저장하는 배열
		
		while(true) {
			
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
		
			int select = scan.nextInt(); // 유저가 선택할 값
			
			if(select == 4) // 4번은 끝내기
				break; // while문 탈출
		
			if(1 <= select && select <=3) { // select가 1, 2, 3일때
				
				int com = (int)(Math.random() * 3 + 1); // 변수 com에 정수 1부터 3까지의 난수 대입
				
				switch(select - com) { // 유저가 선택한 값 - 컴퓨터의 난수
				case -2: // 가위 - 보
					System.out.println("철수(" + kgb[select] + ") : 컴퓨터(" + kgb[com] + ")");
					System.out.println("철수가 이겼습니다.");
					break;
				case -1: // 가위 - 바위, 바위 - 보
					System.out.println("철수(" + kgb[select] + ") : 컴퓨터(" + kgb[com] + ")");
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				case 0: // 비김
					System.out.println("철수(" + kgb[select] + ") : 컴퓨터(" + kgb[com] + ")");
					System.out.println("비겼습니다.");
					break;
				case 1: // 보 - 바위, 바위 - 가위
					System.out.println("철수(" + kgb[select] + ") : 컴퓨터(" + kgb[com] + ")");
					System.out.println("철수가 이겼습니다.");
					break;
				case 2: // 보 - 가위
					System.out.println("철수(" + kgb[select] + ") : 컴퓨터(" + kgb[com] + ")");
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				}
			}
			else
				System.out.println("1, 2, 3, 4 중에서 골라주세요"); // 유저가 1~4 사이 외의 값을 선택했을때
		}
		scan.close();
	}
}
