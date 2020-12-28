package visitor

/**
 * Classes implementing this interface can visit visitable classes.
 */
interface Visitor {
    /**
     * visit a forest object
     */
    fun visit(forest : Forest)

    /**
     * visit a city object
     */
    fun visit(city : City)
}