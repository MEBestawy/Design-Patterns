package visitor

/**
 * The visitor design pattern is useful when you need to perform an operation
 * using objects of certain classes without having to actually modify the
 * code of those objects. Having these classes be visitables enables you to
 * create visitor classes that perform the operations that you wish to
 * execute while not affecting the visitable classes themselves.
 *
 * Here our visitables are locations (a city and a forest) and our visitable
 * will visit each object and print some information when doing so.
 */
fun main() {
    // initializing our map and adding 2 cities and a forest to it
    var map = Map()
    map.add(City())
    map.add(Forest())
    map.add(City())

    // visiting all of our added places
    map.accept(PrintingPlaceVisitor())
}
