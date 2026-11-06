import kotlinx.coroutines.*

suspend fun loadData(): String {

    println("Loading data...")

    delay(1000)

    println("Data loaded")

    return Thread.currentThread().name
}

fun main() {

    runBlocking {

        println("Thread before call: ${Thread.currentThread().name}")

        val result = loadData()

        println("Thread returned: $result")
    }
}

//   Continuation