package reflect

import reflect.ReflectDemo.Companion.test

class ReflectDemo {
    companion object {
        fun test(){
            try {
                val clazz = Class.forName("reflect.Test.java")
                println(clazz)
                val declaredMethod = clazz.getDeclaredMethod("getInstance", null)
                declaredMethod.isAccessible = true
            } catch (e: Exception) {
                print(e)
            }
        }
    }
}

fun main() {
    test()
}