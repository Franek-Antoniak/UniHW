import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		double delta, x1, x2;
		// Uznałem że będą to całkowite współczynniki
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		delta = b * b - 4 * a * c;
		if (delta > 0) {
			x1 = (-b - Math.sqrt(delta)) / (2 * a);
			x2 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("Dwa miejsca zeroweL: \nx1 = " + x1 + ", x2 = " + x2);
		} else if (delta == 0) {
			x1 = (double)(-b) / (double) (2 * a);
			System.out.println("Jedno miejsce zerowe: x = " + x1);
		} else {
			System.out.println("Brak miejsc zerowych");
		}
	}
}
