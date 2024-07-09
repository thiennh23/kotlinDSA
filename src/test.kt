//fun main() {
//    print("Enter the name: ")
//    var name = readlnOrNull()
//    println(name)
//}
//
//fun logic(name: String): Boolean {
//    /*var arr = arrayOf("");
//    for (i in name.length) {
//        arr[i] = name[i]
//    }*/
//    return true
//}

fun main() {
    val x: Any = 29.9

    /*when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }*/

    var a: String? = "ABC"
    println(a)
    println(a?.length)
    a = null
    println(a)
    println(a?.length)

    var favoriteActor: String? = "null"
    //println(favoriteActor!!.length)
    var numer = favoriteActor?.length ?: 0
    println(numer)

}