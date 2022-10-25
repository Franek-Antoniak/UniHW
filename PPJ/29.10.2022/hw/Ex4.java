public class Ex4 {
	public static void main(String[] args) {
		int a = 10, b = 5, c = 1, res;
		res = a - ++c - ++b;
		// res = 10 - (2) - (6) = 2
		System.out.println("Wynik : " + res);
	}
}
