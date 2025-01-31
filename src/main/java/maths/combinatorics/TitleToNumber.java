package maths.combinatorics;

public class TitleToNumber {

    public static int stringToNumber(String A) {
        int ans = 0;
        for (int i = 0; i < A.length(); i++) {
            ans = ans * 10 + (A.charAt(i) - '0');
        }
        return ans;
    }

    public static int titleToNumber(String A) {

        int result = 0;
        for (int i = 0; i < A.length(); i++) {
            result = result * 26 + (A.charAt(i) - 'A' + 1);
        }
        return result;


    }

    public static void main(String[] args) {
        System.out.println(stringToNumber("123"));
    }
}
