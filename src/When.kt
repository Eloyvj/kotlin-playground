// When como corpo de expessão
fun obterMnemonica(cor: Cor)  =
        when(cor) {
            Cor.VERMELHO -> "Ver"
            Cor.AMARELO -> "Alguém"
            Cor.VERDE -> "Viver"
            Cor.AZUL -> "Além é"
            Cor.LARANJA -> "Legal"
        }

// When como corpo de bloco e múltiplos valores
fun obterTemperatura(cor: Cor): String {
    return when(cor) {
        Cor.VERMELHO, Cor.LARANJA, Cor.AMARELO -> "Quente"
        Cor.VERDE -> "Neutro"
        Cor.AZUL -> "Frio"
    }
}

fun main() {
    val mnemonica = obterMnemonica(Cor.VERMELHO)
    println(mnemonica)

    val temperatura = obterTemperatura(Cor.AMARELO)
    println(temperatura)
}