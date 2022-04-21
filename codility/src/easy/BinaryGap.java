/** 220415
 * Codility Lesson 1 Iterations.
 * BinaryGap
 * Find longest sequence of zeros in binary representation of an integer.
 * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 */
package easy;

/**
 *
 * @author antw
 */
public class BinaryGap {

    /**
     * . A binary gap within a positive integer N is any maximal sequence of
     * consecutive zeros that is surrounded by ones at both ends in the binary
     * representation of N.
     *
     * Given a positive integer N, returns the length of its longest binary gap.
     * The function return 0 if N doesn't contain a binary gap.
     *
     * N is an integer within the range [1..2,147,483,647].
     *
     * @param N
     * @return
     */
    public int solution(int N) {

        String binaryString = Integer.toBinaryString(N);

        int lgth = binaryString.length();

        int longestBinaryGap = 0, binaryLength = 0, gapTimes = 0;
        for (int i = 0; i < lgth - 1; i++) {

            char a = binaryString.charAt(i);
            char b = binaryString.charAt(i + 1);

            if ((a == '1') && (b == '0')) {
                binaryLength = 1;
            } else if ((a == '0') && (b == '0')) {
                binaryLength++;
            } else if ((a == '0') && (b == '1')) {

                gapTimes++;
                if (longestBinaryGap < binaryLength) {
                    longestBinaryGap = binaryLength;
                }
            }

        }

        return longestBinaryGap;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        BinaryGap b = new BinaryGap();
        int n;

        System.out.println(" Max binary gaps for " + (n = 9) + " is " + b.solution(n));
        System.out.println(" Max binary gaps for " + (n = 32) + " is " + b.solution(n));
        System.out.println(" Max binary gaps for " + (n = 529) + " is " + b.solution(n));
        System.out.println(" Max binary gaps for " + (n = 1041) + " is " + b.solution(n));

    }
}

/* Sample Dialogue
run:
 Max binary gaps for 9 is 2
 Max binary gaps for 32 is 0
 Max binary gaps for 529 is 4
 Max binary gaps for 1041 is 5
BUILD SUCCESSFUL (total time: 0 seconds)
 */
