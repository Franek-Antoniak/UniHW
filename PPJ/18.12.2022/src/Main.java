import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MTab tab = new MTab();
        for (String s : args) {
            System.out.println(s);
            String[] pol = s.split("\\|");
            boolean isExit = direct(pol, tab);
            if (isExit) {
                break;
            }
        }
        boolean isExit = false;
        while (!isExit) {
            String[] x = scanner.next()
                                .split("\\|");
            isExit = direct(x, tab);
        }
    }

    public static boolean direct(String[] pol, MTab tab) {
        switch (pol[0]) {
            case "QUIT":
                return true;
            case "ADD":
                tab.add(pol[1].charAt(0));
                break;
            case "ADD_WORD":
                char[] znaki = pol[1].toCharArray();
                for (char z : znaki) {
                    tab.add(z);
                }
                break;
            case "GET":
                tab.showChar(Integer.parseInt(pol[1]));
                break;
            case "REMOVE":
                tab.removeChar(Integer.parseInt(pol[1]));
                break;
            case "REPLACE":
                tab.replaceChars(Integer.parseInt(pol[1]), Integer.parseInt(pol[2]));
                break;
            case "COUNT_LETTER":
                tab.countLetter(pol[1].charAt(0));
                break;
            case "SHOW":
                tab.showTab();
                break;
            case "SORT":
                tab.sort();
                break;
            default:
                System.out.println("Podano zle polecenie");
                break;
        }
        return false;
    }
}

class MTab {
    private char[] tab = new char[0];

    public void add(char x) {
        if (x < 'a' || x > 'z') {
            System.out.println("Liczba z poza zakresu");
            return;
        }
        char[] temp = new char[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            temp[i] = tab[i];
        }
        temp[temp.length - 1] = x;
        tab = temp;
    }

    public void showChar(int index) {
        if (index >= tab.length || index < 0) {
            System.out.println("Podany index nie miesci sie w prawidlowym zakresie");
            return;
        }
        System.out.println(tab[index]);
    }

    public void removeChar(int index) {
        if (index >= tab.length || index < 0) {
            System.out.println("Podany index nie miesci sie w prawidlowym zakresie");
            return;
        }
        char[] temp = new char[tab.length - 1];
        for (int i = 0; i < index; i++) {
            temp[i] = tab[i];
        }
        for (int i = index + 1; i < temp.length; i++) {
            temp[i] = tab[i];
        }
        tab = temp;
    }

    public void replaceChars(int index1, int index2) {
        if (index1 >= tab.length || index1 < 0) {
            System.out.println("Pierwszy podany index nie miesci się w prawidlowym zakresie");
            return;
        }
        if (index2 >= tab.length || index2 < 0) {
            System.out.println("Drugi podany index nie miesci się w prawidlowym zakresie");
            return;
        }
        char temp = tab[index1];
        tab[index1] = tab[index2];
        tab[index2] = temp;
    }

    public void countLetter(char x) {
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x) {
                counter++;
            }
        }
        System.out.println("Znak: " + x + " wystepuje dokladnie " + counter + " razy");
    }

    public void showTab() {
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + (i == tab.length - 1 ? "" : ","));
        }
        System.out.println("]");
    }

    public void sort() {
        char[] counter = new char[300];
        for (int i = 0; i < tab.length; i++) {
            counter[tab[i]]++;
        }
        int index = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            while (counter[i] > 0) {
                tab[index] = i;
                counter[i]--;
                index++;
            }
        }
    }
}