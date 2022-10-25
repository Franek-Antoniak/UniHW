import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj długość boku a: ");
		double a = sc.nextDouble();
		System.out.println("Podaj długość boku b: ");
		double b = sc.nextDouble();
		if (a > 0 && b > 0) {
			System.out.println("Pole prostokąta wynosi: " + (a * b));
			System.out.println("Obwód prostokąta wynosi: " + (2 * (a + b)));
		} else {
			System.out.println("Podano nieprawidłowe dane");
		}
	}
}
