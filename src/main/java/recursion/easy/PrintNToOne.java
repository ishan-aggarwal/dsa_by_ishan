package recursion.easy;

public class PrintNToOne {
    public static void main(String[] args) {
        print(7);
    }

    private static void print(int n) {
        // base condition
        if (n == 0) return;
        System.out.println(n); // induction step
        print(n - 1); // hypothesis/assumption
    }
}