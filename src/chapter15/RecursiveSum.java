package chapter15;

/**
 * Simple sum program using a recursive method
 */
public class RecursiveSum {

    /**
     * Sums an array recursively
     * @param a the int[] array
     * @param len the length of the array a
     * @return the sum of the array
     */
    public int sum(int[] a, int len) {
        if(len == 1) {
            return a[0];
        }
        else {
            return a[len] + sum(a, len - 1);
        }
    }
}
