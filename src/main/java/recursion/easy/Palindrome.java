package recursion.easy;

public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        boolean isPalindrome = palindrome(num);
        System.out.println(isPalindrome);

        num = 123421;
        isPalindrome = palindrome(num);
        System.out.println(isPalindrome);
    }

    private static boolean palindrome(int num) {
        return num == rev(num);
    }

    private static int rev(int num) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int base = (int) Math.log10(num) + 1;
        return revHelper(num, base);
    }

    private static int revHelper(int num, int base) {
        if (num == 0) return 0;
        int rem = num % 10;
        return (int) (rem * Math.pow(10, base - 1)) + revHelper(num / 10, base - 1);

    }

}
