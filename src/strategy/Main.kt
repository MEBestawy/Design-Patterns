package strategy

/**
 * The strategy design pattern is used whenever you have
 * different ways to handle a certain task. For example, if
 * we are given a chess board, how do we make our next spend?
 *
 * Certain strategies may be more ideal depending on the
 * context of the situation. We can also use this design
 * pattern to implement various robot-players if we are
 * designing a game.
 *
 * Here we demonstrate 2 different spending strategies.
 */
fun main() {
    // we initialize person with default strategy
    var person = Spender()
    println(person.spend()) // extravagant strategy message
    person.setStrategy(FrugalStrategy()) // changes strategy
    println(person.spend()) // frugal strategy
}
