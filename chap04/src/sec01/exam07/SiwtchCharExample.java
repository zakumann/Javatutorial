package sec01.exam07;

public class SiwtchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("VIP");
			break;
		case 'B':
		case 'b':
			System.out.println("Normal");
			break;
		case 'C':
		case 'c':
			System.out.println("customer");
			break;
		}
	}
}
