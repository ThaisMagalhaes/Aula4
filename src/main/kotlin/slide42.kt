//aula 4 - slide 42
//fun main() {
//    var valores = arrayOf(10,20,30,50)
//
//    for(i in valores)
//        print("saldo: $i,")
//}
//fim slide 42

fun main() {
    var valorArray = arrayOf(1, 6, 15, 80) // Cria uma matriz (array) de inteiros chamada 'valorArray' com quatro elementos

    for (x in valorArray) // Inicia um loop 'for' que percorre cada elemento 'x' na matriz 'valorArray'
        print("saldo: $x,") // Imprime a string "saldo: " seguida pelo valor de 'x' e uma vírgula, repetindo isso para cada elemento na matriz
}
