/** 220416
 * Codility Lesson 2 Arrays. 
 * OddOccurrencesInArray
 * Find value that occurs in odd number of elements.
 */
package easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antw
 */
public class OddOccurrencesInArray {

    /**
     * .
     * A non-empty array A consisting of N integers is given. The array contains
     * an odd number of elements, and each element of the array can be paired
     * with another element that has the same value, except for one element that
     * is left unpaired.
     *
     * Given an array A consisting of N integers fulfilling the above
     * conditions, returns the value of the unpaired element.
     *
     * @param intArray
     */
    public void printArray(int[] intArray) {
        for (int a : intArray) {
            System.out.print(" " + a + " ");
        }

        System.out.println("");
    }

    public int solution(int[] A) {

        List<Integer> unsorted = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            unsorted.add(A[i]);
        }

        int i = 0, lgth = unsorted.size();
        doWhile:
        while (i < lgth) {
            int j = i + 1;
            while (j < lgth) {
                if (unsorted.get(i) == unsorted.get(j)) {
                    unsorted.remove(j);
                    unsorted.remove(i);
                    lgth = unsorted.size();
                    continue doWhile;
                }
                j++;
            }
            lgth = unsorted.size();
            i++;
        }

        return unsorted.get(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        OddOccurrencesInArray c = new OddOccurrencesInArray();

        int[] a = {9, 3, 9, 3, 9, 7, 9};
        c.printArray(a);

        System.out.println("Returned value: " + c.solution(a));
    }
}

/* Sample Dialogue
run:
 9  3  9  3  9  7  9 
Returned value: 7
BUILD SUCCESSFUL (total time: 0 seconds)
 */
 /* CodeCheck Report: 55% */
