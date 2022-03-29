package com;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int [] array = {1,5,2,0,7,5,10};
        Quick.quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int [] array) {
        qSort(array, 0, array.length - 1);
    }

    public static void qSort(int [] array, int low, int high) {
        int pivot;
        if(low < high) {
            pivot = partition(array, low, high);
            qSort(array, low, pivot);
            qSort(array, pivot + 1, high);
        }
    }
    public static int partition(int [] array, int low, int high) {
        int pivotValue = array[low];
        while(low < high) {
            while(low < high && array[high] >= pivotValue) {
                high--;
            }
            array[low] = array[high];
            while(low < high && array[low] <= pivotValue) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = pivotValue;
        return low;
    }
}
