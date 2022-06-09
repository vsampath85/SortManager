package org.SortingTypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class MergeSortAlgorithmTest {

    @Test
    @DisplayName("check that the given number is sorted")
    public void checksort(){
        Assertions.assertArrayEquals((new int[]{1, 34}), MergeSortAlgorithm.mergeSort(new int[]{ 34, 1},2));
    }
    @Test
    @DisplayName("check that the given number is sorted")
    public void checkTotal() {
        Assertions.assertArrayEquals((new int[]{2,34,67,89}), MergeSortAlgorithm.mergeSort(new int[]{ 67,89,34,2},4));
    }

    @Test
    @DisplayName("check that the given number is sorted")
    public void checknegative() {
        Assertions.assertArrayEquals((new int[]{-89,-78,-67,-45,-34,-2}), MergeSortAlgorithm.mergeSort(new int[]{ -67,-89,-34,-2,-45,-78},6));
    }


    @Test
    @DisplayName("check that the given number is sorted with positive and negative ")
    public void checkbothpossitiveandnegative(){
        Assertions.assertArrayEquals((new int[]{-34,1,56}), MergeSortAlgorithm.mergeSort(new int[]{ 56, 1,-34},3));
    }

    @Test
    @DisplayName("check that the given number is sorted using positive numbers")
    public void checkbothpossitiverange(){
        Assertions.assertArrayEquals((new int[]{0,1,34,56,67,78,90,90}), MergeSortAlgorithm.mergeSort(new int[]{ 1,0,67,90,56,34,78,90},8));
    }
    @Test
    @DisplayName("check that the given number is sorted")
    public void checkwithnullvalues(){
        Assertions.assertArrayEquals((new int[]{}), MergeSortAlgorithm.mergeSort(new int[]{ },0));
    }


}