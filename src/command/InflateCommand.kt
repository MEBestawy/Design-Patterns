package command

/**
 * command to inflate a given balloon
 */
class InflateCommand(private var balloon: Balloon, private var air: Int) : Command {
    override fun excute() {
        this.balloon.inflate(air)
    }
}