package iterator
import kotlin.collections.Iterator

/**
 * We use the iterator to extract the next value and
 * determine whether there is a next value. To help us
 * implement this functionality, we are going to use
 * Kotlin's built in iterator interface.
 */
class EvensIterator : Iterator<Int> {
    // our next number
    private var num = 0

    /**
     * @return whether there is a next value or not. Since
     * there is always a next even number, this function
     * always returns true
     */
    override fun hasNext() = true

    /**
     * @return the next value in our stream
     */
    override fun next(): Int {
        val cur = this.num
        this.num += 2
        return cur
    }
}