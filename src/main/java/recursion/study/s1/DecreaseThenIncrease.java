package recursion.study.s1;

public class DecreaseThenIncrease {
    public void DecThenInc(int A) {
        solve(A);
        System.out.println();
    }

    public void solve(int A) {
        if (A == 0) {
            return;
        }
        System.out.print(A + " ");
        solve(A - 1);
        System.out.print(A + " ");
    }
}
