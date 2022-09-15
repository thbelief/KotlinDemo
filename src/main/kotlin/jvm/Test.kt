package jvm

class Test @JvmOverloads constructor(a: Int, b: Int = 3, c: Int = 4) {

    @Volatile
    var a = lazy {
        System.currentTimeMillis().toInt()
    }

    companion object {
        @JvmStatic
        @Synchronized
        @Throws(Exception::class)
        fun add(a: Int, b: Int) {
        }
    }
}