package chapter14;

/**
   The sort method of this class sorts an array, using the merge 
   sort algorithm. The original code is taken from the Big Java book.
*/
public class StringMergeSorter
{
   /**
      Sorts an array, using merge sort.
      @param a the array to sort
   */
   public static void sort(String[] a)
   {  
      if (a.length <= 1) { return; }
      String[] first = new String[a.length / 2];
      String[] second = new String[a.length - first.length];

      // Copy the first half of a into first, the second half into second
      for (int i = 0; i < first.length; i++)
      {
         first[i] = a[i];
      }
      for (int i = 0; i < second.length; i++)
      {
         second[i] = a[first.length + i];
      }
      sort(first);
      sort(second);
      merge(first, second, a);
   }

   /**
      Merges two sorted arrays into an array
      @param first the first sorted array
      @param second the second sorted array
      @param a the array into which to merge first and second
   */
   private static void merge(String[] first, String[] second, String[] a)
   {
      int iFirst = 0; // Next element to consider in the first array
      int iSecond = 0; // Next element to consider in the second array
      int j = 0; // Next open position in a

      // As long as neither iFirst nor iSecond is past the end, move
      // the smaller element into a
      while (iFirst < first.length && iSecond < second.length)
      {  
         if (first[iFirst].compareTo(second[iSecond]) < 0)
         {  
            a[j] = first[iFirst];
            iFirst++;
         }
         else
         {  
            a[j] = second[iSecond];
            iSecond++;
         }
         j++;
      }

      // Note that only one of the two loops below copies entries
      // Copy any remaining entries of the first array
      while (iFirst < first.length) 
      { 
         a[j] = first[iFirst]; 
         iFirst++; j++;
      }
      // Copy any remaining entries of the second half
      while (iSecond < second.length) 
      { 
         a[j] = second[iSecond]; 
         iSecond++; j++;
      }
   }
}
