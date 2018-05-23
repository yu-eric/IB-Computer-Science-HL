package chapter15;

/**
 * Created by eyu9209 on 5/23/2018.
 */
public class RecursiveSum {

    public int sum(int[] a, int len) {
        if(len == 1) {
            return a[0];
        }
        else {
            return a[len] + sum(a, len - 1);
        }
    }
}
