package sixthClass_thirdProblem_main;

import sixthClass_thirdProblem_etc.Calc; // etc 패키지의 Calc 클래스

public class MainApp {
	public static void main(String[] args) {
		Calc c = new Calc(10, 20);
		System.out.println(c.sum());
	}
}
