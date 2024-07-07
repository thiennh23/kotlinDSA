fun main() {
    var array = arrayOf(12, 11, 13, 5, 6)
    println("Unsorted array: ${array.joinToString(", ")}")
    insertionSort(array)
    println("Sorted array: ${array.joinToString(", ")}")
     for (i in array) print("$i ")
     println()
     array = insertionSort(array)
     for (i in array) print("$i ")
}

fun insertionSort(arr: Array<Int>): Array<Int> {
    val n = arr.size
    for (i in 1..< n) {
        var temp = arr[i]
        var j = i - 1
        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j]
            j--
        }
        arr[j + 1] = temp
    }
    return arr
}
