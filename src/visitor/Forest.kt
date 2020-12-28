package visitor

/**
 * Forest objects are visitable
 */
class Forest:Visitable {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}