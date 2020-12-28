package strategy

/**
 * The extravagant spending strategy pushes the spender
 * to spend more money
 */
class ExtravagantStrategy : SpendingStrategy {
    override fun spend() = "Spend more!"
}