package command

/**
 * command to deflate a given balloon
 */
class DeflateCommand(private var balloon: Balloon, private var air: Int) : Command {
    override fun excute() {
        this.balloon.deflate(air)
    }
}