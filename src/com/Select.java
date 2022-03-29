package com;

import java.util.Arrays;

public class Select {
    public static void main(String[] args) {
        int [] array = {1,5,2,0,7,5,10};
        Select.SelectSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void SelectSort(int [] array) {
        for(int i =0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if(i != minIndex) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }
}
