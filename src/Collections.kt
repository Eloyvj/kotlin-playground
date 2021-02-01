fun main() {
/*################################################################*/
/*                       COMO CRIAR COLEÇÕES                      */
/*################################################################*/
// ArrayList - Classes
    val frutas1 = ArrayList<String>()
    frutas1.add("Maçã")
    frutas1.add("Banana")
    frutas1.add("Morango")

// ArrayList - Função
    val frutas2 = arrayListOf("Maçã", "Banana", "Morango")
    println(frutas2)

/*################################################################*/
/*                       BIBLIOTECA PADRÃO JAVA                   */
/*################################################################*/

// Vamos confirmar que de fato as coleções são da biblioteca
// Java padrão
    println(HashSet::class.java)

// Podemos tirar muito mais proveito das coleções em Kotlin
    println(frutas2.last())

    val numeros = setOf(1, 14, 2)
    println(numeros.max())
}