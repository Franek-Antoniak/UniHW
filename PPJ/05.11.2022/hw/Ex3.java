import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj ile liczb chcesz wprowadzić: ");
		int n = scan.nextInt();
		int max = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Podaj następną liczbę: ");
			int x = scan.nextInt();
			if (x > max) {
				max = x;
			}
		}
		System.out.println("Największa liczba to: " + max);
	}
}
