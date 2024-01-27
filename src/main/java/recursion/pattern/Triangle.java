package recursion.pattern;

public class Triangle {
    public static void main(String[] args) {
        int n = 4;
        printStarPattern(n);
        System.out.println("------------------------");
        triangle1(n, 0);
        System.out.println("------------------------");
        triangle2(n, 0);
    }

    public static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c + 1);
            System.out.print("*");
        } else {
            triangle2(r - 1, 0);
            System.out.println();
        }
    }

    public static void triangle1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle1(r, c + 1);
        } else {
            System.out.println();
            triangle1(r - 1, 0);
        }
    }

    public static void printStarPattern(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        printStarPattern(n - 1);
    }
}
