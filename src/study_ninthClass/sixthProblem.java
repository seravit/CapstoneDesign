package study_ninthClass;

import java.io.*;
import java.util.Scanner;

public class sixthProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FileReader fr = null;
		FileWriter fw = null;
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String firstFile = sc.nextLine(); // 앞부분 합칠 파일 이름
		
		System.out.print("두번째 파일 이름을 입력하세요>>");
		String secondFile = sc.nextLine(); // 뒷부분 합칠 파일 이름
		
		int c = 0; // 문자 값 변수
		
		try {
			
			fw = new FileWriter("appended.txt"); // 합쳐넣을 파일 FileWriter 객체 생성
			
			fr = new FileReader(firstFile); // 첫번째 파일 읽어오기
			
			while((c = fr.read()) != -1) { // 파일 끝까지 문자 읽기
				
				fw.write((char)c); // 문자화한 c를 합쳐넣을 파일에 쓰기

			}
			
			fr = new FileReader(secondFile); // 두번째 파일 읽어오기
			
			while((c = fr.read()) != -1) { // 파일 끝까지 문자 읽기
				
				fw.write((char)c); // 문자화한 c를 합쳐넣을 파일에 쓰기

			}
			fr.close();
			fw.close(); // FileReader, FileWriter 종료
			
			System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");
			
		} catch (IOException e) {
			
			System.out.println("입출력 오류");
			
		}
		sc.close();
	}
}

/*
elvis.txt
elvis2.txt

*/