package study_fifthClass;

class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TV { //TV�� ����� ColorTV
	
	int color; //�÷����� ColorTV���� �ް� printProperty���� ����ϱ����� ���������� ����
	
	public ColorTV(int x, int y) { //main���� ���� �ޱ����� ColorTV ������
		super(x); //TVŬ������ size������ x���� �ִ´�
		this.color = y; // �������� color�� y���� �ִ´�
	}
	
	public void printProperty() { //��� �޼ҵ�
		System.out.println(getSize() + "��ġ " + color + "�÷�");
	} //TVŬ������ size�� ��ȯ�ϴ� getSize() �޼ҵ�, y���� ������ �������� color
}

public class firstProblem {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}
