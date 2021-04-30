package study_ninthClass;

import java.io.FileReader;
import java.io.IOException;

public class thirdProblem {

	public static void main(String[] args) {
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader("c:\\Windows\\system.ini");
			int c;
			char a;
			
			while((c = fr.read()) != -1) {
				System.out.print((char)c);
			} // system.ini 변환없이 출력
			
			while((c = fr.read()) != -1) {
				a = (char) Character.toUpperCase(c);
				System.out.print(a);
			} // system.ini 대문자 변환 출력
			fr.close();
		
		} catch(IOException e) {
			
			System.out.println("입출력 오류");
		
		}	
	}
}
