import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int wr = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			wr *= i;
			System.out.println(wr);
		}
	}
}
