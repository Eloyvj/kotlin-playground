fun main() {
    println(max(5, 10))
}

// Corpo de bloco
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// Corpo de expressão
fun max1(a: Int, b: Int) = if (a > b) a else b