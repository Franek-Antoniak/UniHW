import java.util.Scanner;

public class Exercise4 {
	// main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		// Nie używamy zbioru C ponieważ bazujemy na wartośći typu int oraz
		// zbiór C zawsze będzie się zawierał w zbiorach A i B
		// Z tego wynika że:
		char res = x >= 0 ? 'A' : (x <= 1 ? 'B' : 'C');
		// Będzie dokładnie tym samym co:
		char res1 = x >= 0 ? 'A' : 'B';
	}

}
