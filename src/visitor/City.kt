package visitor

/**
 * City objects are visitable
 */
class City : Visitable {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}