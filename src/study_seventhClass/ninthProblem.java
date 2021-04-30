package study_seventhClass;

import java.util.Vector;

interface IStack<T> { // ������ �������̽�
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	Vector<T> v = new Vector<T>();

	@Override
	public T pop() {
		if (v.size() == 0)
			return null; // ������ ��������� null ��ȯ
		else
			return v.remove(0); // ������ �� �տ��ִ� ��� ����
	}

	@Override
	public boolean push(T ob) {
		v.add(0, ob); // ����� ������ �������� ����ϱ����� �� �տ� ��� ����
		return true;
	}
}

public class ninthProblem {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i=0; i<10; i++) stack.push(i); // 10���� ���� Ǫ��
		while (true) { // ������ �� ������ pop
			Integer n = stack.pop();
			if(n == null) break; // ������ �� ���
			System.out.print(n + " ");
		}
	}
}
