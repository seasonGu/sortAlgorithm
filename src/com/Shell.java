package com;

import java.util.Arrays;

/**
 * 希尔排序，分组的插入排序，不稳定，O(nlogn) - O(n^2)
 */
public class Shell {
    public static void main(String[] args) {
        int [] array = {1,5,2,0,7,5,10};
        Shell.shellSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void shellSort(int [] array) {
        for(int gap=array.length/2; gap > 0; gap/=2) {
            for(int i = gap; i< array.length; i++) {
                int temp = array[i];
                int j;
                for(j = i; j-gap >= 0 && temp < array[j - gap]; j-= gap) {
                    array[j] = array[j-gap];
                }
                array[j] = temp;
            }
        }
    }
}
