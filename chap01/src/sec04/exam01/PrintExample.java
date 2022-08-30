package sec04.exam01;

public class PrintExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("Price of stuff :%dWon\n", value);
		System.out.printf("Price of stuff :%6dWon\n", value);
		System.out.printf("Price of stuff :%-6dWon\n", value);
		System.out.printf("Price of stuff :%06dWon\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("Radius %d in Area of circle :%10.2f\n", 10, area);
		
		String name = "Gil Dong Hong";
		String job = "Thief";
		System.out.printf("%6d | %-10s\n", 1, name, job);
	}

}
