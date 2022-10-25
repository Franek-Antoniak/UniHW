public class Ex1 {
	public static void main(String[] args) {
		byte a = -0b10000000;
		short b = -0x8000;
		int c = -020000000000;
		long d = -0x8000000000000000L;
		// najmniejsza możliwa wartosć dla float'a:
		float e = -1.0f / 0.0f;
		// najmniejsza możliwa skończona wartosć dla float'a:
		e = -3.4028235E38f;
		// najmniejsza możliwa wartosć dla double'a:
		double f = -1.0 / 0.0;
		// najmniejsza możliwa skończona wartosć dla double'a:
		f = -1.7976931348623157E308;
		char g = 0b0;
		boolean h = 0b0 > 0b1;
		a = 0b01111111;
		b = 0x7fff;
		c = 017777777777;
		d = 0x7fffffffffffffffL;
		// największa możliwa wartosć dla float'a:
		e = 1.0f / 0.0f;
		// największa możliwa skończona wartosć dla float'a:
		e = 3.4028235E38f;
		// największa możliwa wartosć dla double'a:
		f = 1.0 / 0.0;
		// największa możliwa skończona wartosć dla double'a:
		f = 1.7976931348623157E308;
		g = 0xffff;
		h = 0b1 > 0b0;
	}
}
