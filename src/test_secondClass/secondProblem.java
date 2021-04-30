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
	 * 자바로 배열을 선언하는 방법, 스캐너 함수(입력함수)를 선언하는 방법을 까먹어서
	 * 자바의 배열선언법, 스캐너함수를 불러오는 방법만 따로 찾아보았습니다.
	 * 
	 * (배열을 선언하는 방법은 C언어로만 기억하고 있었습니다.)
	 */
}
