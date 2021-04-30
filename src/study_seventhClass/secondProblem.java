package study_seventhClass;

import java.util.*; // 스캐너, 어래이리스트

public class secondProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> al = new ArrayList<Character>();
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
		
		for (int i = 0; i < 6; i++) {
			char grade = sc.next().charAt(0);
				// 입력받은 문자열의 0번째 인덱스 문자를 grade에 저장
				// 단일 문자를 입력받으려면 charAt() 메소드 필요
			al.add(grade); // 6개의 학점 문자를 al에 저장
		}
		
		sc.close(); // 입력이 끝났으므로 close()
		
		double score = 0; // 총점 변수
		
		for (int i = 0; i < al.size(); i++) {
			switch(al.get(i)) { // al의 i번째 인덱스의 요소
			case'A':
				score += 4.0;
				break;
			case'B':
				score += 3.0;
				break;
			case'C':
				score += 2.0;
				break;
			case'D':
				score += 1.0;
				break;
			case'F':
				score += 0;
				break;
			}
		}
		
		double average = score / al.size(); // 평균은 (총점  / 요소의 개수)
		System.out.println(average);
	}

}

/*

A C A B F D

 */