



fun main(args: Array<String>) {
    //continue a solução
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 0F

    if (r >=0.00 && r<=2000 ) {
        i = 0F
    } else if (r >=2000 && r <= 3000) {
        i = (r-2000) * 0.08F
    } else if (r > 3000 && r < 4500) {
        i = 1000 * 0.08f + (r - 3000) * 0.18f
    } else if (r > 4500) {
        i = 1000 * 0.08f + 1500 * 0.18f + (r- 4500) * 0.28f
    }
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")


}
