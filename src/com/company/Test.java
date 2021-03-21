package com.company;

public class Test {
    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length+array2.length];
        int i=0, int j=0;
        while(i<array1.length && j<array2.length) {
            if (array1[i]<array2[i]) {
                array3[i]=array1[i];
                i++;
            } else {
                array3[i]=array2[i];
            }
        }
        return array3;
    }
}
