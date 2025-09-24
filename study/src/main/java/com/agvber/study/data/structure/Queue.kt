package com.agvber.study.data.structure

import com.agvber.study.Assert

private const val FIRST_INDEX = 0

class Queue<T> {

    private val queue = mutableListOf<T>()

    fun put(value: T) {
        queue.add(value)
    }

    fun get(): T {
        val fistItem = queue[FIRST_INDEX]
        queue.removeAt(FIRST_INDEX)
        return fistItem
    }
}

private fun main() {
    val intQueue = Queue<Int>()

    listOf(0, 1, 2).forEach {
        intQueue.put(it)
    }

    Assert.equal(intQueue.get(), 0)
    Assert.equal(intQueue.get(), 1)
    Assert.equal(intQueue.get(), 2)
}