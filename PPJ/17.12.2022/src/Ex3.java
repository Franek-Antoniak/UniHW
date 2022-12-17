public class Ex3 {
	public static void main(String[] args) {
		Kwadrat k = new Kwadrat(5);
		k.show();
	}
}

class Kwadrat {
	private double bok;
	public Kwadrat(double bok) {
		this.bok = bok;
	}
	public void show() {
		System.out.println("Pole powierzchni kwadratu: " + bok * bok);
		System.out.println("Objętość sześcianu: " + bok * bok * bok);
	}

	public double getBok() {
		return bok;
	}
}