package study_seventhClass;

import java.util.*; // 벡터, 스캐너

public class fourthProblem {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 0이 입력될때까지 반복
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int rain = sc.nextInt();
			
			if (rain == 0)
				break; // while문 탈출
			
			v.add(rain); // 벡터에 강수량 저장
			
			int sum = 0; // 평균값을 구하기 위한 총합값
			
			for (int i = 0; i < v.size(); i++) { // 벡터에 모든 요소 출력
				System.out.print(v.get(i) + " ");
				sum += v.get(i); // 총합값 변수에 i 인덱스의 요소 더하기
			}
			
			System.out.println("\n현재 평균 " + sum / v.size()); // 평균은 (총합값  / 요소의 개수)
		}
		
		sc.close();
	}

}
/*
5
80
53
22
0

*/