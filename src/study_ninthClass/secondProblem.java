package study_ninthClass;

import java.io.*;

public class secondProblem {

	public static void main(String[] args) {
		
		FileReader fr = null; // FileReader ���� ����
		
		System.out.println("c:\\temp\\phone.txt�� ����մϴ�");
		
		int c = 0; // ���� �� ����
		
		try {
			
			fr = new FileReader("c:\\Temp\\phone.txt");
			
			while((c = fr.read()) != -1) { //c�� phone.txt�� ���� ����, �� ���ھ� ���� ������ ����, read()�� -1�̸� ���ڰ� ���ٴ� �ǹ�
				
				System.out.print((char)c); // c�� ����ȭ�ؼ� ���
			
			}
			fr.close(); // FileReader ����
			
		} catch (IOException e) {
			
			System.out.println("����� ����");
			
		}	
	}
}
