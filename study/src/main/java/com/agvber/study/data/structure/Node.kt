package com.agvber.study.data.structure

class Node<T>(val value: T) {

    val childNodes = mutableListOf<Node<T>>()

    fun addChildNode(node: Node<T>) {
        childNodes.add(node)
    }
}