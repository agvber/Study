package com.agvber.study.data.structure

import com.agvber.study.Assert

class BinaryTree<T> {

    fun preOrderTraversal(
        binaryNode: BinaryNode<T>?,
        result: MutableList<T> = mutableListOf()
    ) {
        if (binaryNode == null) return

        result.add(binaryNode.value)
        preOrderTraversal(binaryNode.leftChildNode, result)
        preOrderTraversal(binaryNode.rightChildNodes, result)
    }

    fun inOrderTraversal(
        binaryNode: BinaryNode<T>?,
        result: MutableList<T> = mutableListOf()
    ) {
        if (binaryNode == null) return

        inOrderTraversal(binaryNode.leftChildNode, result)
        result.add(binaryNode.value)
        inOrderTraversal(binaryNode.rightChildNodes, result)
    }

    fun postOrderTraversal(
        binaryNode: BinaryNode<T>?,
        result: MutableList<T> = mutableListOf()
    ) {
        if (binaryNode == null) return
        postOrderTraversal(binaryNode.leftChildNode, result)
        postOrderTraversal(binaryNode.rightChildNodes, result)
        result.add(binaryNode.value)
    }
}

private fun main() {
    val rootNode: BinaryNode<Char> = BinaryNode('R').apply {
        leftChildNode = BinaryNode('A').apply {
            leftChildNode = BinaryNode('C')
            rightChildNodes = BinaryNode('D')
        }
        rightChildNodes = BinaryNode('B').apply {
            leftChildNode = BinaryNode('E')
            rightChildNodes = BinaryNode('F')
        }
    }

    val binaryTree = BinaryTree<Char>()

    val preOrderTraversal = mutableListOf<Char>()
    binaryTree.preOrderTraversal(rootNode, preOrderTraversal)
    Assert.equal(preOrderTraversal, listOf('R', 'A', 'C', 'D', 'B', 'E', 'F'))

    val inOrderTraversal = mutableListOf<Char>()
    binaryTree.inOrderTraversal(rootNode, inOrderTraversal)
    Assert.equal(inOrderTraversal, listOf('C', 'A', 'D', 'R', 'E', 'B', 'F'))

    val postOrderTraversal = mutableListOf<Char>()
    binaryTree.postOrderTraversal(rootNode, postOrderTraversal)
    Assert.equal(postOrderTraversal, listOf('C', 'D', 'A', 'E', 'F', 'B', 'R'))
}