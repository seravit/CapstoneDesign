package study_ninthClass;

import java.io.*;

public class secondProblem {

	public static void main(String[] args) {
		
		FileReader fr = null; // FileReader 변수 선언
		
		System.out.println("c:\\temp\\phone.txt를 출력합니다");
		
		int c = 0; // 문자 값 변수
		
		try {
			
			fr = new FileReader("c:\\Temp\\phone.txt");
			
			while((c = fr.read()) != -1) { //c에 phone.txt의 문자 대입, 한 문자씩 파일 끝까지 읽음, read()가 -1이면 문자가 없다는 의미
				
				System.out.print((char)c); // c를 문자화해서 출력
			
			}
			fr.close(); // FileReader 종료
			
		} catch (IOException e) {
			
			System.out.println("입출력 오류");
			
		}	
	}
}
