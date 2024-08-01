package Sorting;

import java.util.Scanner;

public class SortAlgo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        bubbleSort(arr, n);
        insertSort(arr, n);

        printArray(arr, n);
    }

    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean noSwap = true;

            for (int j = 0; j < n - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    noSwap = false;
                }
            }

            if (noSwap)
                break;

        }
    }

    static void insertSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {

            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                // shift
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
