package zadanie.pierwsze;

public abstract class Spiewak {
    private String nazwisko;
    private int numer_startowy;
    private static int counter = 1;

    public Spiewak(String nazwisko) {
        this.nazwisko = nazwisko;
        this.numer_startowy = counter++;
    }

    abstract public String spiewaj();

    @Override
    public String toString() {
        return String.format("(%d) %s: %s", numer_startowy, nazwisko, spiewaj());
    }

    public static Spiewak najglosniej(Spiewak[] spiewacy) {
        if (spiewacy.length == 0) {
            return null;
        }
        Spiewak zwyciezca = spiewacy[0];
        for (Spiewak spiewak : spiewacy) {
            zwyciezca = max(spiewak, zwyciezca);
        }
        return zwyciezca;
    }

    public static Spiewak max(Spiewak first, Spiewak second) {
        if (StringCommons.countUpperCase(first.spiewaj()) > StringCommons.countUpperCase(second.spiewaj())) {
            return first;
        } else {
            return second;
        }
    }
}
