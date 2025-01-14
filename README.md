# DSA Revision With Ishan Aggarwal

## **Sliding Window Technique**

### **Overview**

This section focuses on problems related to sliding window, including both fixed and variable size sliding windows, and their application in solving common DSA problems efficiently.

| Problem Description                                                     | Code Link                                                                                     |
| ----------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| Find maximum (or minimum) sum of a subarray of size k                   | [🔗](/src/main/java/sliding_window/fixed/MaximumSumOfAllSubarrayOfSizeK.java)                    |
| Maximum of all subarrays of size K                                      | [🔗](/src/main/java/sliding_window/fixed/MaximumElementOfEachSubarrayOfSizeK.java)               |
| First Negative In Every Window Of Size K                                | [🔗](/src/main/java/sliding_window/fixed/FirstNegativeOfEachSubarrayOfSizeK.java)                |
| Count Occurrences of Anagrams                                           | [🔗](/src/main/java/sliding_window/fixed/CountAnagrams.java)                                     |
|                                                                         |                                                                                               |
| Longest sub-array having sum k                                          | [🔗](/src/main/java/sliding_window/variable/LongestSubarrayWithGivenSumK.java)                   |
| Longest substring with k unique characters in a given string            | [🔗](/src/main/java/sliding_window/variable/LongestSubstringWithKUniqueChars.java)               |
| Longest substring without repeating characters                          | [🔗](/src/main/java/sliding_window/variable/LongestSubstringWithAllUniqueChars.java)             |
| Smallest Window In a string containing all characters of another string | [🔗](/src/main/java/sliding_window/variable/SmallestSubstringContainingAllCharsFromPattern.java) |
| Q-904. Fruit Into Baskets                                               | [🔗](/src/main/java/sliding_window/variable/MaxFruitsIntoTwoBaskets.java)                        |

### Detailed Problem Descriptions

#### **Find Maximum (or Minimum) Sum of a Subarray of Size K**

Given an array, find the maximum sum of any subarray of size `k` using the **fixed size sliding window technique.**

**Approach**

**Use Sliding Window** :

* The sliding window technique helps efficiently calculate the sum of subarrays without recalculating the sum from scratch for every new window.
* A "window" is defined as a subarray of size `k`.

**Steps** :

* Start with two pointers (`i` and `j`) at the beginning of the array. These represent the start and end of the window.
* Keep a running sum of the elements within the window (`currentSum`).
* Expand the window by moving the right pointer (`j`) and adding the element to `currentSum`.
* When the window size reaches `k`, calculate the maximum sum so far and store it in `maxSum`.
* Slide the window by moving the left pointer (`i`) forward and subtracting the element at `i` from `currentSum`.
* Continue until the right pointer reaches the end of the array.
* **Return the maximum sum** after iterating through all subarrays of size `k`.

**Complexity**

**Time Complexity** : O(n)

* Each element is added to `currentSum` exactly once and removed exactly once, resulting in a linear traversal of the array.

**Space Complexity** : O(1)

* No extra space is used except for a few variables to store the sum and indices.

**Why Use Sliding Window?**

* Sliding window avoids redundant calculations by reusing the sum of overlapping elements between consecutive subarrays.
* For example, when moving from one subarray to the next, instead of summing all elements again, simply subtract the element that is sliding out of the window and add the element that is sliding in.


---

## **Recursion Questions**

### Overview

Reference https://www.youtube.com/playlist?list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod

Notes [🔗](/src/main/java/recursion/Backtracking.one)

### **Easy**

