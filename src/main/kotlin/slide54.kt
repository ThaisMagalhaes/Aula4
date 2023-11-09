//Copie e execute o exercício, adicionando um comentário sobre ele
//
//fun main(){
//
//    val p1 = Pessoa("maria",60f,1.70f)
//    val p2 = Pessoa("joaquim",60f,1.75f)
//    val p3 = Pessoa("marcos",60f,1.80f)
//
//    println(p1)
//    println(p2)
//    println(p3.toString())
//}
//
//class Pessoa(var nome: String, var peso: Float, var altura: Float){
//    override fun toString(): String {
//        return "$nome,$peso,$altura"
//    }
//}
// neste slide aprendemos como fazer a impressão dos dados de um objeto
// crie um exemplo diferente com os mesmos recursos estudados no slide
fun main(){

    val p1 = teste("Silvana",90f,1.70f)
    val p2 = Pessoa("Cristina",50f,1.55f)
    val p3 = teste("marcos",80f,1.10f)

    println(p1)
    println(p2)
    println(p3.toString())
}

class teste(var nome: String, var peso: Float, var altura: Float){
    override fun toString(): String {
        return "$nome,$peso,$altura"
    }
}
//Adicione um comentário com uma explicação resumida do seu código.
// neste exemplo mostramos uma forma de fazer a impressão de dados de um objeto existente.