/** 220415
 * Codility Lesson 2 Arrays. 
 * CyclicRotation
 * Rotate an array to the right by a given number of steps.
 */
package easy;

import java.util.stream.Stream;

/**
 *
 * @author antw
 */
public class CyclicRotation {

    /**
     * .
     * An array A consisting of N integers is given. Rotation of the array means
     * that each element is shifted right by one index, and the last element of
     * the array is moved to the first place. For example, the rotation of array
     * A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one
     * index and 6 is moved to the first place).
     *
     * The goal is to rotate array A K times; that is, each element of A will be
     * shifted to the right K times.
     *
     * Given an array A consisting of N integers and an integer K, returns the
     * array A rotated K times.
     *
     * @param A
     * @param K
     * @return
     */
    public int[] solution(int[] A, int K) {

        int lgth = A.length, buffer;

        for (int i = 0; i < K; i++) {
            buffer = A[lgth - 1];

            for (int j = 1; j < lgth; j++) {
                A[lgth - j] = A[lgth - j - 1];
            }

            A[0] = buffer;
        }

        return A;
    }

    public void pritnArray(int[] rotated) {
        for (int a : rotated) {
            System.out.print(" " + a + " ");
        }
        System.out.println("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        CyclicRotation c = new CyclicRotation();
        int[] rotated;

        int[] A = {3, 8, 9, 7, 6};
        c.pritnArray(A);
        rotated = c.solution(A, 3);
        c.pritnArray(rotated);

        int[] B = {1, 2, 3, 4};
        c.pritnArray(B);
        rotated = c.solution(B, 4);
        c.pritnArray(rotated);

        int[] C = {0, 0, 0};
        c.pritnArray(C);
        rotated = c.solution(C, 1);
        c.pritnArray(rotated);
    }
}

/* Sample Dialogue
run:
 3  8  9  7  6 
 9  7  6  3  8 
 1  2  3  4 
 1  2  3  4 
 0  0  0 
 0  0  0 
BUILD SUCCESSFUL (total time: 0 seconds)
 */
 /* CodeCheck Report: 87% */
