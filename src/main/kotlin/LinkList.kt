class LinkList<E> constructor() {
    private var head: Node<E>? = null
    var size: Int = 0


    constructor(e: E) : this() {
        val node = Node(e)
        head = node

    }

    fun print() {
        var currentFront = head
        while (currentFront != null) {
            println(currentFront.data.toString())
            currentFront = currentFront.next
        }
    }


    fun add(data: E): Int {
        return add(data, size)

    }


    fun add(data: E, position: Int): Int {
        if (position > size || position < 0) throw java.lang.IndexOutOfBoundsException("Index out of bound")
        val node = Node(data)
        var insertionPosition = position
        var nextNode = head
        var lastNode: Node<E>? = null

        if (position == 0) {
            node.next = nextNode
            head = node
            size++
            return size
        }

        while (insertionPosition >= 0) {
            if (insertionPosition == 0) {
                node.next = nextNode
                lastNode?.next = node
                size++
                break
            }
            insertionPosition--
            lastNode = nextNode
            nextNode = lastNode?.next
        }
        return size

    }

    // Time complexity o(n)
    // space complexity O(1)
    fun remove(data: E) {
        var currentNode = head
        var lastNode: Node<E>? = null
        while (currentNode != null) {
            if (currentNode.data == data) {
                lastNode?.next = currentNode.next
                size--
                break
            }
            lastNode = currentNode
            currentNode = lastNode.next
        }
    }

    fun removeAt(position: Int) {
        if (position < 0 || position > size - 1) throw java.lang.IndexOutOfBoundsException("Index out of bound")

        if (position == 0) {
            head = head?.next
            return
        }

        var currentNode = head
        var lastNode: Node<E>? = null
        var index = 0

        while (currentNode != null && index < size) {
            if (index == position) {
                lastNode?.next = currentNode.next
                size--
                break
            }
            lastNode = currentNode
            currentNode = lastNode.next
            index++
        }


    }

    fun isEmpty(): Boolean {
        return head == null && size == 0
    }

}

private data class Node<E>(var data: E, var next: Node<E>? = null)

