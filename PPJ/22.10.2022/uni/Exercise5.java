public class Exercise5 {
	public static void main(String[] args) {
		byte x = 5;
		byte y = 10;
/*		 gdy dodajemy do siebie bajty to wynik jest typu int
		 dlatego musimy rzutowac wynik na typ byte
		 lub taki kod nie będzie działać
		 byte z = (x + y);*/
		int a = x + y;
		long b = x + y;
		float c = x + y;
		double d = x + y;
//		short e = (x + y);
//		char e = (x + y);
	}
}
