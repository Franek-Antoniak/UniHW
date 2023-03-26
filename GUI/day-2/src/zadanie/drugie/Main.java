package zadanie.drugie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Person[] arr = {new Person("Eve", 43), new Person("Joe", 34), new Person("Kim", 30), new Person("Joe", 25), new Person("Kim", 20), new Person("Eve", 27),};
        Comparator<Person> cmp = compCmp((p1, p2) -> p1.getName().compareTo(p2.getName()), Person::getAge);
        Arrays.sort(arr, cmp);
        System.out.println(Arrays.toString(arr));
    }

    public static <T, R extends Comparable<R>> Comparator<T> compCmp(Comparator<T> comp, Function<T, R> func) {
        return (o1, o2) -> {
            if (comp.compare(o1, o2) == 0) {
                return func.apply(o1).compareTo(func.apply(o2));
            }
            return comp.compare(o1, o2);
        };
    }
}

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}






