# DSA Revision With Ishan Aggarwal

* **Sliding Window Technique**
    * **Fixed Size Window**
        - Questions
            * Find maximum (or minimum) sum of a subarray of size
              k [:link:](/src/main/java/sliding_window/fixed/MaximumSumOfAllSubarrayOfSizeK.java)
            * Maximum of all subarrays of size
              K [:link:](/src/main/java/sliding_window/fixed/MaximumElementOfEachSubarrayOfSizeK.java)
            * First Negative In Every Window Of Size
              K [:link:](/src/main/java/sliding_window/fixed/FirstNegativeOfEachSubarrayOfSizeK.java)
            * Count Occurrences of Anagrams [:link:](/src/main/java/sliding_window/fixed/CountAnagrams.java)
    * **Variable Size Window**
        - Questions
            * Longest sub-array having sum
              k [:link:](/src/main/java/sliding_window/variable/LongestSubarrayWithGivenSumK.java)
            * Longest substring with k unique characters in a given
              string [:link:](/src/main/java/sliding_window/variable/LongestSubstringWithKUniqueChars.java)
            * Longest substring without repeating
              characters [:link:](/src/main/java/sliding_window/variable/LongestSubstringWithAllUniqueChars.java)
            * Smallest Window In a string containing all characters of another
              string [:link:](/src/main/java/sliding_window/variable/SmallestSubstringContainingAllCharsFromPattern.java)
            * Q-904. Fruit Into Baskets [:link:](/src/main/java/sliding_window/variable/MaxFruitsIntoTwoBaskets.java)

* **Recursion Questions**
    - Reference https://www.youtube.com/playlist?list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod
    - Notes [:link:](/src/main/java/recursion/Backtracking.one)
    - **Easy**
        * Print One To N [:link:](/src/main/java/recursion/easy/PrintOneToN.java)
        * Print N To One [:link:](/src/main/java/recursion/easy/PrintNToOne.java)
        * Find sum of digits of number [:link:](/src/main/java/recursion/easy/DigitSum.java)
        * Count Zeros with in a number [:link:](/src/main/java/recursion/easy/CountZeros.java)
        * Factorial of a number [:link:](/src/main/java/recursion/easy/Fact.java)
        * Print N To One (Nto1) [:link:](/src/main/java/recursion/easy/Nto1.java)
        * Check if number is Palindrome or not [:link:](/src/main/java/recursion/easy/Palindrome.java)
        * Reverse a number [:link:](/src/main/java/recursion/easy/Reverse.java)
        * Find Sum of first N natural numbers [:link:](/src/main/java/recursion/easy/Sum.java)
        * Count Steps to reduce number to zero [:link:](/src/main/java/recursion/easy/Steps.java)
    - **Array Based**
        * Check if array elements are sorted or not [:link:](/src/main/java/recursion/array/Sorted.java)
        * Find elements in an array using linear search - find, findAllIndexes, findIdx,
          findIdxReverse [:link:](/src/main/java/recursion/array/Find.java)
        * Binary Search [:link:](/src/main/java/recursion/array/BS.java)
        * Rotated Array Binary Search [:link:](/src/main/java/recursion/array/RBS.java)
    - **Pattern and Sorting**
        * Print Triangle Pattern [:link:](/src/main/java/recursion/pattern/Triangle.java)
        * Bubble Sort [:link:](/src/main/java/recursion/sorting/BubbleSort.java)
        * Selection Sort [:link:](/src/main/java/recursion/sorting/SelectionSort.java)
        * Merge Sort [:link:](/src/main/java/recursion/sorting/MergeSort.java)
        * Merge Sort In Place [:link:](/src/main/java/recursion/sorting/MergeSortInPlace.java)
        * Quick Sort [:link:](/src/main/java/recursion/sorting/QuickSortInPlace.java)
    - **String**
        * Remove Occurrence [:link:](/src/main/java/recursion/string/RemoveOccurrence.java)
        * More Removal Operations: Stream [:link:](/src/main/java/recursion/string/Stream.java)

    - **Medium**
        * Find Subsets of a string using recursion [:link:](/src/main/java/recursion/medium/FindSubsets.java)
        * Find Permutations of a string using
          recursion [:link:](/src/main/java/recursion/medium/FindPermutations.java)
        * Count ways to obtain given sum by repeated throws of a
          dice [:link:](/src/main/java/recursion/medium/PrintWaysToFindDiceTargetSum.java)
        * Print permutation of N numbers to form sum
          S [:link:](/src/main/java/recursion/medium/PrintPermutationsOfNNumbersToFindGivenSum.java)
        * CountUniquePathsInMatrix when we can move down and right
          only [:link:](/src/main/java/recursion/medium/CountUniquePathsInMatrix.java)
        * CountUniquePathsInMatrix when we can move down, right and diagonally
          only [:link:](/src/main/java/recursion/medium/CountUniquePathsInMatrixWhenMoveDRD.java)
        * PrintUniquePathsInMatrix when we can move down and
          right [:link:](/src/main/java/recursion/medium/PrintUniquePathsInMatrix.java)

    - **backtracking**
        * PrintAllUniquePathsFourDirectionsInMatrix when we can move down and
          right, left and
          up [:link:](/src/main/java/recursion/backtracking/PrintAllUniquePathsFourDirectionsInMatrix.java)


