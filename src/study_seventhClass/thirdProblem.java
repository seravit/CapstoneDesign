package study_seventhClass;

import java.util.*; // 해시맵, 스캐너

public class thirdProblem {

	public static void main(String[] args) {
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		
		String contry; // 나라 이름
		int popul; // 인구
		
		while(true) { // "그만" 입력까지 반복
			System.out.print("나라 이름, 인구 >> ");
			
			contry = sc.next();
			
			if (contry.equals("그만")) { // 입력된 문자열이 "그만" 이라면
				break; // while문 탈출
			}
			
			popul = sc.nextInt(); // 인구수 입력
			
			nations.put(contry, popul); // 해시맵에 나라와 인구수 저장
		}
		
		while(true) { // "그만" 입력까지 반복
			System.out.print("인구 검색 >> ");
			
			contry = sc.next();
			
			if (contry.equals("그만")) { // 입력된 문자열이 "그만" 이라면
				break; // while문 탈출
			}
			
			if (nations.get(contry) == null) { // 해시맵에 저장되어있는 값이 없다면
				System.out.println(contry + " 나라는 없습니다.");
			}
			else {
				System.out.println(contry + "의 인구는 " + nations.get(contry));
			}
			
		}
		
		sc.close();
	}

}

/*
Korea 5000
USA 1000000
그만

Korea
스위스
그만
*/