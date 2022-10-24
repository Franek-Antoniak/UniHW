// Main method with main class
public class Exercise2 {
	public static void main(String[] args) {
/*		przypisania do zmiennej typu char sumy zmiennych typu char i int,
		trzeba będzie rzutować, bez rzutowania będzie błąd kompilacji
		Możliwy "lossy conversion", przykład:  */
		int x = 212412421;
		char a = (char) ('a' + x);

/*		 przypisania do zmiennej typu int sumy zmiennych typu int oraz char
		 nic nie trzeba rzutować, wszystko jest ok */
		int c = 1241245 + 'a';

		// przypisania do zmiennej typu float sumy zmiennych typu float oraz double,
		// trzeba rzutować, bez rzutowania będzie błąd kompilacji
		// Możliwy "lossy conversion", przykład:
		double dob = 124124.124124;
		float d = (float) (1.5f + dob);


		// przypisania do zmiennej typu byte sumy zmiennych typu byte oraz int.
		// trzeba rzutować, bez rzutowania będzie błąd kompilacji
		// Możliwy "lossy conversion", przykład:
		byte b = (byte) (1 + x);
	}
}