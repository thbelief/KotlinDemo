package jvm

import java.lang.Thread.sleep

object objectClass {

    @JvmStatic
    fun log(str: String) {
        println("$str start")
        sleep(1000)
        println("$str end")
    }
}