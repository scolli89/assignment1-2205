/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Sean_2
 */
public class SelectionSort implements SortingStrategy{
    @Override
    public void sort(int[] a){
        
    }

    public static <T extends Comparable<? super T>> void Sort(T[] a, int n) {
        for (int index = 0; index < n- 1; index++) {
            int indexOfNextSmallest = getIndexOfSmallest(a, index, n - 1);
            swap(a, index, indexOfNextSmallest);
        } // end for
    } // end Sort

    private static <T extends Comparable<? super T>> int getIndexOfSmallest(T[] a, int first,int last) {
        T min = a[first];
        int indexOfMin = first;
        for (int index = first + 1; index <= last; index++) {
            if (a[index].compareTo(min) < 0) {
                min = a[index];
                indexOfMin = index;
            } // end if
        } // end for
        return indexOfMin;
    } // end getIndexOfSmallest

    private static void swap(Object[] a,int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    } // end swap
} // end SelectionSort
