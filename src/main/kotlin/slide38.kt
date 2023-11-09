//Copie e execute o exercício, adicionando um comentário sobre ele

//fun main(){
//    val nota = 4
//    var resultado = when {
//       nota >= 6 -> "Aprovado"
//        nota < 4 -> "Reprovado"
//        else -> "Recuperação"
//    }
//    println(resultado)
//}
// neste slide aprendemos como fazer a estrutura when que funciona igual ao switch/case, ou seja ele é uma estrura de condição para determinar um resultado de acordo com a premissa estipulada.

// crie um exemplo diferente com os mesmos recursos estudados no slide
fun main(){
    val nota = 10
    var resultado = when {
        nota >= 7 -> "Aprovado"
        nota < 3 -> "Reprovado"
        else -> "Recuperação"
    }
    println(resultado)
}
//Adicione um comentário com uma explicação resumida do seu código.
// neste exemplo temos duas variáveis uma contem a a nota de um aluno e a segunda recebe uma mensagem de acordo com a condição que foi estipulada.