fun Factorial(n:Int): Long{
    if (n == 1){
        return 1
    }
    else{
        return n * Factorial(n-1)
    }
}
fun main(){
    val num = 6
    val factorial = Factorial(num)
    println("${factorial}")
}