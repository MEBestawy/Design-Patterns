package strategy

/**
 * This interface is implemented by our
 * spending strategies.
 */
interface SpendingStrategy {
    /**
     * This method dictates how we spend our money
     */
    fun spend(): String
}