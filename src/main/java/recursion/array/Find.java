package recursion.array;

import java.util.ArrayList;
import java.util.List;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 6};
        int ele = 4;
        System.out.println("findIdx: " + findIdx(arr, ele, 0));
        System.out.println("-------------------------------------");
        System.out.println("findIdxReverse: " + findIdxReverse(arr, ele, arr.length - 1));
        System.out.println("-------------------------------------");
        System.out.println("findAllIndexes: " + findAllIndexes(arr, ele, 0, new ArrayList<>()));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    private static List<Integer> findAllIndexes(int[] arr, int ele, int idx, List<Integer> res) {
        if (idx == arr.length - 1) {
            return res;
        }
        if (arr[idx] == ele) {
            res.add(idx);
        }
        return findAllIndexes(arr, ele, idx + 1, res);
    }

    private static int findIdx(int[] arr, int ele, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == ele) {
            return idx;
        }
        return findIdx(arr, ele, idx + 1);
    }

    private static int findIdxReverse(int[] arr, int ele, int idx) {
        if (idx == -1) {
            return -1;
        }
        if (arr[idx] == ele) {
            return idx;
        }
        return findIdxReverse(arr, ele, idx - 1);
    }
}
