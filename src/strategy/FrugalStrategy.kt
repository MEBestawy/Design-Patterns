package strategy

/**
 * This is the frugal spending strategy. Players
 * moving according to this strategy try to
 * save as much money as possible.
*/
class FrugalStrategy:SpendingStrategy {
    override fun spend() = "Save your money!"
}