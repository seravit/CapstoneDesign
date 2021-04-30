package Ch_13;

import java.util.Scanner;
	
class MyThread implements Runnable { // Runnable 인터페이스를 상속
	public void run() {
		System.out.println("스레드 실행 시작");
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " "); // 1부터 10까지 한번에 출력
		}
		
		System.out.println("\n스레드 종료");
	} // 스레드 종료
}

public class P_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 스캐너
		Thread th = new Thread(new MyThread()); // 스레드 객체 생성
		
		System.out.print("아무 키나 입력>> ");
		
		sc.nextLine(); // 줄넘김(enter)을 입력하면
		th.start(); // 스레드 시작
	}
}
