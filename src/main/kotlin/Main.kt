fun main(args: Array<String>) {
    val  que = Que<Int>()
    que.enQue(1)
    que.enQue(2)
    que.deQue()
    que.print()
    println()
    println(que.isEmpty())

}