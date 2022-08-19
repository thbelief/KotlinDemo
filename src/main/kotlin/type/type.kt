package type

import java.math.BigDecimal

class type {

}

fun main() {
    /**
     * [Byte] [Short] [Int] [Long]
     * not support implicit derivation
     */
    val num: Byte = 1

    /**
     * [Float] [Double]
     */
    val floatingPointNumber = 0.25f

    val simple1 = 123
    val simple2 = 123L
    val simple3 = 0x0F
    val simple4 = 0b00001011
    // 1_000_000 is 1000000
    val oneMillion = 1_000_000
    println(oneMillion)

    oneMillion.toLong()
    oneMillion.toString()

    /**
     * [shl] [shr] [ushr] [and] [or] [xor] [inv]
     */
    val test = (oneMillion shl 2) and 0x00f0

    val fa = 1.0
    val fb = 2.0
    fa == fb
    fa.compareTo(fb)
    BigDecimal.valueOf(fa).compareTo(BigDecimal.ONE)

    val s = "this is string"
    println(s[10])

    val originString = """
    |this is origin
    | 
    |String
    |"""
    /**
     * use | and trimMargin to remove margin
     */
    println(originString.trimMargin())

    /**
     * [Array]
     * init array
     */
    val array1 = arrayOf(1..5)
    val array2 = arrayOfNulls<Any?>(10)
    val array3 = Array(10) {
        it.toString()
    }

    val intArray = IntArray(5)
    val flaArray = FloatArray(5)

    if (3 is Int) {
        println("yes")
    }

    /**
     * change
     */
    val y = "1000"
    val x: String? = y as String?
    val x1: String? = y as? String
}