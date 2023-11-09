//class Calculadora{
//
//    fun soma(v1:Int, v2:Int) = v1 + v2
//    fun subtracao(v1:Int, v2:Int) = v1 - v2
//    fun multilicacao(v1:Int, v2:Int) = v1 * v2
//    fun divisao(v1:Int, v2:Int) = v1 / v2
//
//}

// mostra a criação de uma classe e a reutilização dela em outra parte do sistema

class CalculadoraFull{

    fun somaSubtracao(v1:Int, v2:Int) = v1 + v2 - v2
    fun subtracaoMultiplicacao(v1:Int, v2:Int) = v1 - v2 * v1
    fun multilicacao(v1:Int, v2:Int) = v1 * v2
    fun divisao(v1:Int, v2:Int) = v1 / v2

}