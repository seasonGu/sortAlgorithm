package com;

import java.util.Arrays;

/**
 * 插入排序，O(n^2) 稳定排序
 */
public class Insert {
    public static void main(String[] args) {
        int [] array = {1,5,2,0,7,5,10};
        Insert.InsertSortOptimize(array);
        System.out.println(Arrays.toString(array));
    }

    public static void InsertSort(int [] array) {
        int temp;
        for(int i = 0; i< array.length; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    public static void InsertSortOptimize(int [] array) {
        int temp;
        for(int i = 1; i< array.length; i++) {
            temp = array[i];
            int j;
            for(j = i; j > 0 && array[j-1]>temp; j--) {
                array[j] = array[j-1];
            }
            array[j] = temp;
        }
    }
}
