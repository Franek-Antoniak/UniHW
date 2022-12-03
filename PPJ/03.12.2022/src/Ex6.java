public class Ex6 {
	public static void main(String[] args) {
		int wrt = 5;
		System.out.println(wrt);
		modifyValue(wrt);
		System.out.println(wrt);
		// ponieważ podajemy wartość prymitywną do metody, to nie modyfikujemy wartości zmiennej
		// do metody przekazujemy wartość, a nie referencję
	}

	public static void modifyValue(int value) {
		System.out.println(value);
		value *= 5;
		System.out.println(value);
	}
}
