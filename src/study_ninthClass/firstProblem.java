package study_ninthClass;

import java.io.*;
import java.util.Scanner;

public class firstProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null; // FileWriter ���� ����
		
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		
		try {
			
			fw = new FileWriter("c:\\Temp\\phone.txt"); // FileWriter ��ü ����
			
			while(true) { // "�׸�" �Է±��� �ݺ�
				
				System.out.print("�̸� ��ȭ��ȣ >> ");
				String st = sc.nextLine(); // �� �� �Է¹ޱ�
				
				if(st.equals("�׸�")) { // �Է¹��� ���ڿ��� "�׸�" �� ��
					break; // while�� Ż��
				}
				
				fw.write(st); // phone.txt�� ���ڿ� �Է�
				fw.write("\r\n"); // phone.txt�� �ٳ��� �Է�
			}
			fw.close(); // FileWriter ����
			
			System.out.println("c:\\Temp\\phone.txt�� �����Ͽ����ϴ�.");
			
		} catch (IOException e) {
			
			System.out.println("����� ����"); //���� ����� ���� ���� ���
			
		}
		sc.close();
	}
}

/*
Ȳ���� 010-5555-7777
���繮 011-3333-4444
�賲�� 065-2222-1111
�׸�
*/