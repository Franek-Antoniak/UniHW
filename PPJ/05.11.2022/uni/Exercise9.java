import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dzien = scanner.nextInt(), result = dzien - 1, miesiac = scanner.nextInt();
		for(int i = 1; i < miesiac; i++) {
			switch(i) {
				case 1, 3, 5, 7, 8, 10, 12 -> result += 31;
				case 4, 6, 9, 11 -> result += 30;
				case 2 -> result += 28;
			}
		}
		// Wynik moze roznic sie o 1 poniewaz nie wiadomo czy liczyc dzisiejszy dzien za ten który minął czy dopiero
		// ten który minie
		System.out.printf("Od poczatku roku mineło %d", result);
	}
}

