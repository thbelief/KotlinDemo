import jvm.objectClass.log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
//    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")


//        Test test = new Test(2);

    CoroutineScope(Dispatchers.IO).launch(){
        log("1")
    }
    CoroutineScope(Dispatchers.IO).launch(){
        log("2")
    }
}