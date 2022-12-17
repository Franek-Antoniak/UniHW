public class Ex1 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Jan";
		p.surname = "Kowalski";
		p.birthyear = 1990;
	}
}


class Person {
	public String name;
	public String surname;
	public int birthyear;
}