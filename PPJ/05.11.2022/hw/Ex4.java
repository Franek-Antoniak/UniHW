import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj pierwszą liczbę: ");
		int a = scanner.nextInt();
		System.out.println("Podaj drugą liczbę: ");
		int b = scanner.nextInt();
		if (a > b) {
			a = a ^ b ^ (b = a);
		}
		if (a == 0 && b == 0) {
			System.out.println("NWD dwóch zer nie istnieje");
		} else if (a == 0) {
			System.out.println("NWD: " + b);
		} else {
			while (b != 0) {
				b %= a ^ b ^ (a = b);
			}
			System.out.println("NWD: " + a);
		}
	}
}
