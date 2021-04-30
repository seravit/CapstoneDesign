package study_ninthClass;

import java.io.File;

public class eightProblem {

	public static void main(String[] args) {
		
		File f = null;
		File[] subfiles = null;
		File big = null; // 가장 용량이 큰 파일 변수
		
		f = new File("c:\\"); // c드라이브 파일 객체 생성
		subfiles = f.listFiles(); // c드라이브의 파일 리스트 
		
		big = subfiles[0]; // c드라이브의 첫번째 파일을 가장 용량이 큰 파일로 대입
		
		for (int i = 0; i < subfiles.length; i++) { // i가 c드라이브의 파일 수 만큼
			if(big.length() < subfiles[i].length()) // 현재 가장 용량이 큰 파일보다 c드라이브의 i번째 파일의 용량이 더 크다면
				big = subfiles[i]; // c드라이브의 i번째 파일을 가장 용량이 큰 파일 변수에 대입
		}
		
		System.out.println("가장 큰 파일은 " + big.getPath() + " " + big.length() + "바이트");
			// 가장 용량이 큰 파일의 이름과 크기 출력
	}

}
