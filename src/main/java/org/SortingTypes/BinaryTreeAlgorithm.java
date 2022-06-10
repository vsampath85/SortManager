package org.SortingTypes;

import org.Exception.ChildNotFoundException;

public class BinaryTreeAlgorithm implements Sorter,BinaryTree {

    private final Node rootNode;
    private int counter = 0;
    private int[] Elements;
    Boolean getSorted = false;

    public BinaryTreeAlgorithm(final int element) {

        rootNode = new Node(element);
    }

    public int[] getSortedTreeAsc() {
        getSorted=true;
        return sortAsc(Elements);
    }

    public int[] sortAsc(int[] Elements) {
        if (!getSorted) {
            addElements(Elements);
            getSorted=false;
        }
        Elements = new int[getNumberOfElements()-1];
        counter = 0;
        sortNodeAsc(rootNode, Elements);
        return Elements;
    }

    public int[] getSortedTreeDesc() {
        int[] Elements = new int[getNumberOfElements()-1];
        sortNodeDesc(rootNode, Elements);
        return Elements;
    }

    public int getRootElement() {

        return rootNode.getValue();
    }

    public int getNumberOfElements() {

        return countNode(rootNode);
    }

    public void addElement(final int element) {

        addNodeToTree(rootNode, element);
    }

    public boolean findElement(final int element) {
        Node node = findNode(element);
        if (node != null) {
            return true;
        }
        return false;
    }

    public void addElements(int[] elements) {
        for (int element : elements) {
            addElement(element);
        }
    }

    public int getLeftChild(int element) throws ChildNotFoundException {
        Node leftNode = findNode(element).getLeftChild();
        if (leftNode != null) {
            return leftNode.getValue();
        } else
            throw new ChildNotFoundException("Left Node is Null");

    }

    public int getRightChild(int element) throws ChildNotFoundException {
        Node rightNode = findNode(element).getRightChild();
        if (rightNode != null) {
            return rightNode.getValue();
        } else
            throw new ChildNotFoundException("Right Node is Null");
    }

    private void addNodeToTree(Node node, int element) {
        if (!findElement(element)) {
            if (element < node.getValue()) {
                if (node.isLeftChildEmpty()) {
                    Node leftChild = new Node(element);
                    node.setLeftChild(leftChild);
                } else {
                    addNodeToTree(node.getLeftChild(), element);
                }
            } else if (element > node.getValue()) {
                if (node.isRightChildEmpty()) {
                    Node rightChild = new Node(element);
                    node.setRightChild(rightChild);
                } else {
                    addNodeToTree(node.getRightChild(), element);
                }
            }

        }

    }

    private Node findNode(final int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    private int countNode(Node node) {
        if (node == null) {
            return 0;
        } else {
            return (countNode(node.getLeftChild()) + countNode(node.getRightChild()) + 1);
        }
    }

    private void sortNodeAsc(Node node, int[] Elements) {
        if (node != null) {
            sortNodeAsc(node.getLeftChild(), Elements);
            if(node.getValue() != rootNode.getValue()) {
                Elements[counter++] = node.getValue();
            }
            sortNodeAsc(node.getRightChild(), Elements);
        }
    }

    private void sortNodeDesc(Node node, int[] Elements) {
        if (node != null) {
            sortNodeDesc(node.getRightChild(), Elements);
            Elements[counter++] = node.getValue();
            sortNodeDesc(node.getLeftChild(), Elements);
        }
    }

    //Sub Class Node
    public class Node {
        private final int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {

            return value;
        }

        public Node getLeftChild() {

            return leftChild;
        }

        public void setLeftChild(Node leftChild) {

            this.leftChild = leftChild;
        }

        public Node getRightChild() {

            return rightChild;
        }

        public void setRightChild(Node rightChild) {

            this.rightChild = rightChild;
        }

        public boolean isLeftChildEmpty() {

            if (leftChild == null) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isRightChildEmpty() {
            if (rightChild == null) {
                return true;
            } else {
                return false;
            }
        }


    }
}