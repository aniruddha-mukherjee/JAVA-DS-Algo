package com.data.structure;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args){
        int[] arr = {};
        int key = 100;

        //int pos = findPosition(arr, key);

        deleteKey(arr, key);

        System.out.println(Arrays.toString(arr));
    }

    static int findPosition(int[] arr, int key){
       return ArrayUtils.indexOf(arr, key);
    }

    static int deleteKey(int[] arr, int k){
        int pos = ArrayUtils.indexOf(arr, k);
        if(pos == -1)
            return pos;
        for (int i= pos; i<arr.length-1;i++)
            arr[i] = arr[i+1];

        arr[arr.length-1] =  0;

        return pos;
    }
}
