import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.assertThrows

internal class LinkListTest {

    @Test
    fun if_no_value_is_added_to_list_it_should_be_empty() {
        val list = LinkList<Int>()
        val listIsEmpty = list.isEmpty()
        assertEquals(true, listIsEmpty)
    }

    @Test
    fun when_new_value_is_added_list_size_should_be_incremented() {
        //given
        val list = LinkList<Int>()
        val expected = list.size + 1
        //when
        val actual = list.add(0)
        //then
        assertEquals(expected, actual)

    }
    @Test
    fun when_a_value_is_removed_list_size_should_be_decremented() {
        //given
        val list = LinkList<Int>()
        list.add(0)
        list.add(0)
        val expected = list.size -1
        //when
        list.removeAt(1)
        //then
        assertEquals(expected, list.size)

    }
}