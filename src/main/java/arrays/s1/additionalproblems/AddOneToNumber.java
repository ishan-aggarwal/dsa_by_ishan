package arrays.s1.additionalproblems;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Q1. Add One To Number
 * Problem Description
 * Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
 * The digits are stored such that the most significant digit is at the head of the list.
 * NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :
 * Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
 * A: For the purpose of this question, YES
 * Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
 * A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
 * <p>
 * Problem Constraints
 * 1 <= size of the array <= 1000000
 * Input Format
 * First argument is an array of digits.
 * Output Format
 * Return the array of digits after adding one.
 * Example Input
 * Input 1:
 * [1, 2, 3]
 * Example Output
 * Output 1:
 * [1, 2, 4]
 * Example Explanation
 * Explanation 1:
 * Given vector is [1, 2, 3].
 * The returned vector should be [1, 2, 4] as 123 + 1 = 124.
 */

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        // taking a list to store the final answer numbers
        ArrayList<Integer> list = new ArrayList<>();
        int n = A.size();

        // start with the very last element of input list and add 1 to number
        int number = A.get(n - 1) + 1;

        // store by taking mod of it
        list.add(number % 10);

        // check for carry
        int carry = number / 10;

        // go through rest of the numbers in the same way
        for (int i = n - 2; i >= 0; i--) {
            int current = A.get(i) + carry;
            list.add(current % 10);
            carry = current / 10;
        }

        // if we still have carry handle that
        while (carry != 0) {
            list.add(carry % 10);
            carry = carry / 10;
        }

        // reverse the list to form the answer
        Collections.reverse(list);

        // remove any starting zeros from it
        while (list.get(0) == 0) {
            list.remove(0);
        }

        // System.out.println(list);
        return list;
    }
}
