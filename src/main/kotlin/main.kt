fun main() {

    println("Bem vindo ao ByteBank")
    val alex= Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1500.0
    )
    println("Funcionario:")
    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao}")
    println("\n")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println("Gerente:")
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")
    if(fran.autentica(1234)){
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }
    println("\n")

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )
    println("Diretor:")
    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")

    if(fran.autentica(4000)){
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }
    println("\n")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)

    println("total de bonificação: ${calculadora.total}")
    println("\n")

}
