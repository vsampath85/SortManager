package org.SortingTypes;

import org.Exception.ChildNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeAlgorithmTest {
    @Test
    @DisplayName("check that the given root node is in the binary tree")
    void checkrootelement() {
        BinaryTreeAlgorithm tree = new BinaryTreeAlgorithm(20);
        Assertions.assertEquals(true,tree.findElement(20));
    }

    @Test
    @DisplayName("check that the given element not in the binary tree")
    void checkelementnotinbinarytree() {
        BinaryTreeAlgorithm tree = new BinaryTreeAlgorithm(20);
        tree.addElements(new int[]{10,5,2,1,3,7,29,590,45,32,30});
        Assertions.assertEquals(false,tree.findElement(6));
    }


    @Test
    @DisplayName("check that the given element  in the binary tree")
    void checkelementinbinarytree() {
        BinaryTreeAlgorithm tree = new BinaryTreeAlgorithm(20);
        tree.addElements(new int[]{10,5,2,1,3,7,29,590,45,32,30});
        Assertions.assertEquals(true,tree.findElement(590));
    }

    @Test
    @DisplayName("check that the given root node differs from  the binary tree")
    void checkrootelementdiffers() {
        BinaryTreeAlgorithm tree = new BinaryTreeAlgorithm(20);
        Assertions.assertEquals(false,tree.findElement(6));
    }

    @Test
    @DisplayName("check that left child from  the binary tree if it null")
    void checkleftchildexception() {
        BinaryTreeAlgorithm tree = new BinaryTreeAlgorithm(20);
        tree.addElements(new int[]{10,5,2,1,3,7,29,590,45,32,30});
        Throwable throwable = assertThrows(ChildNotFoundException.class, () -> tree.getLeftChild(1), "Expected getleftchild to throw, but didn't");
        assertTrue(throwable.getMessage().contains("Left Node is Null"));
    }

    @Test
    @DisplayName("check that right child from  the binary tree if it null")
    void checkrightchildexception() {
        BinaryTreeAlgorithm tree = new BinaryTreeAlgorithm(20);
        tree.addElements(new int[]{10,5,2,1,3,7,29,590,45,32,30});
        Throwable throwable = assertThrows(ChildNotFoundException.class, () -> tree.getRightChild(590), "Expected getrightchild to throw, but didn't");
        assertTrue(throwable.getMessage().contains("Right Node is Null"));
    }


    @Test
    @DisplayName("check that the given array is in ascending")
    void getSortedTreeAsc() {
        BinaryTreeAlgorithm tree = new BinaryTreeAlgorithm(20);
        tree.addElements(new int[]{10,5,2,1,3,7,29,590,45,32,30});
        //System.out.println("The sorted Binary Tree asc");
        //for (int Element : tree.getSortedTreeAsc()) {
        // System.out.println(Element);
        Assertions.assertArrayEquals((new int[] {1,2,3,5,7,10,20,29,30,32,45,590}), tree.getSortedTreeAsc());
    }

    @Test
    @DisplayName("check that the given array is in ascending with negative number")
    void getSortedTreeAscnegative() {
        BinaryTreeAlgorithm tree = new BinaryTreeAlgorithm(20);
        tree.addElements(new int[]{-7,-1,10,5,2,1,3,7,29,590,45,32,30});
        //System.out.println("The sorted Binary Tree asc");
        //for (int Element : tree.getSortedTreeAsc()) {
        // System.out.println(Element);
        Assertions.assertArrayEquals((new int[] {-7,-1,1,2,3,5,7,10,20,29,30,32,45,590}), tree.getSortedTreeAsc());
    }


    @Test
    @DisplayName("check that the given array is in decending")
    void getSortedTreeDesc() {
        BinaryTreeAlgorithm tree = new BinaryTreeAlgorithm(20);
        tree.addElements(new int[]{10,5,2,1,3,7,29,590,45,32,30});
        Assertions.assertArrayEquals((new int[] {590,45,32,30,29,20,10,7,5,3,2,1}), tree.getSortedTreeDesc());

    }
    @Test
    @DisplayName("check that the given array is in decending with negative  number")
    void getSortedTreeDescnegative() {
        BinaryTreeAlgorithm tree = new BinaryTreeAlgorithm(20);
        tree.addElements(new int[]{-7,-1,10,5,2,1,3,7,29,590,45,32,30});
        Assertions.assertArrayEquals((new int[] {590,45,32,30,29,20,10,7,5,3,2,1,-1,-7}), tree.getSortedTreeDesc());

    }


}