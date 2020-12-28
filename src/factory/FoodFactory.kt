package factory

/**
 * Our food factory. Here is where we make our noodles
 * and pizzas.
 */
class FoodFactory() {

    /**
     * Our make method is responsible for making the food.
     * We update this method accordingly whenever we want to
     * make another type of food. (Salad for example)
     *
     * @return Food specified by choice, null if no match
     */
    fun make(choice:String): Food? {
        return when(choice.toLowerCase()) {
                "pizza" -> Pizza()
                "noodles" -> Noodles()
                else -> null
        }
    }
}
