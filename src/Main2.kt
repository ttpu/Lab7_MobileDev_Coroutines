import kotlinx.coroutines.*

fun main() = runBlocking{

    // espresso

    println("start")

    //delay(300)
    Thread.sleep(300)

    println("end")

    // coroutines return to the task while it does other tasks , in thread.sleep it just stops completely and then continues to work

    // tea

    println("start")

    //delay(300)
    Thread.sleep(100)

    println("end")

    //latte

    println("start")

    //delay(300)
    Thread.sleep(200)

    println("end")

}