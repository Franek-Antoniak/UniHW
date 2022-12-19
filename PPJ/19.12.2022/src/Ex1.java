import java.util.Arrays;
import java.util.LinkedList;

public class Ex1 {
	public static void main(String[] args) {
		Phrase[] phrases = new Phrase[2];
		phrases[0] = new Phrase();
		phrases[1] = new PhraseList();
		for (Phrase p : phrases) {
			p.addWordAtEnd("Hello ");
		}
		for (Phrase p : phrases) {
			p.addWordAtEnd("World");
		}
		for (Phrase p : phrases) {
			p.show();
			System.out.println();
		}
	}
}

class Phrase {
	private char[] chars = new char[0];

	void addWordAtEnd(String word) {
		char[] newChars = new char[chars.length + word.length()];
		System.arraycopy(chars, 0, newChars, 0, chars.length);
		System.arraycopy(word.toCharArray(), 0, newChars, chars.length, word.length());
		chars = newChars;
	}

	void show() {
		for (char c : chars) {
			System.out.print(c);
		}
	}
}

class PhraseList extends Phrase {
	private LinkedList<Character> chars = new LinkedList<>();

	@Override
	void addWordAtEnd(String word) {
		for (char c : word.toCharArray()) {
			chars.add(c);
		}
	}

	@Override
	void show() {
		for (char c : chars) {
			System.out.print(c);
		}
	}
}