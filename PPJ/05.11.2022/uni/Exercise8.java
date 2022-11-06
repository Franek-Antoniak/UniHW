public class Exercise8 {
	public static void main(String[] args) {
		double product = 0;
		for (int i = 0; i < 10; i++) {
			product += 1.0 / (1 << i);
			System.out.println(product);
		}
	}
}
