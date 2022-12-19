public class Ex3 {
	public static void main(String[] args) {
		Osoba[] osoby = new Osoba[]{new Osoba("Jan"), new Spawacz("Jan", 5)};
		for (Osoba o : osoby) {
			System.out.println(o.wyswietl());
		}
	}
}
class Osoba {
	private String imie;
	public Osoba(String imie) {
		this.imie = imie;
	}
	public String wyswietl() {
		return "Imie: " + imie;
	}
}

class Spawacz extends Osoba {
	private int stazpracy;
	public Spawacz(String imie, int stazpracy) {
		super(imie);
		this.stazpracy = stazpracy;
	}
	@Override
	public String wyswietl() {
		return super.wyswietl() + ", stazpracy: " + stazpracy;
	}
}