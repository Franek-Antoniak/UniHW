import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int points, maxPoints;
		points = scanner.nextInt();
		maxPoints = scanner.nextInt();
		double percent = (double) points / (double) (maxPoints * 100);
		if (percent >= 87.5) {
			System.out.println("5");
		} else if (percent >= 81.25) {
			System.out.println("4.5");
		} else if (percent >= 75) {
			System.out.println("4");
		} else if (percent >= 62.6) {
			System.out.println("3.5");
		} else if (percent >= 50) {
			System.out.println("3");
		} else {
			System.out.println("2");
		}
	}
}
