package study_fifthClass;

class IPTV extends ColorTV{ // ColorTV�� firstProblem Ŭ������ �������
	
	String ip;
	
	public IPTV(String z, int x, int y) { // IPTV ������
		super(x, y); // ColorTV�� ���ڷ� �Է¹��� x, y�� ���ڷ� ����
		this.ip = z; // �Է¹��� IP�ּ�(z)�� IPTV�� ���� ip�� ����
	}
	
	public void printProperty() {
		System.out.print("���� IPTV�� " + ip + " �ּ��� "); // IP ���
		super.printProperty(); // ��ġ�� �÷��� ColorTV�� printProperty �޼ҵ� ���
	}
}

public class secondProblem {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" �ּҿ� 32��ġ, 2048�÷�
		
		iptv.printProperty();
	}

}
