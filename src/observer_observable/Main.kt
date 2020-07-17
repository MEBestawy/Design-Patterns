package observer_observable

/**
 * Here is we get to use the observers and observables.
 */
fun main() {
    // Initializing the observer and observable
    var modelObservable = CounterModel(5)
    val observer = ModelObserver()

    // Attach observer to observable
    modelObservable.attach(observer)

    // Incrementing the model, observers should update (We will know from print statements)
    modelObservable.add(3) // Should print "Observer updated 8"
    modelObservable.add(8) // Should print "Observer updated 16"

    // Detaching the observer from the observable
    modelObservable.detach(observer)
}
