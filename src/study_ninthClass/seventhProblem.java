package study_ninthClass;

import java.io.*;

public class seventhProblem {

	public static void main(String[] args) {
		
		File f = null; // ���� ���� ����
		File copy = null; // ����� ���� ����
		
		System.out.println("a.jpg�� b.jpg�� �����մϴ�.\n10%���� *�� ����մϴ�.");
		
		int c = 0, load = 0; // ���� �� ����, ���� ����Ʈ �� ����

		try {
			
			f = new File("a.jpg"); // ���� �̹��� ���� ��ü ����
			copy = new File("b.jpg"); // ����� �̹��� ���� ��ü ����
			
			FileInputStream fin = new FileInputStream(f); // ���� ���ϰ� ����� ������ǲ��Ʈ�� ��ü ����
			FileOutputStream fo = new FileOutputStream(copy); // ����� ���ϰ� ����� ���Ͼƿ�ǲ��Ʈ�� ��ü ����
			
			int tenper = (int)f.length() / 10; // ���� ũ���� 10%
			int star = tenper; // *�� ǥ���� ��ġ
			
			while((c = fin.read()) != -1) { // ���� ������ ���� �б�
				
				fo.write((byte)c); // ����Ʈȭ�� c�� ����� ���Ͽ� ����
				
				load++; // ���� ����Ʈ �� + 1
				if(load == star) { // *�� ǥ���� ����ŭ ����Ʈ�� �о��ٸ� 
					System.out.print("*"); // * ���
					star += tenper; // ���� *�� ǥ���� ��ġ�� ���� �� + ���� ũ���� 10% ��
				}
			}
			fin.close();
			fo.close(); // ��Ʈ�� ����
			
		} catch (IOException e) {
			
			System.out.println("���� ���� ����");
			
		}
		
	}

}
