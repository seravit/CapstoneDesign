package study_fifthClass;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); // �߻� �޼ҵ�
	abstract protected String getSrcString(); // �߻� �޼ҵ�
	abstract protected String getDestString(); // �߻� �޼ҵ�
	protected double ratio; // ����

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + getDestString()	 + "�Դϴ�");
		scanner.close();
	}
}

class Won2Dollar extends Converter {
	
	public Won2Dollar(double x) {
		this.ratio = x; // �������� ���ڷ� ���� ���� Converter�� ratio������ ����
	}
	
	public double convert(double src) {
		return src/ratio; // �Է¹��� ���� ������ ���� (ȯ�����)
	}
	
	public String getSrcString() {
		return "��"; // ���� "��" ��ȯ
	}
	
	public String getDestString() {
		return "�޷�"; // ���� "�޷�" ��ȯ
	}
}

public class thirdProblem {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1�޷��� 1200��
		toDollar.run();
	}
}
