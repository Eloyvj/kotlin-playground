fun main() {
    val nome =  "Eloy"

    println("Hello $nome!")

    //String template com expressão
    println("Soma é ${soma(10, 20)}")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}