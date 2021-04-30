package study_fifthClass;

class IPTV extends ColorTV{ // ColorTV는 firstProblem 클래스에 들어있음
	
	String ip;
	
	public IPTV(String z, int x, int y) { // IPTV 생성자
		super(x, y); // ColorTV에 인자로 입력받은 x, y를 인자로 전달
		this.ip = z; // 입력받은 IP주소(z)를 IPTV의 변수 ip에 대입
	}
	
	public void printProperty() {
		System.out.print("나의 IPTV는 " + ip + " 주소의 "); // IP 출력
		super.printProperty(); // 인치와 컬러는 ColorTV의 printProperty 메소드 사용
	}
}

public class secondProblem {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
		
		iptv.printProperty();
	}

}
