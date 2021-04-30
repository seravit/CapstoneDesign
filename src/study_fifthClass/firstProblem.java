package study_fifthClass;

class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TV { //TV를 상속한 ColorTV
	
	int color; //컬러값을 ColorTV에서 받고 printProperty에서 출력하기위해 전역변수로 선언
	
	public ColorTV(int x, int y) { //main에서 값을 받기위한 ColorTV 생성자
		super(x); //TV클래스의 size변수에 x값을 넣는다
		this.color = y; // 전역변수 color에 y값을 넣는다
	}
	
	public void printProperty() { //출력 메소드
		System.out.println(getSize() + "인치 " + color + "컬러");
	} //TV클래스의 size를 반환하는 getSize() 메소드, y값을 대입한 전역변수 color
}

public class firstProblem {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}
