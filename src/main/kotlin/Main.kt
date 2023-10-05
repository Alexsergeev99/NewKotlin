fun main() {
    val amount = readln().toInt()
    val comis = if((amount*0.75/100) > 35) amount*0.75/100 else 35
    println(comis)

}