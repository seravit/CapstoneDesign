package test_secondClass;

import java.util.*;

public class secondProblem {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		Scanner key = new Scanner (System.in);
		
		for (int i = 0; i < 100; i++) {
			arr[i] = key.nextInt();
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(arr[i]);
		}
		
		key.close();

	}
	/*
	 * �ڹٷ� �迭�� �����ϴ� ���, ��ĳ�� �Լ�(�Է��Լ�)�� �����ϴ� ����� ��Ծ
	 * �ڹ��� �迭�����, ��ĳ���Լ��� �ҷ����� ����� ���� ã�ƺ��ҽ��ϴ�.
	 * 
	 * (�迭�� �����ϴ� ����� C���θ� ����ϰ� �־����ϴ�.)
	 */
}
