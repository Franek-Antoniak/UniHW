import java.util.Random;

public class Ex2 {
	public static void main(String[] args) {
		Rakieta rakieta = new Rakieta("Rakieta", 500);
		rakieta.zatankuj();
		try {
			rakieta.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

class Rakieta {
	String nazwa;
	int wagaPaliwa;

	public Rakieta(String nazwa, int wagaPaliwa) {
		this.nazwa = nazwa;
		this.wagaPaliwa = wagaPaliwa;
	}

	public void zatankuj() {
		Random r = new Random();
		int x = r.nextInt(1000);
		wagaPaliwa += x;
	}

	public void start() throws Exception {
		if (wagaPaliwa < 1000) {
			throw new Exception("start anulowany - za mało paliwa");
		}
	}
}