* **Tries**
    * Reference https://www.youtube.com/playlist?list=PLgUwDviBIf0pcIDCZnxhv0LkHf5KzG9zp
    * Notes [:link:](/src/main/java/tries/Tries.one)
    * Trie DS Array based model [:link:](/src/main/java/tries/TrieNodeArray.java)
    * Trie DS Map based model [:link:](/src/main/java/tries/TrieNodeMap.java)
    * Basic Trie DS Operations Insert and Search [:link:](/src/main/java/tries/TrieNodeSolution.java)
    * Implement Trie Prefix [:link](/src/main/java/tries/TriePrefixSolution.java)
    * Implement Trie Prefix (CountWords, CountStartsWith, Erase) [:link](/src/main/java/tries/TriePrefixSolution2.java)
    * Search Words In Dictionary [:link:](/src/main/java/tries/SearchWordsInDictionary.java)
    * Shortest unique prefix [:link:](/src/main/java/tries/ShortestUniquePrefix.java)
    * Contact Finder count (prefix count) [:link:](/src/main/java/tries/ContactFinderCount.java)
    * Longest Common Prefix [:link](/src/main/java/tries/LongestCommonPrefix.java)

## Heaps

### Overview
This section focuses on problems related to heaps, including both min-heaps and max-heaps, and their application in solving common DSA problems efficiently.

| Problem Description | Code Link |
|----------------------|-----------|
| **Kth Smallest Element**: Find the kth smallest element in an unsorted array by maintaining a max heap of size `k`. The largest element in the heap at any time ensures efficient retrieval of the kth smallest element. **Time Complexity**: O(n * log k). | [:link:](/src/main/java/heaps/KthSmallestElement.java) |
| **Return k largest elements in an array**: Extract the top `k` largest elements from an array using a min-heap of size `k`. | [:link:](/src/main/java/heaps/KLargestElementsInArray.java) |
| **Sort a K Sorted Array**: Given an almost sorted array where every element is at most `k` positions away from its sorted position, sort it using a min-heap. | [:link:](/src/main/java/heaps/SortKSortedArray.java) |
| **K Closest Numbers**: Identify the `k` numbers closest to a given value using a max heap and custom comparator. | [:link:](/src/main/java/heaps/KClosestNumbers.java) |
| **Top K Frequent Numbers**: Determine the `k` most frequently occurring numbers in an array by using a frequency map and a min-heap. | [:link:](/src/main/java/heaps/TopKFrequentNumbers.java) |
| **Frequency Sort**: Rearrange elements of an array based on their frequency using a max heap. | [:link:](/src/main/java/heaps/FrequencySort.java) |
| **K Closest Points to Origin**: Find the `k` points closest to the origin (0,0) in a 2D plane using a max heap. | [:link:](/src/main/java/heaps/KClosestPointsToOrigin.java) |
| **Connect Ropes to Minimize Cost**: Connect ropes with minimal cost by repeatedly merging the two smallest ropes using a min-heap. | [:link:](/src/main/java/heaps/ConnectRopesToMinimiseCost.java) |
| **Sum of Elements Between k1 and k2 Smallest**: Compute the sum of array elements between the `k1` smallest and `k2` smallest using a min-heap. | [:link:](/src/main/java/heaps/SumElementsBetweenK1AndK2Smallest.java) |

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
Extract the `k` largest elements from an array using a **min-heap**.  
- **Approach**: Build a min-heap of size `k` to hold the largest elements. For every element in the array:
  - If the heap size is less than `k`, add the element.
  - Otherwise, compare the current element with the top of the heap. If it's larger, replace the top element.
- **Complexity**: O(n * log k)

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


* **Linked List**
    - Questions
        * Middle Element of Linked List [:link:](/src/main/java/linked_list/MiddleElementOfLinkedList.java)
        * Detect Cycle In Linked List [:link:](/src/main/java/linked_list/DetectCycleInLinkedList.java)


* **Dynamic Programming**
    * **1D DP Problems**
        * Climbing Stairs [:link:](/src/main/java/dynamic_programming/oneD/ClimbingStairs.java)
    * **p1 - 0/1 Knapsack Problem Questions**
        * 0/1 knapsack problem
        * [:link:](/src/main/java/dynamic_programming/p1/_01KnapsackRecursive.java)
        * [:link:](/src/main/java/dynamic_programming/p1/_01KnapsackMemoization.java)
        * [:link:](/src/main/java/dynamic_programming/p1/_01KnapsackTopDown.java)
        * Subset Sum
        * Equal Sum Partition
        * Count of subset sum
        * Minimum subset sum difference
        * Target Sum
        * Number of subset with given difference
    * **Buy Sell Stock Questions**
        * Buy Sell Stock 1 - Only
          once [:link:](/src/main/java/dynamic_programming/buy_sell_stock/BuySellStock1.java)
        * Buy Sell Stock 2 - Unlimited
          transactions [:link:](/src/main/java/dynamic_programming/buy_sell_stock/BuySellStock2.java)
        * Buy Sell Stock 3 - Atmost 2
          transactions [:link:](/src/main/java/dynamic_programming/buy_sell_stock/BuySellStock3.java)
        * Buy Sell Stock 4 - Atmost k
          transactions [:link:](/src/main/java/dynamic_programming/buy_sell_stock/BuySellStock4.java)
        * Buy Sell Stock 5 - With transaction
          fee [:link:](/src/main/java/dynamic_programming/buy_sell_stock/BuySellStock5.java)
        * Buy Sell Stock 6 - With Cooldown period before buy
          again [:link:](/src/main/java/dynamic_programming/buy_sell_stock/BuySellStock6.java)

* **Graphs**
    * **Day 1**
        * Graph Representation In Java Matrix
          Based [:link:](/src/main/java/graphs/day1/MatrixGraph.java)
        * Graph Representation In Java Adjacency list
          Based [:link:](/src/main/java/graphs/day1/AdjacencyListGraph.java)
        * Graph Traversal
            * BFS [:link:](/src/main/java/graphs/day1/GraphBFSTraversal.java)
            * DFS [:link:](/src/main/java/graphs/day1/GraphDFSTraversal.java)
