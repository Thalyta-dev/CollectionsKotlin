package curso2Collections


fun main() {

    val pedidos = mutableMapOf<Int, Double>(1 to 20.0, 2 to 10.0)
    println(pedidos)
    val pedido1 = pedidos[1]

    //Ultiliza a safe call, ou seja, verifico se  ele é nulo, depois uso o
    // let, o let me permite executar algum trecho de código com aqeule objeto meu.  let
    //Retorna qualquer valor a partir de um objeto do qual o escopo se originou e refere-se a esse objeto como it.
    pedido1?.let {
        println(it)
    }

    pedidos.forEach{
        maps : Map.Entry<Int, Double> -> print("Chave : ${maps.key} Valor : ${maps.value}")
    }

    pedidos[4] = 70.0 // ou
    pedidos.put(5,80.0)


}