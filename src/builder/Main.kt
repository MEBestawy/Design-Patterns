package builder

/**
 * Here is we get to use our builders.
 */
fun main() {
    // we initialize our builders
    var regularBuilder = PizzaBuilder()
    var pineappleBuilder = PineapplePizzaBuilder()

    // we then use our builders to make our pizzas
    // we chain the methods we need and use build() to build the pizza
    var cheesePizza = regularBuilder.sauce().cheese().build()
    var pineapplePizza = pineappleBuilder.build()

    // showing the pizzas
    println("Cheese pizza is: $cheesePizza")
    println("Pineapple pizza is: $pineapplePizza")
}