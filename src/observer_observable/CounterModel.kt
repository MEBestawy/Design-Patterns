package observer_observable

/**
 * Instances of this class are responsible for storing a counter. They are also responsible for incrementing that
 * counter by a specified amount in the add method.
 */
class CounterModel(private var count:Int=0): Observable() {
    /**
     * Increment the counter.
     */
    fun add(n:Int) {
        count += n
        // Since the attributes are mutated, we need to notify observers.
        notifyObservers()
    }

    /**
     * @return the string representation of this object.
     */
    override fun toString():String = "$count"

}