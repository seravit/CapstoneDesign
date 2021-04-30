package study_sixthClass;

import java.util.Scanner;

public class eleventhProblem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">>");
		
		String str = scan.nextLine(); // 수정할 문자열 입력받기
		StringBuffer sb = new StringBuffer(str); // StringBuffer 객체를 입력받은 str 대입하고 생성 
		
		while(true) { // "그만" 입력할때까지 반복
			
			System.out.print("명령: ");
			String order = scan.nextLine(); // 명령 문자열 입력받기
			
			if(order.equals("그만")) { // 명령이 "그만" 이라면
				System.out.println("종료합니다");
				break; // while문 탈출
			}
			
			String[] texts = order.split("!"); // 명령 문자열을 !로 나누고 나눈 문자열을 texts 배열에 저장
			int firstIndex = sb.indexOf(texts[0]);
				// sb 문자열에서 texts[0]의 문자열이 시작되는 인덱스 값을 firstIndex에 저장
			
			if(texts.length != 2) { // texts 배열의 개수가 2개가 아니라면
				System.out.println("잘못된 명령입니다!");
			}
			else { // texts 배열의 개수가 2개라면
				if(firstIndex == -1) { // firstIndex 값이 -1 이라면 sb 문자열에 texts[0]가 없다는 의미
					System.out.println("찾을 수 없습니다!");
				}
				else {
					sb.replace(firstIndex, firstIndex + texts[0].length(), texts[1]);
						// texts[0]문자열이 시작되는 지점부터 해당 문자열의 길이만큼의 문자열을 texts[1]의 문자열로 대치
					System.out.println(sb); // 대치된 sb 문자열 출력
				}
			}
		}
		
		scan.close();
	}
}

/* 
우리는 love Java Programming.
우리는!We
LOV!사랑
!Java
love!LOVE
그만
*/