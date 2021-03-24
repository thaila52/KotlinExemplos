
Desafio
Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.

Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.



Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".

 
Exemplos de Entrada	Exemplos de Saída
3002.00

R$ 80.36

1701.12

Isento

4520.00

R$ 355.60


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
