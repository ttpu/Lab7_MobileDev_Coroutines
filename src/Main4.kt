//import kotlinx.coroutines.*
//
//suspend fun loadUser() {
//    println("User loading")
//    delay(2000)
//    println("User loaded!")
//}
//
//
//
//
//suspend fun main(){
//    loadUser()
//}

//I would never use runBlocking for normal operations on the Android UI thread because it
// blocks the thread responsible for drawing the interface and handling user interactions.
// This can freeze the application and cause an ANR error.

// this willnot work becouse main is normal function not suspend funciton