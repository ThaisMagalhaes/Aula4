//Copie e execute o exercício, adicionando um comentário sobre ele
//fun main (){
//
//    var a: Any = '1'
//    var resultado = when (a){
//
//        is String -> "$a é um texto"
//        is Int -> "$a é um número inteiro"
//        else -> "Não sei"
//    }
//
//    println(resultado)
//    println(a::class.simpleName) // mostra o tipo da váriavel
//
//}
//neste slide aprendemos sobre Smart cast ou cast inteligente que é uma funcionalidade que faz a verificação do tipo de uma classe e seu determinado cast ao mesmo tempo. Isso significa que ao realizar uma
//verificação de tipo não é necessário fazer o cast depois, porque o compilador já entende e faz isso por você.
// crie um exemplo diferente com os mesmos recursos estudados no slide
fun main (){

    var t: Any = 6
    var resultado = when (t){

        is Char -> "$t é um char"
        is Int -> "$t é um número inteiro"
        else -> "Não sei"
    }

    println(resultado)
    println(t::class.simpleName) // mostra o tipo da váriavel

}

//Adicione um comentário com uma explicação resumida do seu código.

//neste exemplo temos duas variáveis onde a variável retorno tem uma 'confição' para informal qual tipo de dados a variavel t possui.
// após isso é printado na tela o resultado desta condição e logo a seguir printado o tipo de dados real da variável t utilizando uma função especifica da linguagem.