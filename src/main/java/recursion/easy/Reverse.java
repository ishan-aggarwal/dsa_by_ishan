package recursion.easy;

public class Reverse {

    static int sum = 0;

    public static void main(String[] args) {
        int num = 1234;
        reverse(num);
        System.out.println("reverse of number: " + num + " is: " + sum);
        System.out.println("------------------------------------------");
        System.out.println("reverse of number: " + num + " is: " + rev(num));
    }

    private static void reverse(int num) {
        if (num == 0) return;
        int rem = num % 10;
        sum = (sum * 10) + rem;
        reverse(num / 10);
    }

    private static int rev(int num) {
        int totalDigits = (int) Math.log10(num) + 1;
        return revHelper(num, totalDigits);
    }

    private static int revHelper(int num, int totalDigits) {
        if (num == 0) return 0;
        int rem = num % 10;
        return (int) (rem * Math.pow(10, totalDigits - 1)) + revHelper(num / 10, totalDigits - 1);
    }
}
