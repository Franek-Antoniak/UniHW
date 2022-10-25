import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbę: ");
		int x = sc.nextInt();
		boolean isPrime = x % 2 != 0 || x == 2;
		if (isPrime) {
			for (int i = 3; i * i <= x; i++) {
				if (x % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		System.out.println(isPrime ? "Liczba pierwsza" : "Liczba złożona");
	}
}
