package recursion.medium;

import java.util.ArrayList;
import java.util.List;

// https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/

public class FindPermutations {

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("-----------");
        printPermutations(str, "");
        System.out.println("-----------");
        List<String> allPermutations = calculatePermutations(str);
        System.out.println(allPermutations);
    }

    private static List<String> calculatePermutations(String str) {
        // take a list to hold all the results
        List<String> result = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return result;
        }
        // call the recursive calculate function
        calculate(str, "", result);
        return result;
    }


    private static void calculate(String input, String output, List<String> result) {
        // if our input is empty or gets empty eventually that is our base condition
        // and then whatever is there in our output - we want to record that in our result
        if (input == null || input.isEmpty()) {
            result.add(new String(output));
            return;
        }
        // find the current character which is at 0th index of input str
        char currentChar = input.charAt(0);

        // use a for loop to place this char in the output
        // because we want to find the places where we can place the current character
        // and is always 1 more than the length of the output string -> refer to image attached (NOTE)
        // now in order to find the correct position to place the currentCharacter we will iterate over the output
        // string and find substring starting from 0 to index 'i' and then from index 'i' to the end of the string
        for (int i = 0; i < output.length() + 1; i++) {
            // find first part of the substring
            String start = output.substring(0, i);
            // find second part of the substring
            String end = output.substring(i);
            // finally call the recursive function with the correct parameters
            calculate(input.substring(1), start + currentChar + end, result);
        }
    }


    private static void printPermutations(String input, String output) {
        // if our input is empty
        if (input == null || input.isEmpty()) {
            System.out.println(output);
            return;
        }
        char currChar = input.charAt(0);
        for (int i = 0; i < output.length() + 1; i++) {
            String start = output.substring(0, i);
            String end = output.substring(i);
            printPermutations(input.substring(1), start + currChar + end);
        }
    }
}
