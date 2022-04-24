/** 220416
 * Codility Lesson 2 Arrays.
 * OddOccurrencesInArray
 * Find value that occurs in odd number of elements.
 */
package easy;

import java.time.Duration;
import java.time.Instant;
import data.TestData;
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
    public int solution(int[] A) {
        int lgth = A.length;

        // Return result if N = 1 or N = 2
        if (lgth == 1) {
            return A[0];
        }

        if (lgth % 2 == 0) {
            System.out.println("Error. N should be odd int.");
            System.exit(0);
        }

        Integer[] buff = new Integer[lgth];

        // compare and index into buffer if found paired
        int next, ai, aj;
        for (int i = 0; i < lgth; i++) {
            if (buff[i] == null) {
                next = i + 1;
                for (int j = next; j < lgth; j++) {
                    if (buff[j] == null) {
                        if (A[i] == A[j]) {
                            buff[i] = A[i];
                            buff[j] = A[j];
                            break;
                        }

                        // End of Search
                        if (j == lgth - 1) {
                            return A[i];
                        }
                    }
                }
            }
        }

        // scan thru buffer for null
        for (int k = 0; k < lgth; k++) {
            if (buff[k] == null) {
                return A[k];
            }

        }

        return A[0];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        OddOccurrencesInArray C = new OddOccurrencesInArray();
        TestData S = new TestData();

        int[] a = {9, 3, 9, 3, 9, 7, 9};
        S.printArray(a);
        System.out.println("a Returned value: " + C.solution(a));
        int[] b = {9};
        System.out.println("b Returned value: " + C.solution(b));
        int[] d = {-4, 0, -4, -4, 1, 0, 3, -4, 4};
        System.out.println("d Returned value: " + C.solution(d));

        int[] x = S.evenOdd(99999);
        Instant start = Instant.now();
        System.out.println("Data size:" + x.length + " Returned value: " + C.solution(x));
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: " + timeElapsed.toMillis() + " ms");
    }
}

/* Sample Dialogue
run:
 9  3  9  3  9  7  9 
a Returned value: 7
b Returned value: 9
d Returned value: 1
Data size:99999 Returned value: 50000
Time taken: 7533 ms
BUILD SUCCESSFUL (total time: 7 seconds)
 */

 /* CodeCheck Report: 66% 
Analysis
Detected time complexity:
O(N**2)
expand allExample tests
▶example1
example test✔OK
expand allCorrectness tests
▶simple1
simple test n=5✔OK
▶simple2
simple test n=11✔OK
▶extreme_single_item
[42]✔OK
▶small1
small random test n=201✔OK
▶small2
small random test n=601✔OK
expand allPerformance tests
▶medium1
medium random test n=2,001✔OK
▶medium2
medium random test n=100,003✘TIMEOUT ERROR
Killed. Hard limit reached: 7.000 sec.
1.7.000 sTIMEOUT ERROR, Killed. Hard limit reached: 7.000 sec.
▶big1
big random test n=999,999, multiple repetitions✘TIMEOUT ERROR
Killed. Hard limit reached: 14.000 sec.
1.14.000 sTIMEOUT ERROR, Killed. Hard limit reached: 14.000 sec.
▶big2
big random test n=999,999✘TIMEOUT ERROR
Killed. Hard limit reached: 19.000 sec.
1.19.000 sTIMEOUT ERROR, Killed. Hard limit reached: 19.000 sec.
 */
