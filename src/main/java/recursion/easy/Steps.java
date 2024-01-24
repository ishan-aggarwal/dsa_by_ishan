package recursion.easy;

public class Steps {
    public static void main(String[] args) {
        int num = 123;
        int stepsCount = steps(num);
        System.out.println(stepsCount);
    }

    private static int steps(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        if (num % 2 == 0) {
            return 1 + steps(num / 2);
        }
        return 1 + steps(num - 1);
    }
}
