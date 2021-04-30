package study_ninthClass;

import java.io.*;

public class seventhProblem {

	public static void main(String[] args) {
		
		File f = null; // 원본 파일 변수
		File copy = null; // 복사될 파일 변수
		
		System.out.println("a.jpg를 b.jpg로 복사합니다.\n10%마다 *를 출력합니다.");
		
		int c = 0, load = 0; // 문자 값 변수, 읽은 바이트 수 변수

		try {
			
			f = new File("a.jpg"); // 원본 이미지 파일 객체 생성
			copy = new File("b.jpg"); // 복사될 이미지 파일 객체 생성
			
			FileInputStream fin = new FileInputStream(f); // 원본 파일과 연결된 파일인풋스트림 객체 선언
			FileOutputStream fo = new FileOutputStream(copy); // 복사될 파일과 연결된 파일아웃풋스트림 객체 선언
			
			int tenper = (int)f.length() / 10; // 파일 크기의 10%
			int star = tenper; // *을 표시할 위치
			
			while((c = fin.read()) != -1) { // 파일 끝까지 문자 읽기
				
				fo.write((byte)c); // 바이트화한 c를 복사될 파일에 쓰기
				
				load++; // 읽은 바이트 수 + 1
				if(load == star) { // *을 표시할 값만큼 바이트를 읽었다면 
					System.out.print("*"); // * 출력
					star += tenper; // 다음 *을 표시할 위치는 현재 값 + 파일 크기의 10% 값
				}
			}
			fin.close();
			fo.close(); // 스트림 종료
			
		} catch (IOException e) {
			
			System.out.println("파일 복사 오류");
			
		}
		
	}

}
