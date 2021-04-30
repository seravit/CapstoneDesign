package test_secondClass;

class student {
	
	int number;
	String name;
	
	String[] score = new String[6];

}

public class thirdProblem {

	public static void main(String[] args) {
		
		student st = new student();
		
		st.number = 2018213043;
		st.name = "¾È¼¼¶ó";
		
		for(int i = 0; i < 6; i++) {
			st.score[i] = "A+";
		}
		
	}
	
}
