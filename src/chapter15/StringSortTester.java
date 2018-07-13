package chapter15;

import java.util.ArrayList;

public class StringSortTester {

    public static void main(String[] args) {

        StringSort sort = new StringSort();
        ArrayList<String> list = new ArrayList<>();
        list.add("bob");
        list.add("Apple");
        list.add("cat");
        list.add("blue");
        list.add("Bob");

        System.out.println(sort.sort(list));
    }
}
