import kotlinx.coroutines.*

//fun main() = runBlocking{
//
//
//
//
//}

suspend fun loadUser(){
    println("Loading user ...")

    delay(1000)

    println("User Loaded")

    checkPassword()
}
suspend fun checkPassword(){
    println("Checking password ...")

    delay(1000)

    println("Password checked")

    openProfile()
}
suspend fun openProfile(){
    println("Checking profile ...")

    delay(1000)

    println("Profile opened")


}

suspend fun main(){
    println("Login process started")

    loadUser()

    println("Login process finished")
}