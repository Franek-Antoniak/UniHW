import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean cond1 = n % 4 == 0;
		boolean cond2 = n % 100 != 0;
		boolean cond3 = n % 400 == 0;
		boolean cond4 = cond1 && cond2;
		boolean cond5 = cond4 || cond3;
		System.out.println("Rok " + n + (cond5 ? "" : " nie") + " jest przestępny");
	}
}
