package recursion.study.s1;

public class PrintAToOne {
    public void solve(int A) {
        printAToOne(A);
        System.out.println();
    }

    public void printAToOne(int A) {
        if (A == 0) {
            return;
        }
        System.out.print(A + " ");
        printAToOne(A - 1);
    }
}

