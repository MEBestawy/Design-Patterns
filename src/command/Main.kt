package command

/**
 * Here we test how our commands work by adding them to an executor
 * and executing them all.
 */
fun main() {
    var executor = Executor()
    var balloon = Balloon()

    // adding commands to our executor
    executor.add(InflateCommand(balloon, 10))
    executor.add(DeflateCommand(balloon, 4))

    // running the executor and outputing the state of the balloon after
    executor.excuteAll()
    println(balloon) // should have 6 air

    // doing it again
    executor.excuteAll()
    println(balloon) // should have 12 air
}