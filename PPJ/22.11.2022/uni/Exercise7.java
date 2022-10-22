import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		char letter = (char) number;
		System.out.println(">" + letter + "<" + " - " + number);
	}
}
