package singleton

/**
 * Prints nums of 2 SingletonCounter objects. Both nums will always equal, because both counters reference the same
 * object.
 */
fun printCounters(counter1: SingletonCounter, counter2: SingletonCounter) =
        println("Counter1 num: ${counter1.num} , Counter2 num: ${counter2.num} \n")

/**
 * Using the singleton object.
 */
fun main() {
    // Attempting to declare 2 SingletonCounter objects (Will fail, both variables reference the same object)
    var counter1 = SingletonCounter
    counter1.num = 44
    var counter2 = SingletonCounter
    printCounters(counter1, counter2) // Both nums should be 44

    // Changing counter2 but keeping counter1
    counter2.num = 10000
    printCounters(counter1, counter2) // Both nums should be 10000

    // Ultimately proving they are the same object
    println(counter1 == counter2) // Should print true
}