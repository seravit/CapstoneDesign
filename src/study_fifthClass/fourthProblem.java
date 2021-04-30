package study_fifthClass;

class Km2Mile extends Converter {
	
	public Km2Mile(double x) {
		this.ratio = x; // 생성자의 인자로 받은 값을 Converter의 ratio변수에 대입
	}
	
	protected double convert(double src) {
		return src/ratio; // 입력받은 값을 비율로 나눔 (단위변환)
	}

	protected String getSrcString() {
		return "Km"; // 단위 "Km" 반환
	}

	protected String getDestString() {
		return "mile"; // 단위 "mile" 반환
	}
}

public class fourthProblem {

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6Km
		toMile.run();
	}

}
