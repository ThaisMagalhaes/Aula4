//Copie e execute o exercício, adicionando um comentário sobre ele
//fun main(){
//
//    val p1 = Pessoa("maria",60f,1.70f)
//    val p2 = Pessoa("joaquim",60f,1.75f)
//    val p3 = Pessoa("marcos",60f,1.80f)
//
//    println("$p1.nome")
//    println("$p2.nome")
//    println("$p3.nome")
//}
//class Pessoa(val nome: String, val peso: Float, val altura: Float)
// neste slide aprendemos sobre classes e como elas são criadas e utilizadas
// crie um exemplo diferente com os mesmos recursos estudados no slide

fun main(){

    val p1 = Funcionario("maria",60f,1.70f)
    val p2 = Funcionario("joaquim",60f,1.75f)
    val p3 = Funcionario("marcos",60f,1.80f)

    println("$p1.nome")
    println("$p2.nome")
    println("$p3.nome")
}
class Funcionario(val nome: String, val peso: Float, val altura: Float)
//Adicione um comentário com uma explicação resumida do seu código.
//neste exemplo temos a funções  principal onde serão exibidos os dados e uma classe(objeto) que guarda os dados.