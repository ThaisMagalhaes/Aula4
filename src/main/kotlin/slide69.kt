//Copie e execute o exercício, adicionando um comentário sobre ele
//fun main (){
//
//    var r: Any = "s"
//    var t = 0f
//
//    do {
//
//        println("Digite um número inteiro ou 's' para sair: ")
//        try{
//
//            r = readLine()!!
//            if(r == "s")
//                break
//            t += r.toInt()
//
//        }
//        catch(e: NumberFormatException){
//
//            println("Número inválido, tente novamente!")
//        }
//        catch(e: Exception){
//
//            println("!!!Houve uma execeção!!!")
//        }
//        finally {
//            println("    Total parcial: $t")
//        }
//
//    }    while(r != "s")
//}
// No exemplo deste slide aprendemos como utilizar o tratamento de exceções que podem ocorrer no código
//O try-catch é uma parte fundamental da programação, pois permite que os desenvolvedores identifiquem e controlem erros de maneira eficaz, evitando que o programa quebre inesperadamente


// crie um exemplo diferente com os mesmos recursos estudados no slide
fun main (){

    var x: Any = "s"
    var t = 0f
    do {

        println("Digite um número inteiro ou 's' para sair: ")
        try{

            x = readLine()!!
            if(x == "s")
                break
            t += x.toInt()

        }
        catch(e: NumberFormatException){

            println("Número inválido!")
        }
        catch(e: Exception){

            println("!!!Houve uma execeção!!!")
        }
        finally {
            println("    Total: $t")
        }

    }    while(x != "s")
}

//Adicione um comentário com uma explicação resumida do seu código.
// no exemplo acima mostramos duas variáveis  e um laço de repetição que é finalizado quando o usuário digita o caracter 's', caso seja digitado um carcter de forma que não seja um inteiro ou o caracter s o sistema retorna a exceção.