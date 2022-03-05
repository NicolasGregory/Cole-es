class Cinema (
    private val nome: String,
    private val horarioAbertura: Byte,
    private val horarioFechamento: Byte
){
    private var assentos = mutableListOf<Sessao>()
    private var filmes = mutableListOf<Filme>()

    fun adicionarNovoFilme(filme:Filme): Boolean = filmes.add(filme)

    fun listarTodosFilmes() = filmes

    fun cadastrarAssento(assento:Sessao): Boolean= assentos.add(assento)

    fun listarAssentos() = assentos
}
