import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		int counter = 0, sum = 0;
		Scanner scanner = new Scanner(System.in);
		int x;
		do {
			x = scanner.nextInt();
			sum += x;
			counter++;
		} while (x != 0);
		counter--;
		System.out.printf("Suma liczb: %d\nIle liczb: %d", sum, counter);
	}
}
