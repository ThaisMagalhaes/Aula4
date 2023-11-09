//Copie e execute o exercício, adicionando um comentário sobre ele
//fun main(){
//
//    val p1 = Pessoa("maria",60f,1.70f)
//    val p2 = Colaborador(2000f,"joaquim",60f,1.75f)
//    val p3 = Cliente(1500f,"marcos",60f,1.80f)
//
//    println("${p1.nome} tem IMC = ${p1.imc()}")
//    println("${p2.nome} tem IMC = ${p2.imc()} e ${if(p2.ativo) "esta ativo" else "foi despedido"}")
//    println("${p3.nome} tem IMC = ${p3.imc()} e renda = ${p3.renda}")
//}
//
//open class Pessoa(val nome: String, val peso: Float, val altura: Float){
//
//    fun imc() = peso/(altura * altura)
//}
// class Cliente (var renda: Float, nome: String, peso: Float, altura: Float): Pessoa( nome, peso,altura){
//
//     fun aprovacao() = renda> 1000
//
// }
//
//class Colaborador (var salario: Float, nome: String, peso: Float, altura: Float): Pessoa( nome, peso,altura){
//
//    val ativo = true
//    fun bonus() = salario > 0
//
//}
// neste slide aprendemos sobre o conceito de Herença. Herança é um princípio de orientação a objetos, que permite que classes compartilhem atributos
// e métodos, através de "heranças". Ela é usada na intenção de reaproveitar código ou comportamento generalizado ou especializar operações ou atributos.
// crie um exemplo diferente com os mesmos recursos estudados no slide

fun main(){

    val p1 = Pessoa("maria",60f,1.70f)
    val p3 = Comprador(1500f,"marcos",60f,1.80f)

    println("${p1.nome} tem IMC = ${p1.imc()}")
    println("${p3.nome} tem IMC = ${p3.imc()} e renda = ${p3.renda}")
}

open class Pessoa(val nome: String, val peso: Float, val altura: Float){

    fun imc() = peso/(altura * altura)
}
class Comprador (var renda: Float, nome: String, peso: Float, altura: Float): Pessoa( nome, peso,altura){

    fun aprovacao() = renda> 1000

}

//Adicione um comentário com uma explicação resumida do seu código.
// no exemplo acima temos duas classes onde a classe Comprador herda atributos da classe pessoa