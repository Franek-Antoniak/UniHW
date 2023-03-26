package zadanie.trzecie;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Max", Sex.M, Size.XL, Country.NL),
                new Person("Jan", Sex.M, Size.S, Country.PL),
                new Person("Eva", Sex.F, Size.XS, Country.NL),
                new Person("Lina", Sex.F, Size.L, Country.DE),
                new Person("Mila", Sex.F, Size.S, Country.DE),
                new Person("Ola", Sex.F, Size.M, Country.PL),
        };
        Comparator<Person> sexThenSize = (x, y) -> {
            if (x.sex == y.sex) {
                return x.size.compareTo(y.size);
            }
            return x.sex == Sex.F ? -1 : 1;
        };
        Arrays.sort(persons, sexThenSize);

        printArray("Persons by sex and then size", persons);
        Arrays.sort(persons, (x, y) -> {
            if (x.size == y.size) {
                return x.name.compareTo(y.name);
            }
            return x.size.compareTo(y.size);
        });

        printArray("Persons by size and then name", persons);

        Country[] countries = Country.values();
        Arrays.sort(countries, Comparator.comparing(x -> x.s));

        printArray("Countries by name", countries);
    }


    public static <T> void printArray(String title, T[] array) {
        System.out.println("*** " + title + " ***");
        for (T t : array) {
            System.out.println(t);
        }
    }
}

enum Sex {
    F, M;
}

enum Size {
    XS, S, M, L, XL
}

enum Country {
    PL("Polska"),
    NL("Nederland"),
    DE("Deutschland");
    String s;

    Country(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}

class Person {
    String name;
    Sex sex;
    Size size;
    Country country;

    public Person(String name, Sex sex, Size size, Country country) {
        this.name = name;
        this.sex = sex;
        this.size = size;
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("%s: sex=%s, size=%s, country=%s", name, sex, size, country);
    }
}