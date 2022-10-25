public class Ex5 {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int x = in.nextInt();
		System.out.println(
				x < 10 ? x + " is < 10" : (x < 100 ? x + " is < 100" : (x < 1000 ? x + " is < 1000" : x + " is >= 1000")));
	}
}
