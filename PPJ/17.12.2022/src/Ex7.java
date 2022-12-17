public class Ex7 {
	public static void main(String[] args) {
		Donkey donkey = new Donkey(Math.random() * 30);
		while(!donkey.isFlying()) {
			Balloon balloon = new Balloon();
			donkey.addBalloon(balloon);
		}
		donkey.shout();
	}
}


class Balloon {
	private double helium;

	public Balloon() {
		helium = Math.random() * 0.004 + 0.005;
	}

	public double getLoad() {
		return (6 * helium) / 0.007;
	}
}

class Donkey {
	private double mass;
	private Balloon[] balloons;

	public Donkey(double mass) {
		this.mass = mass;
		balloons = new Balloon[0];
	}

	public void addBalloon(Balloon balloon) {
		Balloon[] temp = new Balloon[balloons.length + 1];
		for (int i = 0; i < balloons.length; i++) {
			temp[i] = balloons[i];
		}
		temp[temp.length - 1] = balloon;
		balloons = temp;
	}

	public boolean isFlying() {
		double load = 0;
		for (Balloon balloon : balloons) {
			load += balloon.getLoad();
		}
		return load >= mass * 1000;
	}

	public void shout() {
		System.out.println("Ja latam!!!");
	}
}
