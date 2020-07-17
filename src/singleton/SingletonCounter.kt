package singleton

/**
 * A singleton object responsible for storing an integer.
 *
 * In kotlin this is very easy, all you have to do is declare it as an object and not a class. Kotlin also automatically
 * takes care of any concurrency issues that would otherwise have to be handled explicitly. The module
 * JavaSingletonCounter.java implements the same object but in java.
 */
object SingletonCounter {
    var num = 0
}