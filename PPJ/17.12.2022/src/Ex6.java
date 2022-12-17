public class Ex6 {
	public static void main(String[] args) {
	}
}


class KulaNa {
	private double promien;

	public KulaNa(Szescian s) {
		promien = Math.sqrt(2 * s.getBok() * s.getBok() / 3);
	}

	public KulaNa(Walec w) {
		promien = Math.sqrt(w.getPromien() * w.getPromien() + (0.5 * w.getWysokosc()) * (0.5 * w.getWysokosc()));
	}
}

class Szescian {
	private double bok;

	public Szescian(double bok) {
		this.bok = bok;
	}

	public double getBok() {
		return bok;
	}
}