package observer_observable

/**
 * An observer of our Model class. It should print out the model it observers every time it is updated.
 */
class ModelObserver : Observer {
    override fun update(o: Observable) = println("Observer updated $o")
}