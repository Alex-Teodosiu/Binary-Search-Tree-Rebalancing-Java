package com.alex.binarytree;

import com.binarytree.alex.BinaryTreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;

class BinaryTreeNodeTest<E> {
    BinaryTreeNode<E> binaryTreeNode;

    @BeforeEach
    public void setUp() throws Exception {
        binaryTreeNode = new BinaryTreeNode<E>();
    }

    @Test
    void setElementTest() {
        //Given
        E element = (E)"root";
        //When
        binaryTreeNode.setElement(element);
        //Then
        assertEquals(element, binaryTreeNode.getElement());
    }

    @Test
    void getElementTest() {
        //Given
        E element = (E)"root";
        //When
        binaryTreeNode.setElement(element);
        //Then
        assertEquals(element, binaryTreeNode.getElement());
    }

    @Test
    @DisplayName("Left Node let's see ripppp")
        void addLeftChildTest(){
        //Given
        E element = (E)"left node value";
        BinaryTreeNode left = new BinaryTreeNode();
        left.setElement(element);
        //When
        binaryTreeNode.addLeftChild(left);
        //Then
        assertEquals(left, binaryTreeNode.getLeftChild());
    }

    @Test
    void addRightChildTest(){
        //Given
        E element = (E)"right node value";
        BinaryTreeNode right = new BinaryTreeNode();
        right.setElement(element);
        //When
        binaryTreeNode.addRightChild(right);
        //Then
        assertEquals(right, binaryTreeNode.getRightChild());
    }

}
