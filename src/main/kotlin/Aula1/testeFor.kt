fun main() {
    loop@ for (i in 1..100) {
        println("[i $i]")
        println("[")
        for (j in 1..5){
            println("j $j")
        }
        println("]\n")
        if (i == 10) break@loop
    }
}