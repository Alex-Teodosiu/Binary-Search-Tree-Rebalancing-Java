package com.binarytree.alex;

public class BinaryTreeNode<E> implements Comparable<E>{
    private E element;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;


    public void setElement(E element){
        this.element = element;
    }

    public E getElement(){
        return element;
    }


    public void addLeftChild(BinaryTreeNode leftChild){
        this.leftChild = leftChild;
    }

    public void addRightChild(BinaryTreeNode rightChild){
        this.rightChild = rightChild;
    }

    public BinaryTreeNode getLeftChild(){
        return leftChild;
    }

    public BinaryTreeNode getRightChild(){
        return rightChild;
    }

    @Override
    public int compareTo(E o) {
        return 0;
    }
}
