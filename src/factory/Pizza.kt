package factory

/**
 * Objects of this class represent pizza
 */
class Pizza(override var calories: Int = 270) : Food() {
    override fun toString(): String {
        return super.toString()+ "Pizza with $calories calories"
    }
}