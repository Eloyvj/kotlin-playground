class Pessoa(
    val nome: String,
    val idade: Int
)

fun main() {
    val pessoa1 = Pessoa("Eloy", 15)
    val pessoa2 = Pessoa("Vitorio", 21)

    println("Pessoa 1: ${pessoa1.nome}")
    println("Pessoa 2: ${pessoa2.nome}")

}