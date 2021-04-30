package study_ninthClass;

import java.io.*;
import java.util.Scanner;

public class firstProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null; // FileWriter 변수 선언
		
		System.out.println("전화번호 입력 프로그램입니다.");
		
		try {
			
			fw = new FileWriter("c:\\Temp\\phone.txt"); // FileWriter 객체 생성
			
			while(true) { // "그만" 입력까지 반복
				
				System.out.print("이름 전화번호 >> ");
				String st = sc.nextLine(); // 한 줄 입력받기
				
				if(st.equals("그만")) { // 입력받은 문자열이 "그만" 일 때
					break; // while문 탈출
				}
				
				fw.write(st); // phone.txt에 문자열 입력
				fw.write("\r\n"); // phone.txt에 줄내림 입력
			}
			fw.close(); // FileWriter 종료
			
			System.out.println("c:\\Temp\\phone.txt에 저장하였습니다.");
			
		} catch (IOException e) {
			
			System.out.println("입출력 오류"); //파일 입출력 오류 문구 출력
			
		}
		sc.close();
	}
}

/*
황기태 010-5555-7777
이재문 011-3333-4444
김남윤 065-2222-1111
그만
*/