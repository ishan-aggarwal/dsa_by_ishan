package recursion.array;

public class BS {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int ele = 50;
        System.out.println(rbs(arr, ele, 0, arr.length - 1));

        ele = 80;
        System.out.println(rbs(arr, ele, 0, arr.length - 1));
    }

    private static int rbs(int[] arr, int ele, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == ele) {
            return mid;
        }
        if (arr[mid] > ele) {
            return rbs(arr, ele, s, mid - 1);
        }
        return rbs(arr, ele, mid + 1, e);
    }
}
