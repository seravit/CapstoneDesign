package study_ninthClass;

import java.io.*;
import java.util.Scanner;

public class fourthProblem {

	public static void main(String[] args) {
		
		FileReader fr = null;
		
		System.out.println("c:\\windows\\system.ini ������ �о� ����մϴ�.");
		
		try {
			
			fr = new FileReader("c:\\Windows\\system.ini");
			Scanner sc = new Scanner(fr);
			int n = 1;
			
			while(sc.hasNext()) {
				String line = sc.nextLine();
				System.out.printf("%4d", n);
				System.out.println(" : " + line);
				n++;
			}
			fr.close();
			sc.close();
			
		} catch (IOException e) {
			
			System.out.println("����� ����");
			
		}
	}

}
