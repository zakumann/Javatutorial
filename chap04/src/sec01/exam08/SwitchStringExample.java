package sec01.exam08;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "Manager";
		
		switch(position) {
		case "Director":
			System.out.println("7,000,000");
			break;
		case "Manager":
			System.out.println("5,000,000");
			break;
		default:
			System.out.println("3,000,000");
		}
	}
}
