import kotlinx.coroutines.*

fun main() = runBlocking{
    println("Order accepted")

    delay(1000)

    println("Coffee ready!")
}