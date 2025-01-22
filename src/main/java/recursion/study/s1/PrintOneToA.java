package recursion.study.s1;

public class PrintOneToA {
    public void solve(int A) {
        printOneToA(A, 1);
    }

    public void printOneToA(int A, int counter) {
        if (counter <= A) {
            System.out.print(counter + " ");
        } else {
            System.out.println();
            return;
        }
        printOneToA(A, counter + 1);
    }

    public void print1toA(int A) {
        if (A == 0) {
            return;
        }
        print1toA(A - 1);
        System.out.print(A + " ");
    }


    public static void main(String[] args) {
        PrintOneToA obj = new PrintOneToA();
        obj.solve(9);
        System.out.println("Hello");
        obj.print1toA(9);
        System.out.println();
        System.out.println("Hello");
    }
}
