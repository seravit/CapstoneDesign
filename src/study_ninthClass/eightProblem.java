package study_ninthClass;

import java.io.File;

public class eightProblem {

	public static void main(String[] args) {
		
		File f = null;
		File[] subfiles = null;
		File big = null; // ���� �뷮�� ū ���� ����
		
		f = new File("c:\\"); // c����̺� ���� ��ü ����
		subfiles = f.listFiles(); // c����̺��� ���� ����Ʈ 
		
		big = subfiles[0]; // c����̺��� ù��° ������ ���� �뷮�� ū ���Ϸ� ����
		
		for (int i = 0; i < subfiles.length; i++) { // i�� c����̺��� ���� �� ��ŭ
			if(big.length() < subfiles[i].length()) // ���� ���� �뷮�� ū ���Ϻ��� c����̺��� i��° ������ �뷮�� �� ũ�ٸ�
				big = subfiles[i]; // c����̺��� i��° ������ ���� �뷮�� ū ���� ������ ����
		}
		
		System.out.println("���� ū ������ " + big.getPath() + " " + big.length() + "����Ʈ");
			// ���� �뷮�� ū ������ �̸��� ũ�� ���
	}

}
