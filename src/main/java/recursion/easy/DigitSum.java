package recursion.easy;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(1234));
        System.out.println(digitProduct(1234));

    }

    private static int digitSum(int num) {
        if (num == 0) return 0;
        int rem = num % 10;
        return rem + digitSum(num / 10);
    }

    private static int digitProduct(int num) {
        if (num <= 9) return num;
        int rem = num % 10;
        return rem * digitProduct(num / 10);
    }
}
