import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		//		String temp1 = "* * * * *", temp2 = " * * * * ";
		//		for (int i = 1; i <= 6; i++) {
		//			System.out.println(i % 2 == 1 ? temp1: temp2);
		//		}
		Scanner scanner = new Scanner(System.in);
		int iMAX = scanner.nextInt(), qMAX = scanner.nextInt();
		for (int i = 1; i <= iMAX; i++) {
			for (int q = 1; q <= qMAX; q++) {
				boolean res = i % 2 == 1;
				res = (q % 2 == 1) == res;
 				System.out.print(res ? "*": " ");
			}
			System.out.println();
		}
	}
}
