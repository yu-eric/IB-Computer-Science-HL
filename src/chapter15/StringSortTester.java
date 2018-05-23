package chapter15;

import java.util.ArrayList;

/**
 * Created by eyu9209 on 5/23/2018.
 */
public class StringSortTester {

    public static void main(String[] args) {

        StringSort sort = new StringSort();
        ArrayList<String> list = new ArrayList<>();
        list.add("bob");
        list.add("Apple");
        list.add("cat");
        list.add("blue");

        System.out.println(sort.sort(list));
    }
}
