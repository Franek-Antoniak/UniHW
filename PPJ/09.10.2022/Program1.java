import java.util.*;
import java.lang.*;

public class Program1 {
	public static void main(String args[]) {
		// Zadanie 1 i 2 i 3
		System.out.println("Hello World!");
		System.out.println(args[0]);
		// Zadanie 4
		System.out.println("&& || ! != == < > <= >=");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] tab = new int[]{8, 16, 2};
		System.out.println("Podana liczba w systemie " + 10 + ": " + x);
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Podana liczba w systemie " + tab[i] + ": " + convertIntoSystem(x, tab[i]));
		}	
		double y = (double) 10 / 3;
		System.out.println("Literał liczb rzeczywistych: " + y);
		char z = (char) 93;
		System.out.println("Literał znakowy: " + z);
		char d = '\u4E00';
		System.out.println("Literał znakowy w UTF16: " + d);
		// Zadanie 5
		printTableConjunction();
		printTableAlternative();
	}

	public static String convertIntoSystem(int x, int n) {
		String result = "";
		while (x > 0) {
			result = x % n + result;
			x /= n;
		}
		return result;
	}

	public static void printTableConjunction() {
		boolean x = true, y = true;
		System.out.println("Conjuction table: ");
		System.out.println("" + x + " && " + y + " => " + (x && y));
		x = false;
		System.out.println(x + " && " + y + " => " + (x && y));
		y = false;
		System.out.println(x + " && " + y + " => " + (x && y));
		x = true;
		System.out.println(x + " && " + y + " => " + (x && y));
	}

	public static void printTableAlternative() {
		boolean x = true, y = true;
		System.out.println("Alternative table: ");
		System.out.println(x + " || " + y + " => " + (x || y));
		x = false;
		System.out.println(x + " || " + y + " => " + (x || y));
		y = false;
		System.out.println(x + " || " + y + " => " + (x || y));
		x = true;
		System.out.println(x + " || " + y + " => " + (x || y));
	}
}