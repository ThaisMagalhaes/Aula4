//Copie e execute o exercício, adicionando um comentário sobre ele
//fun main(){
//
//    val myText = "Hello" // string
//    println(myText)
//    println(myText[0])
//    println(myText[1])
//    println(myText.get(0))
//    println(myText.get(1))
//    println(myText.lowercase())
//    println(myText.uppercase())
//    println(myText.length)
//    println(myText.equals("hello"))
//    println(myText == "hello")
//    println(myText.startsWith("H"))
//    println(myText.endsWith("H"))
//    println(myText.substring(0,2))
//
//}
//Neste exemplo foi mostrado varias formas de se trabalhar com uma váriável do tipo string. O tipo string se comporta como se fosse um vetor de caracteres e permite armazenar frase e textos nela.

// crie um exemplo diferente com os mesmos recursos estudados no slide
fun main(){

    val myText = "Estudos" // string
    println(myText) // retorna o valor da variável.
    println(myText[0]) // retorna somente a primeira letra da palavra contida na variavel
    println(myText[1]) // retorna  somente a letra contida na segunda posição da váriavel
    println(myText.get(0)) // forma antiga de retornar primeira letra da palavra contida na variavel
    println(myText.get(1))// forma antiga de retornar  a letra contida na segunda posição da váriavel
    println(myText.lowercase())// tras a frase/palavra contida na variável toda em minusculo.
    println(myText.uppercase())// tras a frase/palavra contida na variável toda em maiusculo.
    println(myText.length)// retorna a quantida de caracteres contido na variavel
    println(myText.equals("estudos"))// verifica se a palavra é igual ao valor da variavel -- lembrando que ele é case sensitive ou seja se a palavra da variavel estiver em maiusculo e a palavra a ser verificada estiver em minusculo será retornado que elaas não são iguais
    println(myText == "estudos")// verifica se a palavra é igual ao valor da variavel -- lembrando que ele é case sensitive ou seja se a palavra da variavel estiver em maiusculo e a palavra a ser verificada estiver em minusculo será retornado que elaas não são iguais
    println(myText.startsWith("E"))// verifica se a palavra começa com a letra E
    println(myText.endsWith("U"))// verifica se a palavra termina com a letra
    println(myText.substring(0,2))// permite mostrar(imprimir) uma parte especifica de uma frase nela você especifica a posição inicial e a posição final.

}