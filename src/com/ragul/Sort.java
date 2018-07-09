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
    public int[] selectionSort(int[] list) {
        int i, j, minValue, minIndex, temp = 0;
        for (i = 1; i < list.length; i++) {
            minValue = list[i];
            minIndex = i;
            j = i - 1;
            for (j = i; j < list.length; j++) {

                if (list[j] < minValue) {
                    minValue = list[j];
                    minIndex = j;
                }

            }
            if (list[i] > minValue) {
                temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }

        }
        return list;
    }




}
