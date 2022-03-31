package com;

import java.util.Arrays;

/**
 * 堆排序，先将数组通过下沉变成最大堆或最小堆
 * 不稳定，O(nlogn)
 */
public class Heap {
    public static void main(String[] args) {
        int [] array = {1,5,2,0,7,5,10};
        Heap.HeapSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void HeapSort(int [] array) {
        int n = array.length;
        int temp;
        for(int i = n/2 -1; i>=0; i--) {
            HeapDown(array, i, n-1);
        }
        for(int i = n-1; i > 0; i--) {
            temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            HeapDown(array, 0, i-1);
        }
    }
    public static void HeapDown(int [] array, int start, int end) {
        int c = start;
        int l = 2*c + 1;
        int temp = array[c];
        for(;l <= end; c=l,l=2*l + 1) {
            if(l < end && array[l] < array[l+1])
                l++;
            if(temp > array[l])
                break;
            else {
                array[c] = array[l];
                array[l] = temp;
            }
        }
    }
}