* Print One To N [🔗](/src/main/java/recursion/easy/PrintOneToN.java)
* Print N To One [🔗](/src/main/java/recursion/easy/PrintNToOne.java)
* Find sum of digits of number [🔗](/src/main/java/recursion/easy/DigitSum.java)
* Count Zeros with in a number [🔗](/src/main/java/recursion/easy/CountZeros.java)
* Factorial of a number [🔗](/src/main/java/recursion/easy/Fact.java)
* Print N To One (Nto1) [🔗](/src/main/java/recursion/easy/Nto1.java)
* Check if number is Palindrome or not [🔗](/src/main/java/recursion/easy/Palindrome.java)
* Reverse a number [🔗](/src/main/java/recursion/easy/Reverse.java)
* Find Sum of first N natural numbers [🔗](/src/main/java/recursion/easy/Sum.java)
* Count Steps to reduce number to zero [🔗](/src/main/java/recursion/easy/Steps.java)

### **Array Based**

* Check if array elements are sorted or not [🔗](/src/main/java/recursion/array/Sorted.java)
* Find elements in an array using linear search - find, findAllIndexes, findIdx,
  findIdxReverse [🔗](/src/main/java/recursion/array/Find.java)
* Binary Search [🔗](/src/main/java/recursion/array/BS.java)
* Rotated Array Binary Search [🔗](/src/main/java/recursion/array/RBS.java)

### **Pattern and Sorting**

* Print Triangle Pattern [🔗](/src/main/java/recursion/pattern/Triangle.java)
* Bubble Sort [🔗](/src/main/java/recursion/sorting/BubbleSort.java)
* Selection Sort [🔗](/src/main/java/recursion/sorting/SelectionSort.java)
* Merge Sort [🔗](/src/main/java/recursion/sorting/MergeSort.java)
* Merge Sort In Place [🔗](/src/main/java/recursion/sorting/MergeSortInPlace.java)
* Quick Sort [🔗](/src/main/java/recursion/sorting/QuickSortInPlace.java)

### **String**

* Remove Occurrence [🔗](/src/main/java/recursion/string/RemoveOccurrence.java)
* More Removal Operations: Stream [🔗](/src/main/java/recursion/string/Stream.java)

### **Medium**

* Find Subsets of a string using recursion [🔗](/src/main/java/recursion/medium/FindSubsets.java)
* Find Permutations of a string using
  recursion [🔗](/src/main/java/recursion/medium/FindPermutations.java)
* Count ways to obtain given sum by repeated throws of a
  dice [🔗](/src/main/java/recursion/medium/PrintWaysToFindDiceTargetSum.java)
* Print permutation of N numbers to form sum
  S [🔗](/src/main/java/recursion/medium/PrintPermutationsOfNNumbersToFindGivenSum.java)
* CountUniquePathsInMatrix when we can move down and right
  only [🔗](/src/main/java/recursion/medium/CountUniquePathsInMatrix.java)
* CountUniquePathsInMatrix when we can move down, right and diagonally
  only [🔗](/src/main/java/recursion/medium/CountUniquePathsInMatrixWhenMoveDRD.java)
* PrintUniquePathsInMatrix when we can move down and
  right [🔗](/src/main/java/recursion/medium/PrintUniquePathsInMatrix.java)

---

## **Backtracking**

* PrintAllUniquePathsFourDirectionsInMatrix when we can move down and right, left andup [🔗](/src/main/java/recursion/backtracking/PrintAllUniquePathsFourDirectionsInMatrix.java)

---

## **Tries**

* Reference https://www.youtube.com/playlist?list=PLgUwDviBIf0pcIDCZnxhv0LkHf5KzG9zp
* Notes [🔗](/src/main/java/tries/Tries.one)
* Trie DS Array based model [🔗](/src/main/java/tries/TrieNodeArray.java)
* Trie DS Map based model [🔗](/src/main/java/tries/TrieNodeMap.java)
* Basic Trie DS Operations Insert and Search [🔗](/src/main/java/tries/TrieNodeSolution.java)
* Implement Trie Prefix [:link](/src/main/java/tries/TriePrefixSolution.java)
* Implement Trie Prefix (CountWords, CountStartsWith, Erase) [:link](/src/main/java/tries/TriePrefixSolution2.java)
* Search Words In Dictionary [🔗](/src/main/java/tries/SearchWordsInDictionary.java)
* Shortest unique prefix [🔗](/src/main/java/tries/ShortestUniquePrefix.java)
* Contact Finder count (prefix count) [🔗](/src/main/java/tries/ContactFinderCount.java)
* Longest Common Prefix [:link](/src/main/java/tries/LongestCommonPrefix.java)

