package com.agvber.study

object Assert {

    fun <T> equal(actual: T, expect: T) {
        require(actual == expect) {
            "UnExpect actual: $actual expect: $expect"
        }
    }
}