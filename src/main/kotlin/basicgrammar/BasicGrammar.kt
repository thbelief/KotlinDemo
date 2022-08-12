package basicgrammar

fun add(a: Int, b: Int): Int = a + b
fun add1(a: Int, b: Int): Int {
    return a + b
}

fun log(): Unit = println("this")
fun log1() = println("this")

class BasicGrammar(var a: Int, var b: Int) {
    var sum = a + b
}

// must use open to extend
open class Base

class temp() : Base() {

}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun whenFun(a: Int): String = when (a) {
    1 -> "one"
    2 -> "two"
    else -> "none"
}

fun nullFun(a: Int): Int? {
    if (a == 1) {
        return null
    }
    return a
}

fun main() {
    println(add(1, 2))
    println(add1(1, 2))
    log()
    log1()


    val constant = 2
    var variable = 3
    //constant++
    variable++
    var basicgrammar = BasicGrammar(3, 5)
    println(basicgrammar.a + basicgrammar.b + basicgrammar.sum)

    var a = 1
    var b = "test"
    println("a is $a and b is ${b.replace("e", "t")}")

    var list = listOf(1, 2, 3, 4, 5)
//    for (item in list) {
//        println(item)
//    }
//    for (index in list.indices) {
//        println(index)
//    }

    println(whenFun(3))

    println(3 in list)
    println(10 !in list)

//    for (x in 1..5) {
//        println(x)
//    }
//
//    for (x in 10 downTo 3 step 1) {
//        println(x)
//    }

    var temp = 1223
    if (temp is Int) {
        // no need for conversion after derivation
        temp++
        println(temp)
    }

}
