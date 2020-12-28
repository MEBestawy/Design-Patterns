package command

/**
 * Executors are responsible for executing the commands
 */
class Executor {
    // storing the commands in an array for our example
    private var commands = arrayListOf<Command>()

    /**
     * adding a command to our array
     */
    fun add(cmd: Command) {
        this.commands.add(cmd)
    }

    /**
     * execute all stored commands iteratively
     */
    fun excuteAll() {
        for (command in commands)
            command.excute()
    }
}
