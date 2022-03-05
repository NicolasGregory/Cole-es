data class Sessao(
    val numeroAssento: Byte,
    val ocupado: String,
)

data class Filme(
    val nomeFilme: String,
    val genero: String,
    val anoDeEstreia: Short,
)