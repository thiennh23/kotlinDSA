import kotlin.random.Random


fun main() {
    var size = 20
    var min = 0
    var max = 999
    var array = randomBubbleSortArray(size, min, max)
    for (i in array) {
        print("$i ")
    }
}

fun bubbleSort(array: IntArray) {

}

fun randomBubbleSortArray(size: Int, min: Int, max: Int): Array<Int> {
    return Array(size) { Random.nextInt(min, max)}
}