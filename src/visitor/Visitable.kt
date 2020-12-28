package visitor

/**
 * Classes that implement this interface are visitable. This
 * means that those classes can accept a visitor class.
 */
interface Visitable {
    /**
     * This method allows our visitable class to accept a
     * visitor.
     */
    fun accept(visitor:Visitor)
}