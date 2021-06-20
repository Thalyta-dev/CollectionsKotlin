

fun main() {

    val pedidos: List<Pedido> = listOf(

        Pedido(1, 20.0),
        Pedido(2, 30.0),
        Pedido(3, 40.0),
        Pedido(4, 50.0),
        Pedido(5, 60.0),
    )

    val pedidosMapeados = pedidos.associateBy { pedidos -> pedidos.numero }

    val pedidosMapeadosFreteGratis = pedidos.associateWith { pedidos -> pedidos.valor >50 }

    val pedidosMapeadosFreteGratisAgrupados = pedidos.groupBy { pedido -> pedido.valor > 50 }

    println(pedidosMapeadosFreteGratis)
    println(pedidosMapeadosFreteGratisAgrupados)

}

data class Pedido(val numero: Int, val valor: Double)