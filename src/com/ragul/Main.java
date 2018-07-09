package com.ragul;

public class Main {

    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] list={2,3,5,8,9,3,33,455,67,89,22,32};
        int[] sortedList=sort.insertionSort(list);

        for (int number : sortedList) {
            System.out.print(number+" ");
        }
    }
}
