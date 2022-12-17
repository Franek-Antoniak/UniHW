public class Ex2 {
	public static void main(String[] args) {
		Fruit f = new Fruit("Apple");
		f.show();

	}
}

class Fruit {
	String name;
	double weight;
	public Fruit(String name) {
		this.name = name;
		weight = Math.random() * 0.3 + 0.5;
	}
	public void show() {
		System.out.println("Nazwa: " + name + " Waga: " + weight);
	}
}
