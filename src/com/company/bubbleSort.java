package com.company;

public class bubbleSort {
    // A function to implement bubble sort
    static void swap(int i, int j)
    {
        int temp = i;
    i = j;
    j = temp;
    }

    static void BubbleSort(int[] arr, int n)
    {
        int i, j;
        for (i = 0; i < n-1; i++) {

        // Last i elements are already in place
        for (j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1])
                swap(arr[j], arr[j + 1]);
    }
    }
}
