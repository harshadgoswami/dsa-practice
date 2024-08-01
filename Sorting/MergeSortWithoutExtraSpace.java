package Sorting;

// Java program to sort an array 
// using merge sort such that 
// merge operation takes O(1) 
// extra space.
import java.util.Arrays;

class MergeSortWithoutExtraSpace {

    static void merge(int[] arr, int beg,
            int mid, int end,
            int maxele) {
        int i = beg;
        int j = mid + 1;
        int k = beg;
        while (i <= mid && j <= end) {
            if (arr[i] % maxele <= arr[j] % maxele) {
                arr[k] = arr[k] + (arr[i]
                        % maxele) * maxele;
                k++;
                i++;
            } else {
                arr[k] = arr[k] +
                        (arr[j] % maxele)
                                * maxele;
                k++;
                j++;
            }
        }
        while (i <= mid) {
            arr[k] = arr[k] + (arr[i]
                    % maxele) * maxele;
            k++;
            i++;
        }
        while (j <= end) {
            arr[k] = arr[k] + (arr[j]
                    % maxele) * maxele;
            k++;
            j++;
        }

        // Obtaining actual values
        for (i = beg; i <= end; i++) {
            arr[i] = arr[i] / maxele;
        }
    }

    // Recursive merge sort
    // with extra parameter, naxele
    static void mergeSortRec(int[] arr, int beg,
            int end, int maxele) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSortRec(arr, beg,
                    mid, maxele);
            mergeSortRec(arr, mid + 1,
                    end, maxele);
            merge(arr, beg, mid,
                    end, maxele);
        }
    }

    // This functions finds
    // max element and calls
    // recursive merge sort.
    static void mergeSort(int[] arr, int n) {
        int maxele = Arrays.stream(arr).max().getAsInt() + 1;
        mergeSortRec(arr, 0, n - 1, maxele);
    }

    // Driver code
    public static void main(String[] args) {

        int[] arr = { 999, 612, 589,
                856, 56, 945, 243 };
        int n = arr.length;

        mergeSort(arr, n);

        System.out.println("Sorted array ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// This code is contributed by 29AjayKumar
