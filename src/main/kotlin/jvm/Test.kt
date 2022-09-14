package jvm

class Test @JvmOverloads constructor(a: Int, b: Int = 3, c: Int = 4) {

    @Volatile
    var a: Int = 3

    companion object {
        @JvmStatic
        @Synchronized
        @Throws(Exception::class)
        fun add(a: Int, b: Int) {}
    }
}