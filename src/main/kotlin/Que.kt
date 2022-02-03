class Que<E> constructor() {
    private var front: QueNode<E>? = null
    private var rear: QueNode<E>? = null


    constructor(e: E) : this() {
        val node = QueNode(e)
        front = node
        rear = node
    }

    fun print() {
        var currentFront = front
        while (currentFront != null) {
            println(currentFront.data.toString())
            currentFront = currentFront.next
        }
    }

    // Time complexity o(1)
    // space complexity O(1)
    fun enQue(data: E) {
        //
        val newNode = QueNode(data)
        if (isEmpty()) {
            front = newNode
            rear = newNode
            return
        }
        rear!!.next = newNode
        rear = newNode
    }

    // Time complexity o(1)
    // space complexity O(1)
    fun deQue(): E? {
        var element: E? = null
        element = front?.data
        front = front?.next

        if (front == null) rear = null

        return element
    }

    fun isEmpty(): Boolean {
        return front == null && rear == null
    }

}

private data class QueNode<E>(var data: E, var next: QueNode<E>? = null)

