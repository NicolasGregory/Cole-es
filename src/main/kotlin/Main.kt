fun main() {
    val gnc = Cinema("GNC",12,23)
    println("Olá, seja bem-vindo ao GNC")

    if (
        gnc.adicionarNovoFilme(
            Filme(
                nomeFilme = "The Batman",
                genero = "Ação, Aventura, Drama",
                anoDeEstreia = 2022
            )
        )
    )

    if (
        gnc.adicionarNovoFilme(
            Filme(
                nomeFilme = "Sing 2",
                genero = "Animação, Infantil, Comédia",
                anoDeEstreia = 2022
            )
        )
    )

    println("Esses são os filmes disponíveis:")

    val filme = gnc.listarTodosFilmes()
    val numeroDeFilmes = filme.size - 1
    for (indice in 0..numeroDeFilmes){
        println("Nome:${filme[indice].nomeFilme}\nGeneros:${filme[indice].genero}\nLançou:${filme[indice].anoDeEstreia}")

        println("Qual filme voç~e deseja assitir:\n1 - The Batman\n2 - Sing 2")
        val escolha = readLine()!!.toInt()

        if (escolha == 1){
            gnc.cadastrarAssento(
                Sessao(
                    numeroAssento = 1,
                    ocupado = "Não"
                )
            )
        } else if (escolha == 2){
            gnc.cadastrarAssento(
                Sessao(
                    numeroAssento = 1,
                    ocupado = "Sim"
                )
            )
        } else {
            println("Esoclha invalida")
        }

        if (escolha == 1){
            gnc.cadastrarAssento(
                Sessao(
                    numeroAssento = 2,
                    ocupado = "Não"
                )
            )
        } else if (escolha == 2){
            gnc.cadastrarAssento(
                Sessao(
                    numeroAssento = 2,
                    ocupado = "Sim"
                )
            )
        }

        if (escolha == 1){
            gnc.cadastrarAssento(
                Sessao(
                    numeroAssento = 3,
                    ocupado = "Sim"
                )
            )
        } else if (escolha == 2){
            gnc.cadastrarAssento(
                Sessao(
                    numeroAssento = 3,
                    ocupado = "Não"
                )
            )
        }

        println("Assentos disponíveis:")
        val assento = gnc.listarAssentos()
        val numeroDeAssentos = assento.size - 1
        for (indice in 0..numeroDeAssentos) {
            println("\nAssento: ${assento[indice].numeroAssento}\nEstá ocupado: ${assento[indice].ocupado}")
        }

        println("Qual seu nome?")
        val nomeCompleto = readLine()!!.toString()

        println("\nQual assento vai querer ${nomeCompleto}?\nDigite 1 para o primeiro assento\nDigite 2 para o segundo assento\nDigite 3 para o terceiro assento ")
        val ocupado = readLine()!!.toInt()

        if(escolha == 1 && ocupado == 3){
            println("este assento já está ocupado")
        } else if (escolha == 2 && ocupado == 2 ||
            escolha == 2 && ocupado == 3){
            println("este assento já está ocupado")
        }

        val valoringresso = 32
        val meia = 2
        val taxa = 4.48

        println("\nVocê se encaixa em alguma dessas alternativas?\n1 - Estudante\n2 - Professor\n3 - Idoso\n4 - nenhuma")
        val valorTotal = when (readLine()!!.toInt()){
            1 -> println("O valor fica: ${(valoringresso / meia) + taxa}")
            2 -> println("O valor fica: ${(valoringresso / meia)+ taxa}")
            3 -> println("O valor fica: ${(valoringresso / meia)+ taxa}")
            else -> println("o valor fica: 36,48")
        }

        println("Sr/Sra ${nomeCompleto}, deseja terminar a compra de um ingresso no valor de: ${valorTotal}\n1 - Sim\n2 - não")
        val fim = readLine()!!.toInt()

        if (fim == 1){
            println("Tenha um bom filme")
        } else if(fim == 2){
            println("Até uma próxima então")
        }
    }
}

