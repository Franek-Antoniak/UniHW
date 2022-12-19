public class Ex5 {
	public static void main(String[] args) {
	}
}

class DrzewoIglaste extends Drzewo {
	int iloscIgiel;
	double dlugoscSzyszki;

	public DrzewoIglaste(Drzewo drzewo, int iloscIgiel, double dlugoscSzyszki) {
		super(drzewo.wiecznieZielone, drzewo.wysokosc, drzewo.przekrojDrzewa);
		this.iloscIgiel = iloscIgiel;
		this.dlugoscSzyszki = dlugoscSzyszki;
	}

	public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel,
	                     double dlugoscSzyszki) {
		super(wiecznieZielone, wysokosc, przekrojDrzewa);
		this.iloscIgiel = iloscIgiel;
		this.dlugoscSzyszki = dlugoscSzyszki;
	}

	@Override
	public String toString() {
		return super.toString() + " iloscIgiel=" + iloscIgiel + ", dlugoscSzyszki=" + dlugoscSzyszki;
	}
}

class DrzewoLisciaste extends Drzewo {
	int ksztaltLiscia;

	public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
		super(wiecznieZielone, wysokosc, przekrojDrzewa);
		this.ksztaltLiscia = ksztaltLiscia;
	}

	public DrzewoLisciaste(Drzewo drzewo, int ksztaltLiscia) {
		super(drzewo.wiecznieZielone, drzewo.wysokosc, drzewo.przekrojDrzewa);
		this.ksztaltLiscia = ksztaltLiscia;
	}

	@Override
	public String toString() {
		return super.toString() + " ksztaltLiscia=" + ksztaltLiscia;
	}
}

class DrzewoOwocowe extends DrzewoLisciaste {
	String nazwaOwoca;

	public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
		super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
		this.nazwaOwoca = nazwaOwoca;
	}

	public DrzewoOwocowe(DrzewoLisciaste drzewo, String nazwaOwoca) {
		super(drzewo.wiecznieZielone, drzewo.wysokosc, drzewo.przekrojDrzewa, drzewo.ksztaltLiscia);
		this.nazwaOwoca = nazwaOwoca;
	}

	@Override
	public String toString() {
		return super.toString() + " nazwaOwoca=" + nazwaOwoca;
	}
}