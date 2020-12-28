package factory

/**
 * Abstract class for food.
 */
abstract class Food {
    // calories of the food
    abstract var calories : Int

    override fun toString(): String {
        return "Food: "
    }
}