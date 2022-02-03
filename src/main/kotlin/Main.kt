fun main(args: Array<String>) {
    val stack = Stack(1)
    stack.push(2)
    stack.push(3)
    stack.pop()
    stack.pop()
    stack.pop()
    stack.print()
    println()
    println(stack.isEmpty())
}