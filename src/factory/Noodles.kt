package factory

/**
 * Objects of this class are noodles and inherit from food
 */
class Noodles(override var calories: Int = 140) : Food() {
    override fun toString(): String {
        return super.toString()+ "Noodles with $calories calories"
    }
}
