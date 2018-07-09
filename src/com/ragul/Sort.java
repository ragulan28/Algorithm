package com.ragul;

public class Sort {

    public int[] insertionSort(int[] list) {
        int i, j, key, temp;
        for (i = 1; i < list.length; i++) {
            key = list[i];
            j = i - 1;
            while (j >= 0 && key < list[j]) {
                temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                j--;
            }

        }
        return list;
    }



}
