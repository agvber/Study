package com.agvber.study.data.structure

data class BinaryNode<T>(
    val value: T,
    var leftChildNode: BinaryNode<T>? = null,
    var rightChildNodes: BinaryNode<T>? = null,
)