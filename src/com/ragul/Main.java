package com.ragul;

public class Main {

    public static void main(String[] args) {
        int[] list={2,3,5,8,9,3,33,455,67,89,22,32};
        Sort sort = new Sort();
//        QuickSort  quickSort=new QuickSort();
        int[] sortedList=sort.insertionSort(list);


        for (int number : list) {
            System.out.print(number+" ");
        }
        System.out.println();
        Search search=new Search();
        System.out.println(search.linearSearch(list, 33));

    }
}
