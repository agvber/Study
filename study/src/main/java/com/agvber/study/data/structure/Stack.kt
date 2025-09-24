package com.agvber.study.data.structure

class Stack<T> {

    private val list = mutableListOf<T>()

    fun push(value: T) {
        list.add(value)
    }

    fun pop(): T {
        val lastIndex = list.lastIndex
        val lastItem = list[lastIndex]
        list.removeAt(lastIndex)
        return lastItem
    }

    fun peek(): T {
        return list.last()
    }

}

private fun main() {
    val intStack = Stack<Int>()

    listOf(1, 2, 3).forEach {
        intStack.push(it)
    }

    require(3 == intStack.pop())
    require(2 == intStack.pop())
    require(1 == intStack.peek())
}