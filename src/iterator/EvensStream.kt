package iterator

/**
 * This is our stream data-structure that contains an iterator.
 * We call this type of data-structure and "Iterable." So iterables
 * contain iterators.
 */
class EvensStream: Iterable<Int> {
    override fun iterator(): Iterator<Int> = EvensIterator()
}