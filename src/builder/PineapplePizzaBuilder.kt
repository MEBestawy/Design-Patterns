package builder

/**
 * A pineapple pizza builder.
 */
class PineapplePizzaBuilder : PizzaBuilder() {
    init {
        this.sauce().cheese().pepperoni().pineapple()
    }
}