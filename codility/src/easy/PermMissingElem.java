/** 220417
 * Codility Lesson 3 Time Complexity. 
 * PermMissingElem
 * Find the missing element in a given permutation.
 */
package easy;

/**
 *
 * @author antw
 */
public class PermMissingElem {

    /**
     * . An array A consisting of N different integers is given. The array
     * contains integers in the range [1..(N + 1)], which means that exactly one
     * element is missing.
     *
     * Your goal is to find that missing element.
     *
     * Given an array A, returns the value of the missing element.
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {

        if (A.length < 1) {
            return 1;
        }

        int search = 0, lgth = A.length;

        boolean tryAgain = true;

        doWhile:
        while (tryAgain) {
            search = search + 1;

            for (int i = 0; i < lgth; i++) {
                if (A[i] == search) {
                    continue doWhile;
                }
            }

            tryAgain = false;
            return search;
        }

        return search;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        PermMissingElem c = new PermMissingElem();
        int[] A = {2, 3, 1, 5};
        System.out.println("solution A: " + c.solution(A));
        int[] B = {2, 2, 3, 5, 4};
        System.out.println("solution B: " + c.solution(B));
        int[] C = {9, 8, 7, 6, 5, 4, 3}; // first or last
        System.out.println("solution C: " + c.solution(C));
        int[] D = {2};          // single digit
        System.out.println("solution D: " + c.solution(D));
        int[] E = {};          // single digit
        System.out.println("solution E: " + c.solution(E));
    }
}
/* sample Dialogue
run:
solution A: 4
solution B: 1
solution C: 1
solution D: 1
solution E: 1
BUILD SUCCESSFUL (total time: 0 seconds)
 */
 /* CodeCheck Report: 60% 
medium2 
medium test, length = ~10,000
1. 0.668 s TIMEOUT ERROR,  running time: 0.668 sec., time limit: 0.112 sec.

large_range 
range sequence, length = ~100,000
1. 6.000 s TIMEOUT ERROR,  Killed. Hard limit reached: 6.000 sec.
2. 0.124 s OK
3. 1.104 s TIMEOUT ERROR,  running time: 1.104 sec., time limit: 0.496 sec.
 */
