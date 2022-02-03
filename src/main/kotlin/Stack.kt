class Stack<E> constructor() {
    private var top: Node<E>? = null


    constructor(e: E) : this() {
        val node = Node(e)
        top = node
    }

    fun print() {
        var currentFront = top
        while (currentFront != null) {
            println(currentFront.data.toString())
            currentFront = currentFront.link
        }
    }

    // Time complexity o(1)
    // space complexity O(1)
    fun push(data: E) {
        val node = Node(data)
        if (top == null) {
            top = node
            return
        }
        node.link = top
        top = node
    }

    // Time complexity o(1)
    // space complexity O(1)
    fun pop(): E? {
        val element = top?.data
        top = top?.link
        return element
    }

    fun isEmpty(): Boolean {
        return top == null
    }

}

private data class Node<E>(var data: E, var link: Node<E>? = null)

