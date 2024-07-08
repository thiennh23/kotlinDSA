import kotlin.random.Random

fun main() {
    var n = 115
    var min = 0
    var max = 2532
    var array = randomArraySelectionSort(n, min, max)
    for (i in array) {
        print("$i ")
    }

    println()

    var arr = selectionSort(array)
    for (i in arr) {
        print("$i ")
    }
}

fun selectionSort(array: Array<Int>): Array<Int> {

    for (i in array.indices) {
        var min = array[i]
        var index = i

        for (j in i + 1..< array.size) {
            if (array[j] < array[index]) {
                min = array[j]
                index = j
            }
        }

        array[index] = array[i]
        array[i] = min

    }

    return array
}

fun randomArraySelectionSort(
    n: Int,
    min: Int,
    max: Int
): Array<Int> {
    return Array(n) { Random.nextInt(min, max) }
}