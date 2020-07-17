package observer_observable

/**
 * Interface to be implemented by all observer classes. In MVC, the Views should typically be the observers observing
 * the model.
 */
interface Observer {
    /**
     * Update observer on changes that occurred to observable
     */
    fun update(o:Observable)
}