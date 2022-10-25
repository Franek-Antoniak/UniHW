import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj ile liczb chcesz sumować: ");
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Podaj następną liczbę: ");
			int number = scan.nextInt();
			sum += number;
		}
		System.out.println("Suma liczb wynosi: " + sum);
	}
}
