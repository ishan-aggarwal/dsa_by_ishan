package bitwise.s2;

/**
 * Q Google. Give n +ve numbers, count total number of pairs whose bitwise AND is Maximum
 */
public class CountPairsWithMaximumAND {
    public int solve(int[] A) {
//        int ans = 0;
        for (int bit = 31; bit >= 0; bit--) {
            int countSetBits = 0;
            for (int x : A) {
                if ((x & (1 << bit)) != 0) {
                    countSetBits++;
                }
            }
            if (countSetBits >= 2) {
//                ans |= (1 << bit);
                // make all other numbers 0 where the bit is not set
                for (int i = 0; i < A.length; i++) {
                    // if bit was not set then mark it to 0
                    if ((A[i] & (1 << bit)) == 0) {
                        A[i] = 0;
                    }
                }
            }
        }
        int countNonZeroNumbersLeft = 0;
        for (int x : A) {
            if (x != 0) {
                countNonZeroNumbersLeft++;
            }
        }
        return countNonZeroNumbersLeft * (countNonZeroNumbersLeft - 1) / 2;
    }
}
