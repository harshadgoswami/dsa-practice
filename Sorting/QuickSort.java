package Sorting;

/**
 * https://ide.geeksforgeeks.org/online-java-compiler/9159b2d8-3749-4380-a600-6059da7069b7
*/

import java.util.*;

public class QuickSort {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        new Solution().quickSort(arr, 0, n - 1);
        printArray(arr);

    }
}

class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        if (low >= high)
            return;

        int PIdx = partition(arr, low, high);

        quickSort(arr, low, PIdx - 1);
        quickSort(arr, PIdx + 1, high);

    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int i = low - 1, j = low, pivot = arr[high];

        for (j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }
}