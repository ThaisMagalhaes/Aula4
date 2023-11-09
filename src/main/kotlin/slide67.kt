//Copie e execute o exercício, adicionando um comentário sobre ele
//fun main (){
//    val a = "1"
//    println(a+1)
//    println(a.toInt()+1)
//    println(a.toFloat()+1)
//    println((a.toDouble()+1).toString())
//    println((a.toDouble()+1).toString()+1)
//
//}
//neste exemplo vemos várias formas de conversão de dados e suas respectivas impressões.
// crie um exemplo diferente com os mesmos recursos estudados no slide
fun main (){
    val b = "4"
    println(b+1) // sem conversão de dados, virou uma concatenação colocando um carater ao lado do outro
    println(b.toInt()+1)// com a converção para inteiro os numeros são somados.
    println(b.toFloat()+1)// com a conversão os numeros são somados
    println((b.toDouble()+1).toString())// os numeros são somados depois convertidos para string
    println((b.toDouble()+1).toString()+1)// os numeros são somados depois convertidos para string e concatenado com o numero 1
}

//Adicione um comentário com uma explicação resumida do seu código.
// no exemplo acima temos a declarção de uma variável do tipo char e a conversão deste tipo para mostrar como funcionária a impressão de dados conforme sua conversão