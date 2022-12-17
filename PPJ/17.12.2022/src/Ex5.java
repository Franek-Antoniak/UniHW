public class Ex5 {
	public static void main(String[] args) {
		Walec walec = new Walec(2, 3);
		KulaW kula = new KulaW(walec);
		Kwadrat kwadrat = new Kwadrat(2);
		KulaW kula2 = new KulaW(kwadrat);
		System.out.println(kula);
		System.out.println(kula2);
	}
}

class KulaW {
	private double promien;

	public KulaW(Walec walec) {
		promien = Math.min(walec.getPromien(), walec.getWysokosc() / 2);
	}

	public KulaW(Kwadrat kwadrat) {
		promien = kwadrat.getBok() / 2;
	}

	@Override
	public String toString() {
		return "Kula o promieniu " + promien;
	}

	public double getPromien() {
		return promien;
	}
}

