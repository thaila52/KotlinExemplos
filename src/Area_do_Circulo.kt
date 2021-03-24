import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow
/**
 * Gilber
 */
fun main(args: Array<String>) {
    //atribuir um valor a variavel raio: digitado pelo usuario convertido,
    //em decimal pelo toDouble()
    val raio = readLine()!!?.toDouble()
    // pi e atribuido o valor 3.14159
    val pi = 3.14159
    //operação area recebi o calculo de pi * (raio.pow(2)
    //pow(): Retorna o base elevada ao expoente no 2: ou Ex: r: 2 * 2 = 4 ou Ex: 2²=4
    val area = pi * (raio.pow(2))
    //resultado: recebi o valor de BigDecimal
    //BigDecimal(): Utilizado quando precisamos de valor exato nem mais nem menos
    val resultado = BigDecimal(area).setScale(4, RoundingMode.HALF_EVEN)
    //saida de dados para o usuario
    println("A=$resultado \n")
}
