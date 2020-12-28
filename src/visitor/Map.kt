package visitor

/**
 * Our map objects will store the different visitable places
 * we are keeping track of. Objects of this class are also
 * responsible for letting all tracked visitable places accept
 * a visitor.
 */
class Map {
    // we store our visitable places in an array
    private var places = arrayListOf<Visitable>()

    /**
     * keep track of a new visitable place
     */
    fun add(place: Visitable) {
        places.add(place)
    }

    /**
     * have all visitables accept the visitor
     */
    fun accept(visitor:Visitor) {
        places.forEach { place ->
            place.accept(visitor)
        }
    }
}