---

## Heaps

### Overview

This section focuses on problems related to heaps, including both min-heaps and max-heaps, and their application in solving common DSA problems efficiently.

| Problem Description                                                                                                                                                                                                                                                       | Code Link                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------- |
| **Kth Smallest Element**: Find the kth smallest element in an unsorted array by maintaining a max heap of size `k`. The largest element in the heap at any time ensures efficient retrieval of the kth smallest element. **Time Complexity**: O(n * log k). | [🔗](/src/main/java/heaps/KthSmallestElement.java)                |
| **Return k largest elements in an array**: Extract the top `k` largest elements from an array using a min-heap of size `k`.                                                                                                                                     | [🔗](/src/main/java/heaps/KLargestElementsInArray.java)           |
| **Sort a K Sorted Array**: Given an almost sorted array where every element is at most `k` positions away from its sorted position, sort it using a min-heap.                                                                                                     | [🔗](/src/main/java/heaps/SortKSortedArray.java)                  |
| **K Closest Numbers**: Identify the `k` numbers closest to a given value using a max heap and custom comparator.                                                                                                                                                  | [🔗](/src/main/java/heaps/KClosestNumbers.java)                   |
| **Top K Frequent Numbers**: Determine the `k` most frequently occurring numbers in an array by using a frequency map and a min-heap.                                                                                                                              | [🔗](/src/main/java/heaps/TopKFrequentNumbers.java)               |
| **Frequency Sort**: Rearrange elements of an array based on their frequency using a max heap.                                                                                                                                                                       | [🔗](/src/main/java/heaps/FrequencySort.java)                     |
| **K Closest Points to Origin**: Find the `k` points closest to the origin (0,0) in a 2D plane using a max heap.                                                                                                                                                   | [🔗](/src/main/java/heaps/KClosestPointsToOrigin.java)            |
| **Connect Ropes to Minimize Cost**: Connect ropes with minimal cost by repeatedly merging the two smallest ropes using a min-heap.                                                                                                                                  | [🔗](/src/main/java/heaps/ConnectRopesToMinimiseCost.java)        |
| **Sum of Elements Between k1 and k2 Smallest**: Compute the sum of array elements between the `k1` smallest and `k2` smallest using a min-heap.                                                                                                                 | [🔗](/src/main/java/heaps/SumElementsBetweenK1AndK2Smallest.java) |

---

### Detailed Problem Descriptions

#### **Kth Smallest Element**

Find the kth smallest element in an unsorted array using a **max-heap**.

- **Approach**:
  1. Use a max-heap (created with `PriorityQueue` and `Collections.reverseOrder()`).
  2. Iterate through the array and insert elements into the heap.
  3. If the heap size exceeds `k` at any point, remove the top element. This ensures the heap always contains the smallest `k` elements.
  4. At the end of the iteration, the top of the heap (`peek`) gives the `kth` smallest element.
- **Complexity**: O(n * log k)
  - Inserting an element into the heap takes O(log k).
  - Iterating through all `n` elements gives O(n * log k).

**Why Use a Max-Heap?**
In a max-heap, the smallest elements sink to the bottom, so maintaining only `k` elements ensures the largest of the smallest `k` is at the top. The additional elements can be discarded as they don't contribute to finding the `kth` smallest.

#### **Return k Largest Elements in an Array**

- **Approach**:

  1. Use a min-heap (created with `PriorityQueue` ).
  2. Iterate through the array and insert elements into the heap.
  3. If the heap size exceeds `k` at any point, remove the top element. This ensures the heap always contains the largest `k` elements.
  4. At the end of the iteration, the heap contains the `k` largest elements.
  5. Extract all elements from the heap to get the result.
