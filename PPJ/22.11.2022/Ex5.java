public class Ex5 {
	public static void main(String[] args) {
		int x = 2 * 5 + 3 * 4 - 8;
		int y = 10 - 8 * 3 - 3 * 4 + 2;
		// If y hast to be equal to x and y has to be smaller or equal to x,
		// then y has to be equal to x to make the condition true.
		// In math form: if x = y and y <= x then y = x.
		System.out.print("Condition y == x && y <= x");
		if (y == x) {
			System.out.println(" is true.");
		} else {
			System.out.println(" is false.");
		}
	}
}
