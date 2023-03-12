package zadanie.pierwsze;

public class Main {
    public static void main(String[] args) {

        Spiewak s1 = new Spiewak("Eminem") {
            @Override
            public String spiewaj() {
                return "You own it, you better never let it go";
            }
        };

        Spiewak s2 = new Spiewak("Eagles") {
            @Override
            public String spiewaj() {
                return "Hotel California";
            }
        };

        Spiewak s3 = new Spiewak("Dżem") {
            @Override
            public String spiewaj() {
                return "Chwila, która trwa może być najlepszą z Twoich chwil...";
            }
        };

        Spiewak sp[] = {s1, s2, s3};

        for (Spiewak s : sp) {
            System.out.println(s);
        }
        System.out.println("\n" + Spiewak.najglosniej(sp));
    }
}