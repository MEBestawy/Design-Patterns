package iterator

/**
 * The iterator design pattern is used whenever we need
 * to iterate over a custom data structure. In this example
 * we also see how we can implement a stream with kotlin.
 *
 * In this example our stream outputs the next even number.
 */
fun main() {
    // initializing our stream and its iterator
    val ourEvensStream = EvensStream()
    val iterator = ourEvensStream.iterator()

    // looping through the next 200 even numbers
    var i = 0
    val range = 200 // change this number to different ranges of even numbers
    while (i++ < range && iterator.hasNext())
        println(iterator.next())
}