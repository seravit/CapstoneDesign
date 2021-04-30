package study_ninthClass;

import java.io.*;
import java.util.Scanner;

public class sixthProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FileReader fr = null;
		FileWriter fw = null;
		
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		String firstFile = sc.nextLine(); // �պκ� ��ĥ ���� �̸�
		
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		String secondFile = sc.nextLine(); // �޺κ� ��ĥ ���� �̸�
		
		int c = 0; // ���� �� ����
		
		try {
			
			fw = new FileWriter("appended.txt"); // ���ĳ��� ���� FileWriter ��ü ����
			
			fr = new FileReader(firstFile); // ù��° ���� �о����
			
			while((c = fr.read()) != -1) { // ���� ������ ���� �б�
				
				fw.write((char)c); // ����ȭ�� c�� ���ĳ��� ���Ͽ� ����

			}
			
			fr = new FileReader(secondFile); // �ι�° ���� �о����
			
			while((c = fr.read()) != -1) { // ���� ������ ���� �б�
				
				fw.write((char)c); // ����ȭ�� c�� ���ĳ��� ���Ͽ� ����

			}
			fr.close();
			fw.close(); // FileReader, FileWriter ����
			
			System.out.println("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����Ͽ����ϴ�.");
			
		} catch (IOException e) {
			
			System.out.println("����� ����");
			
		}
		sc.close();
	}
}

/*
elvis.txt
elvis2.txt

*/