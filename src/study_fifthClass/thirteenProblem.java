package study_fifthClass;

interface Shape {
	final double PI = 3.14;			// ���
	void draw();					// ������ �׸��� �߻� �޼ҵ�
	double getArea();				// ������ ������ �����ϴ� �߻� �޼ҵ�
	default public void redraw() {	// ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}

class Circle implements Shape {
	
	int radius;
	
	public Circle(int x) { // Circle ������
		this.radius = x; // ���ڷ� �Է¹��� x�� Circle Ŭ������ radius ������ ����
	}
	
	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}
	
	public double getArea() { // ���� ������ PI ���ϱ� �������� ����
		return PI * radius * radius;
	}
}

public class thirteenProblem {

	public static void main(String[] args) {
		
		Shape donut = new Circle(10); // �������� 10�� �� ��ü
		donut.redraw();
		System.out.println("������ " + donut.getArea());
		
	}
}
