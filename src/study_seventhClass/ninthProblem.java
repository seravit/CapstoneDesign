package study_seventhClass;

import java.util.Vector;

interface IStack<T> { // 제공된 인터페이스
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	Vector<T> v = new Vector<T>();

	@Override
	public T pop() {
		if (v.size() == 0)
			return null; // 스택이 비어있으면 null 반환
		else
			return v.remove(0); // 스택의 맨 앞에있는 요소 삭제
	}

	@Override
	public boolean push(T ob) {
		v.add(0, ob); // 저장된 순서의 역순으로 출력하기위해 맨 앞에 요소 삽입
		return true;
	}
}

public class ninthProblem {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i=0; i<10; i++) stack.push(i); // 10개의 정수 푸시
		while (true) { // 스택이 빌 때까지 pop
			Integer n = stack.pop();
			if(n == null) break; // 스택이 빈 경우
			System.out.print(n + " ");
		}
	}
}
