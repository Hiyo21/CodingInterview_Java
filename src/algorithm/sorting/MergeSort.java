package algorithm.sorting;

import org.junit.Assert;
import org.junit.Test;

public class MergeSort {
    public int[] orgArr;
    public int[] helperArr;

    public void sort(int[] arr){
        if(arr.length < 2) return;

        this.orgArr = arr;
        this.helperArr = new int[arr.length];

        // call merge sort. !important -> arr.length는 -1 해주기!
        mergeSort(0, arr.length - 1);
    }

    private void mergeSort(int low, int high){
        if(low < high){
            int pivot =  (int) Math.floor((high + low) / 2);
            mergeSort(low, pivot);
            mergeSort(pivot + 1, high);
            merge(low, pivot, high);
        }
    }

    private void merge(int low, int pivot, int high) {

        int helperLeft = low;
        int helperRight = pivot + 1;
        int current = low;

        while(helperLeft <= pivot && helperRight <= high){
            if(helperLeft <= pivot){
                orgArr[current] = helperArr[helperLeft];
                helperLeft++;
            }else {
                orgArr[current] = helperArr[helperRight];
                helperRight++;
            }
            current++;
        }

        if(helperLeft <= pivot){
            while(helperLeft <= pivot){
                orgArr[current] = helperArr[helperLeft];
                helperLeft++;
                current++;
            }
        }
        if(helperRight <= high) {
            while(helperRight <= high){
                orgArr[current] = helperArr[helperRight];
                helperRight++;
                current++;
            }
        }
    }
}

