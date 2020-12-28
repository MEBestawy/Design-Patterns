package builder

/**
 * This class is the builder of our pizzas. Whenever we
 * need to initialize a pizza object, we will be using
 * methods from our builder objects. Using our methods
 * in that way is called using a "Fluent Interface".
 */
open class PizzaBuilder {
    // Attributes of the pizzas we are building
    var cheese = false
    var pepperoni = false
    var sauce = false
    var pineapple = false

    /**
     * Add cheese to pizza
     */
    fun cheese(): PizzaBuilder {
        this.cheese = true
        return this
    }

    /**
     * Add pepperoni to pizza
     */
    fun pepperoni(): PizzaBuilder {
        this.pepperoni = true
        return this
    }

    /**
     * Add sauce to pizza
     */
    fun sauce(): PizzaBuilder {
        this.sauce = true
        return this
    }

    /**
     * Add pineapple to pizza
     */
    fun pineapple(): PizzaBuilder {
        this.pineapple = true
        return this
    }

    /**
     * Build the pizza.
     */
    fun build(): Pizza {
        return Pizza(this)
    }
}