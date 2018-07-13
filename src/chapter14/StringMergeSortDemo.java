package chapter14;

import java.util.Arrays;

/**
   This program demonstrates the merge sort algorithm by
   sorting an array that is filled with Strings
*/
public class StringMergeSortDemo
{  
   public static void main(String[] args)
   {  
      String[] a = {"bob", "Billy", "jim", "Alisha", "Carl", "James", "Earl"};
      System.out.println("Original array: " + Arrays.toString(a));

      StringMergeSorter.sort(a);

      System.out.println("Sorted array: " + Arrays.toString(a));
   }
}

