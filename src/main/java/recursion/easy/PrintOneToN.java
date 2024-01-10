package recursion.easy;

public class PrintOneToN {
    public static void main(String[] args) {
        print(7);
    }

    private static void print(int n) {
        // base condition
        if (n == 0) {
            return;
        }
        print(n - 1); // hypothesis
        System.out.println(n); // induction step
    }
}