- **Complexity**: O(n * log k)

  - Inserting an element into the heap takes O(log k).
  - Iterating through all `n` elements gives O(n * log k).

**Why Use a Min-Heap?**
In a min-heap, the smallest element is always at the root. By maintaining a heap of size `k`, the root will always contain the smallest element among the k largest elements seen so far. This ensures that elements smaller than the k largest can be easily discarded, while the heap retains only the top k largest elements efficiently.

#### **Sort a K-Sorted Array**

Sort an almost sorted array where each element is at most `k` positions away from its sorted location.

- **Approach**: Use a min-heap to hold `k+1` elements. For each element:
  - Add it to the heap.
  - Extract the smallest element and place it in the sorted position.
- **Complexity**: O(n * log k)

#### **K Closest Numbers**

Find the `k` numbers closest to a given value `x` using a **max-heap**.

- **Approach**: Use a custom comparator to sort elements based on their absolute difference from `x`. Maintain a max-heap of size `k` and discard elements with a larger absolute difference.
- **Complexity**: O(n * log k)

#### **Top K Frequent Numbers**

Determine the `k` most frequently occurring elements in an array.

- **Approach**: Build a frequency map and use a min-heap of size `k` to store the top `k` frequencies.
- **Complexity**: O(n + k * log n)

#### **Frequency Sort**

Sort the array based on the frequency of each element using a **max-heap**.

- **Approach**: Build a frequency map, push elements into a max-heap, and reconstruct the array based on heap order.
- **Complexity**: O(n log n)

---

## **Linked List**

- Questions
  * Middle Element of Linked List [🔗](/src/main/java/linked_list/MiddleElementOfLinkedList.java)
  * Detect Cycle In Linked List [🔗](/src/main/java/linked_list/DetectCycleInLinkedList.java)

---

## **Dynamic Programming**

### **1D DP Problems**

* Climbing Stairs [🔗](/src/main/java/dynamic_programming/oneD/ClimbingStairs.java)

### **p1 - 0/1 Knapsack Problem Questions**

* 0/1 knapsack problem
* [🔗](/src/main/java/dynamic_programming/p1/_01KnapsackRecursive.java)
* [🔗](/src/main/java/dynamic_programming/p1/_01KnapsackMemoization.java)
* [🔗](/src/main/java/dynamic_programming/p1/_01KnapsackTopDown.java)
* Subset Sum
* Equal Sum Partition
* Count of subset sum
* Minimum subset sum difference
* Target Sum
* Number of subset with given difference

### **Buy Sell Stock Questions**

* Buy Sell Stock 1 - Only
  once [🔗](/src/main/java/dynamic_programming/buy_sell_stock/BuySellStock1.java)
* Buy Sell Stock 2 - Unlimited
  transactions [🔗](/src/main/java/dynamic_programming/buy_sell_stock/BuySellStock2.java)
* Buy Sell Stock 3 - Atmost 2
  transactions [🔗](/src/main/java/dynamic_programming/buy_sell_stock/BuySellStock3.java)
* Buy Sell Stock 4 - Atmost k
  transactions [🔗](/src/main/java/dynamic_programming/buy_sell_stock/BuySellStock4.java)
* Buy Sell Stock 5 - With transaction
  fee [🔗](/src/main/java/dynamic_programming/buy_sell_stock/BuySellStock5.java)
* Buy Sell Stock 6 - With Cooldown period before buy
  again [🔗](/src/main/java/dynamic_programming/buy_sell_stock/BuySellStock6.java)

---

## **Graphs**

### **Day 1**

* Graph Representation In Java Matrix
  Based [🔗](/src/main/java/graphs/day1/MatrixGraph.java)
* Graph Representation In Java Adjacency list
  Based [🔗](/src/main/java/graphs/day1/AdjacencyListGraph.java)
* Graph Traversal
  * BFS [🔗](/src/main/java/graphs/day1/GraphBFSTraversal.java)
  * DFS [🔗](/src/main/java/graphs/day1/GraphDFSTraversal.java)

---
