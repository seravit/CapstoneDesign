package study_fifthClass;

class Km2Mile extends Converter {
	
	public Km2Mile(double x) {
		this.ratio = x; // �������� ���ڷ� ���� ���� Converter�� ratio������ ����
	}
	
	protected double convert(double src) {
		return src/ratio; // �Է¹��� ���� ������ ���� (������ȯ)
	}

	protected String getSrcString() {
		return "Km"; // ���� "Km" ��ȯ
	}

	protected String getDestString() {
		return "mile"; // ���� "mile" ��ȯ
	}
}

public class fourthProblem {

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); // 1������ 1.6Km
		toMile.run();
	}

}
