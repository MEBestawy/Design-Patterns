package visitor

/**
 * Objects of this class are visitors that are responsible for outputting
 * the type of visitable they are visiting as well as the number of visits
 * this visitor has made to a visitable of that type.
 */
class PrintingPlaceVisitor : Visitor {
    // visit counts for each visitable
    private var forestVisits = 0
    private var cityVisits = 0

    override fun visit(forest:Forest) = println("Forest ${++forestVisits}")
    override fun visit(city:City) = println("City ${++cityVisits}")
}