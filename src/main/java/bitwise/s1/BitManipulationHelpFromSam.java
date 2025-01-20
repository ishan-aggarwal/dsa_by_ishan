package bitwise.s1;

/**
 * Q5. Help From Sam
 * <p>
 * Problem Description
 * Alex and Sam are good friends. Alex is doing a lot of programming these days. He has set a target score of A for himself.
 * Initially, Alex's score was zero. Alex can double his score by doing a question, or Alex can seek help from Sam for doing questions that will contribute 1 to Alex's score. Alex wants his score to be precisely A. Also, he does not want to take much help from Sam.
 * Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of A.
 * <p>
 * <p>
 * Problem Constraints
 * 0 <= A <= 10^9
 * <p>
 * Input Format
 * The only argument given is an integer A.
 * <p>
 * Output Format
 * Return the minimum number of times help taken from Sam.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = 5
 * Input 2:
 * A = 3
 * <p>
 * Example Output
 * Output 1:
 * 2
 * Output 2:
 * 2
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * Initial score : 0
 * Takes help from Sam, score : 1
 * Alex solves a question, score : 2
 * Alex solves a question, score : 4
 * Takes help from Sam, score: 5
 * <p>
 * Explanation 2:
 * Initial score : 0
 * Takes help from Sam, score : 1
 * Alex solves a question, score : 2
 * Takes help from Sam, score : 3
 */
public class BitManipulationHelpFromSam {
    public int solve(int A) {
        int totalTimesHelpTaken = 0;

        while (A != 0) {
            if ((A & 1) == 1) {
                totalTimesHelpTaken++;
            }
            A = A >> 1;
        }

        return totalTimesHelpTaken;
    }
}
