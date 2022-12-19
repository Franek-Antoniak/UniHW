public class Ex4 {
	public static void main(String[] args) {
		Drzewo d = new Drzewo(true, 5, "...");
		System.out.println(d);
	}
}

class Drzewo {
	boolean wiecznieZielone;
	int wysokosc;
	String przekrojDrzewa;

	public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
		this.wiecznieZielone = wiecznieZielone;
		this.wysokosc = wysokosc;
		this.przekrojDrzewa = przekrojDrzewa;
	}

	@Override
	public String toString() {
		return "wiecznieZielone=" + wiecznieZielone + ", wysokosc=" + wysokosc + ", przekrojDrzewa=" + przekrojDrzewa
				+ "";
	}
}
