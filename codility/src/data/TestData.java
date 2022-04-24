/**
 * Create data for test
 */
package data;

/**
 *
 * @author antw
 */
public class TestData {

    /**
     * Create sample of array for testing.
     *
     * N is an odd integer within the range [1..1,000,000]; each element of
     * array A is an integer; all but one of the values in A occur an even
     * number of times.
     *
     * For example, if n = 9; return will be {1,2,3,4,1,2,3,4,5}
     *
     * @param n only take odd int. And must be greater than 0.
     * @return Array of pairs and a un-pair int.
     */
    public int[] evenOdd(int n) {
        int[] x = new int[n];

        if (n % 2 == 0) {
            System.out.println("n only odd number.");
            System.exit(0);
        }

        int i = 0, half = n / 2, h = half;
        int myInt = 1;
        while (i < half) {
            x[i] = myInt;
            x[h] = myInt;
            i++;
            h++;
            myInt++;
        }
        x[n - 1] = myInt;
        return x;
    }

    /**
     * Print array int[]. Delimited by space " ".
     *
     * @param A
     */
    public void printArray(int[] A) {
        for (int a : A) {
            System.out.print(" " + a + " ");
        }

        System.out.println("");
    }

}
