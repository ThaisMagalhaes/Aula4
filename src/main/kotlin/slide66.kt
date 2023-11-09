//Copie e execute o exercício, adicionando um comentário sobre ele

//class Calculadora{
//
//    fun soma(v1:Int, v2:Int) = v1 + v2
//    fun subtracao(v1:Int, v2:Int) = v1 - v2
//    fun multilicacao(v1:Int, v2:Int) = v1 * v2
//   // fun divisao(v1:Int, v2:Int) = v1 / v2
//    fun divisao(v1:Int, v2:Int) = v1 / v2.toFloat()
//    fun divisao(v1:Float, v2:Float) = v1 / v2
//
//}
//Aprendemos neste slide sobre a sobrecarga dde método.
//A sobrecarga de método ocorre quando criamos um novo método com o mesmo nome de um método já existente, mas com assinatura diferente.


// crie um exemplo diferente com os mesmos recursos estudados no slide
class Calculadora1{

    fun soma(v1:Int, v2:Int) = v1 + v2
    fun subtracao(v1:Int, v2:Int) = v1 - v2
    fun multilicacao(v1:Int, v2:Int) = v1 * v2
    fun divisao(v1:Int, v2:Int) = v1 / v2
    fun divisao(v1:Float, v2:Int) = v1 / v2.toFloat()
    fun multilicacao(v1:Float, v2:Float) = v1 * v2

}

//Adicione um comentário com uma explicação resumida do seu código.
// no exemplo acima temos varias funções com o objetivo de retorna diferentes calculos.
// também fizemos a utilização da sobrecarca no medoto de multiplicação e divisão.