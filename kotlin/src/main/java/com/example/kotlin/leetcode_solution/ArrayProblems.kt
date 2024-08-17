package com.example.kotlin.leetcode_solution

/**
 * Created by Deepak Rattan on 17/08/24
 */

fun main() {
//    val arr = intArrayOf(10, 4, 2, 20)
//    val res = findPairsWithDouble(arr)
//    println(res)
 //   println(checkIfPairExists(arr))

    val arr1 = intArrayOf(1, 2, 3, 5, 4, 2, 1)
    println("Is arr1 Valid Mountain Array : " + validMountainArray(arr1))

    val arr2 = intArrayOf(1, 5, 3, 5, 4, 8, 1)
    println("Is arr2 Valid Mountain Array : " + validMountainArray(arr2))
}

/** 1. Check If N and Its Double Exist [https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/]
 *
 * Given an array arr of integers, check if there exist two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]

Provide solution for all possible pairs
 **/
fun findPairsWithDouble(arr: IntArray): List<Pair<Int, Int>> {
    val map = mutableMapOf<Int, Int>()
    val list = mutableListOf<Pair<Int, Int>>()
    arr.forEachIndexed { index, value ->
        // Check if value is twice of any previously seen number
        if (map.contains(value * 2)) {
            list.add(Pair(index, map[value * 2]!!))
        }
        // Check if value is half of any previously seen number
        if (value % 2 == 0 && map.contains(value / 2)) {
            list.add(Pair(index, map[value / 2]!!))
        }
        map[value] = index
    }

    return list
}

/**1. Check If N and Its Double Exist
 *
 * Given an array arr of integers, check if there exist two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]

 *
 * */

fun checkIfPairExists(arr: IntArray): Boolean {
    val map = mutableMapOf<Int, Int>()
    arr.forEachIndexed { index, value ->
        // Check if value is twice of any previously seen number
        if (map.contains(value * 2)) {
            return true
        }
        // Check if value is half of any previously seen number
        if (value % 2 == 0 && map.contains(value / 2)) {
            return true
        }
        map[value] = index
    }

    return false
}


/** 2. Valid Mountain Array [https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/]
 *
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 *
 * Recall that arr is a mountain array if and only if:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

 * */

fun validMountainArray(arr: IntArray): Boolean {
    val n = arr.size

    if (n < 3) return false

    var peak = 0

    // Find the peak
    while (peak + 1 < n && arr[peak] < arr[peak + 1]) {
        peak++
    }

    // Peak should not be the first or last element
    if (peak == 0 || peak == n - 1) return false

    // Check if the sequence decreases after the peak
    while (peak + 1 < n && arr[peak] > arr[peak + 1]) {
        peak++
    }

    // If peak reached the end of the array, it's a valid mountain
    return peak == n - 1
}

