package command

/**
 * The interface for our commands to implement. Every command can be excuted.
 */
interface Command {
    /**
     * The function to excute the command we are implementing
     */
    fun excute()
}