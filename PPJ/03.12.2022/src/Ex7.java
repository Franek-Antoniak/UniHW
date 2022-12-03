import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(findMax(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
	}

	public static int findMax(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		}
		if (b >= a && b >= c) {
			return b;
		}
		return c;
	}
}