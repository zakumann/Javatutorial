package sec01.exam06;

public class SwiitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[Now: "  + time + " Hour]");
		
		switch(time) {
		case 8 :
			System.out.println("GotoWork.");
		case 9 :
			System.out.println("Meeting.");
		case 10:
			System.out.println("Working.");
		default:
			System.out.println("Go to outside.");
		}
	}
}
