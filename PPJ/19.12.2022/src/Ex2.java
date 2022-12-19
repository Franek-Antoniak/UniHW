public class Ex2 {
	public static void main(String[] args) {
		Prostokat p1 = new Prostokat(2, 3);
		Prostokat p2 = new Prostokat(3, 2);
		System.out.println(p1.getPolePowierzchni() == p2.getPolePowierzchni());
		Prostopadloscian pp1 = new Prostopadloscian(2, 3, 4);
		Prostopadloscian pp2 = new Prostopadloscian(p1, 4);
		System.out.println(pp1.getPolePowierzchni() == pp2.getPolePowierzchni());
		System.out.println(pp1.getObjetosc() == pp2.getObjetosc());
		Trojkat t1 = new Trojkat(3);

		Ostroslup ostroslup = new Ostroslup(3, 4);
		Ostroslup ostroslup2 = new Ostroslup(t1, 4);
		System.out.println(ostroslup.getPolePowierzchni() == ostroslup2.getPolePowierzchni());
		System.out.println(ostroslup.getObjetosc() == ostroslup2.getObjetosc());

		Graniastoslup graniastoslup = new Graniastoslup(3, 4);
		Graniastoslup graniastoslup2 = new Graniastoslup(t1, 4);

		System.out.println(graniastoslup.getPolePowierzchni() == graniastoslup2.getPolePowierzchni());
		System.out.println(graniastoslup.getObjetosc() == graniastoslup2.getObjetosc());
	}
}

class Prostokat {
	private double a;
	private double b;

	public Prostokat(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getPolePowierzchni() {
		return a * b;
	}

	protected double getA() {
		return a;
	}

	protected double getB() {
		return b;
	}
}

class Prostopadloscian extends Prostokat {
	private double h;
	public Prostopadloscian(double a, double b, double h) {
		super(a, b);
		this.h = h;
	}

	public Prostopadloscian(Prostokat prostokat, double h) {
		super(prostokat.getA(), prostokat.getB());
		this.h = h;
	}

	public double getObjetosc() {
		return super.getPolePowierzchni() * h;
	}

	public double getPolePowierzchni() {
		return 2 * (super.getPolePowierzchni() + h * (getA() + getB()));
	}
}


class Trojkat {
	private double a;

	public Trojkat(double a) {
		this.a = a;
	}

	public double getPolePowierzchni() {
		return a * a * Math.sqrt(3) / 4;
	}

	protected double getA() {
		return a;
	}
}

class Ostroslup extends Trojkat {
	private double h;

	public Ostroslup(double a, double h) {
		super(a);
		this.h = h;
	}

	public Ostroslup(Trojkat trojkat, double h) {
		super(trojkat.getA());
		this.h = h;
	}

	public double getObjetosc() {
		return super.getPolePowierzchni() * h / 3;
	}

	public double getPolePowierzchni() {
		return super.getPolePowierzchni() + 3 * getA() * h * 0.5;
	}


}

class Graniastoslup extends Trojkat {
	private double h;

	public Graniastoslup(double a, double h) {
		super(a);
		this.h = h;
	}

	public Graniastoslup(Trojkat trojkat, double h) {
		super(trojkat.getA());
		this.h = h;
	}

	public double getObjetosc() {
		return super.getPolePowierzchni() * h;
	}

	public double getPolePowierzchni() {
		return super.getPolePowierzchni() + super.getA() * h * 3;
	}
}

