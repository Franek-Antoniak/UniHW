public class Ex4 {
	public static void main(String[] args) {
		int[] arr = {13, 15, 17};
		// I have used function to make code more readable, but it is not necessary.
		// I am sorry if this is not yet legal.
		for (int j : arr) {
			if (isPrime(j)) {
				analyzePrime(j);
			}
		}
	}

	private static void analyzePrime(int j) {
		System.out.println("If " + j + " were to be a complex number it would have to be divisible\n" +
				"by one of the numbers in the range from 3 to the root of itself or just even.");
		if (j % 2 == 1) {
			System.out.println(j + " is odd");
		}
		for (int i = 3; i * i <= j; i += 2) {
			System.out.println(j + " is not divisible by " + i);
		}
		System.out.println("It proves that " + j + " is a prime number.\n");
	}

	private static boolean isPrime(int j) {
		if (j % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= j; i += 2) {
			if (j % i == 0) {
				return false;
			}
		}
		return true;
	}
}
