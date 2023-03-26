package zadanie.pierwsze;

import java.util.Arrays;

public class Main {
    private static <T, R> void transform(T[] in, R[] out, Transform<T, R> trans) {
        for (int i = 0; i < in.length; i++) {
            out[i] = trans.apply(in[i]);
        }
    }

    public static void main(String[] args) {
        // First approach
        String[] tab_1 = {"Alice", "Sue", "Janet", "Bea"};
        Integer[] tab_2 = new Integer[tab_1.length];
        transform(tab_1, tab_2, new StrToInt());
        Arrays.stream(tab_2).forEach(System.out::print);
        System.out.println();

        // Second approach
        Character[] tab_3 = new Character[tab_1.length];
        transform(tab_1, tab_3, new Transform<String, Character>() {
            @Override
            public Character apply(String s) {
                if (s.length() == 0) {
                    return null;
                }
                return s.charAt(0);
            }
        });
        Arrays.stream(tab_3).forEach(System.out::print);
        System.out.println();

        // Third approach
        String[] tab_4 = new String[tab_1.length];
        transform(tab_1, tab_4, String::toUpperCase);
        Arrays.stream(tab_4).forEach(System.out::print);
        System.out.println();
    }
}

@FunctionalInterface
interface Transform<T, R> {
    R apply(T s);
}

class StrToInt implements Transform<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

