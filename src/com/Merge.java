package com;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int [] array = {1,5,2,0,7,5,10};
        int [] temp = new int[array.length];
        Merge.mergeSort(array,0,array.length-1,temp);
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int [] array, int low, int high, int [] temp) {
        int middle = (low + high)/2;
        if(low < high) {
            mergeSort(array, low, middle, temp);
            mergeSort(array, middle+1, high, temp);
            merge(array, low, middle, high, temp);
        }

    }

    public static void merge(int [] array,int low, int middle, int high, int [] temp) {
        int i = 0;
        int j = low;
        int k = middle +1;
        while(j <= middle && k <= high) {
            if( array[j] < array[k])
                temp[i++] = array[j++];
            else
                temp[i++] = array[k++];
        }
        while(j<= middle)
            temp[i++] = array[j++];
        while(k <= high)
            temp[i++] = array[k++];
        for(int t=0; t< i; t++) {
            array[low+t] = temp[t];
        }
    }
}
