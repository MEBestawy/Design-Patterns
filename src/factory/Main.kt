package factory

/**
 * Here we will use our factory to make a pizza
 * and noodles then outputting them
 */
fun main() {
    // making our factory and using it to make food
    val factory = FoodFactory()
    val pizza = factory.make("pizza")
    val noodle = factory.make("noodles")

    // outputting our pizza and noodles
    println("$pizza\n$noodle")
}
