import sun.misc.Lock
import java.lang.System.gc

fun String.sumBy(change: (Char) -> Int): Int {
    var sum = 0
    for (item in this) {
        sum += change(item)
    }
    return sum
}

fun <T> block(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}

class Student(
    var name: String? = null,
    var id: String? = null
)

var student1: Student? = null

//不指定初始值的情况，此时必须指定泛型
var student: Student? by Weak()
var student5 by Weak<Student>()
//需要指定初始值的情况
//自动推断出泛型
var student2 by Weak{
    Student("student2","2")
}
//也可以指定泛型，一种是给属性指定类型，必须为可null的
var student3: Student? by Weak {
    Student("student3","3")
}
//第二种是为Weak指定泛型，不可null的
var student4 by Weak<Student> {
    Student("student4","4")
}

fun main(args: Array<String>) {

    student = Student("dsjjkds","dskajfkls")
    student5 = Student("student5","student5")
    student1 = Student("student1","student1")
    gc()
    println(student)
    println(student1)
    println(student2)
    println(student3)
    println(student4)
    println(student5)

//    println("b".sumBy { it.code })

//    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")


//        Test test = new Test(2);

//    CoroutineScope(Dispatchers.IO).launch(){
//        log("1")
//    }
//    CoroutineScope(Dispatchers.IO).launch(){
//        log("2")
//    }

//    var test: String? = "dsajkhjkds"
//    test = test?.let{
//        null
//    }?: "dsdksjf"
//    println(test)
//    println(if(test == null) "abc" else "dsdksjf")
}