public class Ex4 {
	public static void main(String[] args) {
		Walec w = new Walec(2, 3);
		w.show();
	}
}
class Walec {
	private double promien;
	private double wysokosc;

	public Walec(double promien, double wysokosc) {
		this.promien = promien;
		this.wysokosc = wysokosc;
	}

	public void show() {
		double polePodstawy = Math.PI * promien * promien;
		double objetosc = polePodstawy * wysokosc;
		System.out.println("Pole powierzchni podstawy : " + polePodstawy);
		System.out.println("Objetosc walca: " + objetosc);
	}

	public double getPromien() {
		return promien;
	}

	public double getWysokosc() {
		return wysokosc;
	}
}