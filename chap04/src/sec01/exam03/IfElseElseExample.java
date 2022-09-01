package sec01.exam03;

public class IfElseElseExample {

	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("score : 100~90");
			System.out.println("Grade : A");
		}else if(score>=80) {
			System.out.println("score : 80~89");
			System.out.println("Grade : B");
		}else if(score>=70) {
			System.out.println("score : 70~79");
			System.out.println("Grade : C");
		}else {
			System.out.println("score is less than 70");
			System.out.println("Grade : D");
		}
	}

}
