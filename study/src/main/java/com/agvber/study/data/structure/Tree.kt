package com.agvber.study.data.structure

import com.agvber.study.Assert

class Tree<T>(data: T) {
    val root = Node(data)

    val test = mutableListOf<T>()

    fun traversePreOrder(node: Node<T>) {
        test.add(node.value)
        node.childNodes.forEach {
            traversePreOrder(it)
        }
    }
}

private fun main() {
    val tree = Tree(1)
    val childNode2 = Node(2)
    val childNode3 = Node(3)

    tree.root.childNodes.add(childNode2)
    tree.root.childNodes.add(childNode3)

    childNode2.addChildNode(Node(4))
    childNode2.addChildNode(Node(5))

    childNode3.addChildNode(Node(6))
    childNode3.addChildNode(Node(7))

    tree.traversePreOrder(tree.root)
    Assert.equal(tree.test, listOf(1, 2, 4, 5, 3, 6, 7))
}