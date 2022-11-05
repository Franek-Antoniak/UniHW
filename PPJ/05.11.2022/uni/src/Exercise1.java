import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a, b, c;
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		c = scanner.nextFloat();
		if (a + b + c == 180f) {
			if (a < 90f && b < 90f && c < 90f) {
				System.out.println("Trójkąt istnieje i jest ostrokątny");
			} else {
				System.out.println("Taki trójkąt może istnieć");
			}
		} else {
			System.out.println("Trójkąt taki nie może istnieć");
		}
	}
}