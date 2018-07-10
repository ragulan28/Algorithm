package com.ragul;

public class Search {

    int binarySearch(int list[], int lowIndex, int highIndex, int find)
    {
        if (highIndex>=lowIndex)
        {
            int mid = lowIndex + (highIndex - lowIndex)/2;

            // If the element is present at the
            // middle itself
            if (list[mid] == find)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (list[mid] > find)
                return binarySearch(list, lowIndex, mid-1, find);

            // Else the element can only be present
            // in right subarray
            return binarySearch(list, mid+1, highIndex, find);
        }

        // We reach here when element is not present
        //  in array
        return -1;
    }

   int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
