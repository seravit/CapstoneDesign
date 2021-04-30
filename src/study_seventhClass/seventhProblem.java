package study_seventhClass;

import java.util.*; // 해시맵, 스캐너, 이터레이터, 셋

public class seventhProblem {

	public static void main(String[] args) {
		
		HashMap<String, Double> student = new HashMap<String, Double>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("미래장학금관리시스템입니다.");
		
		for (int i = 0; i < 5; i++) { // 다섯 학생의 이름과 학점 입력
			System.out.print("이름과 학점>> ");
			String name = sc.next();
			double score = sc.nextDouble();
			
			student.put(name, score); // 해시맵에 저장
		}
		
		System.out.print("장학생 선발 학점 기준 입력>> ");
		double std = sc.nextDouble();
		
		Set<String> keys = student.keySet(); // 모든 key를 가진 Set 컬렉션 리턴
		Iterator<String> it = keys.iterator(); // Set에 있는 모든 key를 순서대로 검색하는 Iterator
		
		System.out.print("장학생 명단 : ");
		
		while(it.hasNext()) { // while문은 모든 학점 출력
			String name = it.next(); // 다음 키. 학생 이름
			Double score = student.get(name); // 학점 알아내기
			
			if(score > std) { // 학점이 기준점보다 높다면 이름 출력
				System.out.print(name + " ");
			}
		}
		
		sc.close();
	}

}

/*

적당히 3.1
나탈락 2.4
최고조 4.3
상당히 3.9
고득점 4.0

3.2

 */
