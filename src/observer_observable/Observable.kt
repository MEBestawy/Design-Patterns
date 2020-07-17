package observer_observable

/**
 * Observable classes are classes monitored by other observers. Typically the model in MVC.
 */
open class Observable {
    // List of observers observing this observable
    private var observers = arrayListOf<Observer>()

    /**
     * Attaches a new observer to this observable
     */
    fun attach(observer:Observer) { observers.add(observer) }

    /**
     * Detaches given observer from this observable
     */
    fun detach(observer:Observer) { observers.remove(observer) }

    /**
     * Updates all observers of this observable. Should be called at the end of any method of an observable class that
     * results in a mutation of an object's attributes.
     */
    fun notifyObservers() {
        observers.forEach { observer ->
            observer.update(this)
        }
    }
}