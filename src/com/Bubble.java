package com;

import java.util.Arrays;

/**
 * 冒泡排序，O(n^2)
 */
public class Bubble {
    public static void main(String[] args){
        int [] array = {1,5,2,0,7,5,10};
        Bubble.BubbleSortOptimize(array);
        System.out.println(Arrays.toString(array));
    }
    public static void BubbleSort(int [] array) {
        int temp;
        for(int i =0; i < array.length; i++) {
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void BubbleSortOptimize(int [] array) {
        int temp;
        boolean flag = false;
        for(int i =0; i < array.length; i++) {
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }
}
