package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bucket {
    public static void main(String[] args) throws Exception {
        int [] array = {1,5,2,0,7,5,10};
        Heap.HeapSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bucketSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        int bucketNum = (max - min) / arr.length + 1;

        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketArr.add(new ArrayList<>());
        }

        for (int i = 0; i < arr.length; i++) {
            int num = (arr[i] - min) / (arr.length);
            bucketArr.get(num).add(arr[i]);
        }

        for (int i = 0; i < bucketArr.size(); i++) {
            Collections.sort(bucketArr.get(i));
        }

        int index = 0;
        for (ArrayList<Integer> list : bucketArr) {
            for (Integer integer : list) {
                arr[index ++] = integer;
            }
        }
    }
}
