package strategy

/**
 * Spender objects represent a person who is spending money. The spender
 * therefore has a strategy to spend money.
 */
class Spender(private var strategy : SpendingStrategy = ExtravagantStrategy()) {

    /**
     * set our spending strategy to $strat
     */
    fun setStrategy(strat:SpendingStrategy) {
        this.strategy = strat
    }

    /**
     * spend according to our spending strategy
     */
    fun spend() = this.strategy.spend()
}