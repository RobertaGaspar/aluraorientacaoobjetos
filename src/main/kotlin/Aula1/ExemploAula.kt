package Aula1/*fun exemploAula() {
    //Cópia
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numeroX $numeroX")
    println("numeroY $numeroY \n")

    //Referência
    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"
    println(contaMaria.titular)
    println(contaJoao.titular)
    println("\n")

    for (i in 5 downTo 1) {
        if (i == 4) {
            break
        }

        val titular = "Alex $i"
        val numeroConta = 1000
        var saldo = 0.0
//    saldo = 100 + 2.0
//    saldo += 200

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")

        when {
            saldo > 0.0 -> println("conta é positiva")
            saldo == 0.0 -> println("conta é neutra ")
            else -> println("conta é negativa")
        }
    }
}*/