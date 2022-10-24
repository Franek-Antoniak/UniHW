public class Ex1 {
    public static void main(String[] args) {
        // Min values
        byte a = -0b10000000;
        short b = -0x8000;
        int c = -020000000000;
        long d = -0x8000000000000000L;
        float e = -1.0f/0.0f;
        double f = -1.0/0.0;
        char g = 0b0;
        boolean h = 0b0 > 0b1;
        a = 0b01111111;
        b = 0x7fff;
        c = 017777777777;
        d = 0x7fffffffffffffffL;
        e = 1.0f/0.0f;
        f = 1.0/0.0;
        g = 0xffff;
        h = 0b1 > 0b0;
    }
}
