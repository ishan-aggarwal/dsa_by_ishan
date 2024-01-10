package sliding_window.variable;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/fruit-into-baskets/description/
public class MaxFruitsIntoTwoBaskets {

    public int totalFruit(int[] fruits) {
        int maxFruits = Integer.MIN_VALUE;
        int i = 0, j = 0;
        int start = -1, end = -1;

        Map<Integer, Integer> fruitTypeFreqMap = new HashMap<>();

        while (j < fruits.length) {

            fruitTypeFreqMap.put(fruits[j], fruitTypeFreqMap.getOrDefault(fruits[j], 0) + 1);
            int size = fruitTypeFreqMap.size();
            if (size <= 2) {
                if (maxFruits < j - i + 1) {
                    maxFruits = j - i + 1;
                    start = i;
                    end = j;
                }
            } else if (size > 2) {
                while (i < j && fruitTypeFreqMap.size() > 2) {
                    int leftValue = fruits[i];
                    if (fruitTypeFreqMap.containsKey(leftValue)) {
                        fruitTypeFreqMap.put(leftValue, fruitTypeFreqMap.get(leftValue) - 1);
                        if (fruitTypeFreqMap.get(leftValue) == 0) {
                            fruitTypeFreqMap.remove(leftValue);
                        }
                    }
                    i++;
                }
            }
            j++;
        }
        return maxFruits;
    }

    public static void main(String[] args) {
        MaxFruitsIntoTwoBaskets solve = new MaxFruitsIntoTwoBaskets();
        int[] arr = {1, 2, 3, 2, 2};
        System.out.println(solve.totalFruit(arr));

        int[] arr1 = {0, 1, 2, 2};
        System.out.println(solve.totalFruit(arr1));

        int[] arr2 = {3, 3, 3, 3, 3, 3};
        System.out.println(solve.totalFruit(arr2));
    }
}
