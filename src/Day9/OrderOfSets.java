package Day9;

import java.util.HashSet;

public class OrderOfSets {
    public static void main(String[] args) {
        String[] a = {"Java", "C", "PHP", "JavaScript", "Python", "Rust", "Haskell", "Go", "Prolog"};
        OrderOfSets b = new OrderOfSets();
        b.printHashSet(a);
    }

    public void printHashSet(String[] array) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        System.out.println(set);
    }
}
