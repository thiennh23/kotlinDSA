import kotlin.random.Random

fun main() {

    val min = 0
    val max = 1000
    val size = 100
    val array = randomArray(size, min, max)
   // var arraySorted: Array<Int>

     for (i in array) print("$i ")
     println()
    var arraySorted = insertionSort(array)
     for (i in arraySorted) print("$i ")
}

fun randomArray(size: Int, min: Int, max: Int): Array<Int> {
    return Array(size) { Random.nextInt(min, max) }
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
