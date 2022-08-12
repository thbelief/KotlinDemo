package custom

/**
 * DTO
 */
data class Student(var name: String, var id: Int)

fun defaultFun(a: Int, b: String = "default") {

}

class Custom {

}

val lazyString: String by lazy {
    val timeStamp = System.currentTimeMillis()
    "$timeStamp"
}

fun String.change(): String {
    return "changeTo" + this
}

// single instance
object Data {
    val name = "thbelief"
    val age = 15
}

// abstract class
abstract class Base<T> {
    abstract fun getName(): T
}

abstract class Test() {
    abstract fun test1()
    abstract fun test2()
    abstract fun test3()
    abstract fun test4()
}

class Test1() : Test() {
    override fun test1() {
        println("Not yet implemented")
    }

    override fun test2() {
        println("Not yet implemented")
    }

    override fun test3() {
        println("Not yet implemented")
    }

    override fun test4() {
        println("Not yet implemented")
    }

}

fun main() {
    var student = Student("thbelief", 123)
    var name = student.component1()
    var id = student.component2()
    println(name + id)
    var (name1, id1) = student
    println(name1 + id1)

    defaultFun(3)

    var map = mapOf("a" to 1, "b" to 2)
    for ((key, value) in map) {
        println(key + " " + value)
    }

    println("lazy :" + lazyString)

    println("extend :" + "1235".change())

    println("single instance " + Data.name)

    println("abstract " + object : Base<String>() {
        override fun getName(): String {
            return "thbelief"
        }
    }.getName())

    val lList = listOf("sjdkds", "dskdklsd", null)
    // if not null
    for (item in lList) {
        println(item?.length)
        println(item?.length ?: "null")
        item?.let {
            println("not null")
        }
    }

    val test = Test1()
    with(test) {
        this.test1()
        this.test2()
        this.test3()
        this.test4()
    }

    
}