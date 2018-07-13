package chapter14;


public class RecursiveSumTester {

    public static void main(String[] args) {
        int[] array = {1,4,3,6,5,7,22};
        RecursiveSum sum = new RecursiveSum();
        System.out.println(sum.sum(array, array.length - 1));
    }
}
