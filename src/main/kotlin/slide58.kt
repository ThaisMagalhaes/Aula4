//Copie e execute o exercício, adicionando um comentário sobre ele
//open class Pessoa(val nome: String, val peso:Float, val altura: Float)
//{
//
//    //fun imc = peso/(altura*altura)
//
//    val imc get() = peso /(altura * altura)
//
//}
//neste exemplo vemos como fazer a classe separada para poder fazer a utilização da mesma em varios outros arquivos.
// crie um exemplo diferente com os mesmos recursos estudados no slide

open class classePessoa(val nome: String, val peso:Float, val altura: Float)
{

    //fun imc = peso/(altura*altura)

    val imc get() = peso /(altura * altura)

}
//Adicione um comentário com uma explicação resumida do seu código.
// neste exemplo vemos como fazer uma classe separada do arquivo principal de execução, para que assim possamos fazer reutilização de código