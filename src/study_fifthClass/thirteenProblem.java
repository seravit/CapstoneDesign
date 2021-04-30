package study_fifthClass;

interface Shape {
	final double PI = 3.14;			// 상수
	void draw();					// 도형을 그리는 추상 메소드
	double getArea();				// 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() {	// 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

class Circle implements Shape {
	
	int radius;
	
	public Circle(int x) { // Circle 생성자
		this.radius = x; // 인자로 입력받은 x를 Circle 클래스의 radius 변수에 대입
	}
	
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
	
	public double getArea() { // 원의 면적은 PI 곱하기 반지름의 제곱
		return PI * radius * radius;
	}
}

public class thirteenProblem {

	public static void main(String[] args) {
		
		Shape donut = new Circle(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
		
	}
}
