public class Ex3 {
	public static void main(String[] args) {
		Drzewo[] drzewa = new Drzewo[]{
				new DrzewoOwocowe("Jabłoń", 10, 10, 10),
				new DrzewoOwocowe("Gruszka", 10, 10, 10),
				new DrzewoOwocowe("Śliwka", 10, 10, 10),
				new DrzewoBezOwocowe("Buk", 10, 10),
				new DrzewoBezOwocowe("Dąb", 10, 10)
		};
		for (var d: drzewa)
			System.out.println(d);
		for (var d: drzewa) {
			try {
				d.zbierzOwoc();
			} catch (DrzewoBezOwocoweException e) {
				System.out.println(e.getMessage());
			}
		}
		for (var d: drzewa)
			System.out.println(d);
	}
}

class DrzewoBezOwocoweException extends Exception {
	public DrzewoBezOwocoweException(String message) {
		super(message);
	}
}

abstract class Drzewo {
	private String nazwa;
	private int wiek;
	private int wysokosc;

	public Drzewo(String nazwa, int wiek, int wysokosc) {
		this.nazwa = nazwa;
		this.wiek = wiek;
		this.wysokosc = wysokosc;
	}

	abstract void zbierzOwoc() throws DrzewoBezOwocoweException;

	@Override
	public String toString() {
		return "Drzewo{" + "nazwa='" + nazwa + '\'' + ", wiek=" + wiek + ", wysokosc=" + wysokosc;
	}
}

class DrzewoBezOwocowe extends Drzewo {
	public DrzewoBezOwocowe(String nazwa, int wiek, int wysokosc) {
		super(nazwa, wiek, wysokosc);
	}

	@Override
	void zbierzOwoc() throws DrzewoBezOwocoweException {
		throw new DrzewoBezOwocoweException("Sosna nie ma owoców");
	}
}

class DrzewoOwocowe extends Drzewo {
	private int iloscOwocow;

	public DrzewoOwocowe(String nazwa, int wiek, int wysokosc, int iloscOwocow) {
		super(nazwa, wiek, wysokosc);
		this.iloscOwocow = iloscOwocow;
	}

	@Override
	void zbierzOwoc() {
		iloscOwocow = 0;
	}

	@Override
	public String toString() {
		return super.toString() + ", iloscOwocow=" + iloscOwocow + '}';
	}
}

