package study_fifthClass;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); // 추상 메소드
	abstract protected String getSrcString(); // 추상 메소드
	abstract protected String getDestString(); // 추상 메소드
	protected double ratio; // 비율

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString()	 + "입니다");
		scanner.close();
	}
}

class Won2Dollar extends Converter {
	
	public Won2Dollar(double x) {
		this.ratio = x; // 생성자의 인자로 받은 값을 Converter의 ratio변수에 대입
	}
	
	public double convert(double src) {
		return src/ratio; // 입력받은 값을 비율로 나눔 (환율계산)
	}
	
	public String getSrcString() {
		return "원"; // 단위 "원" 반환
	}
	
	public String getDestString() {
		return "달러"; // 단위 "달러" 반환
	}
}

public class thirdProblem {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
	}
}
