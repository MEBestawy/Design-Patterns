package command

/**
 * This class represents a balloon
 */
class Balloon {
    // balloon contains air
    private var air = 0

    /**
     * inflate balloon
     */
    fun inflate(air: Int) {
        this.air += air
    }

    /**
     * deflate balloon
     */
    fun deflate(air:Int) {
        this.air = Math.max(this.air - air, 0)
    }

    override fun toString(): String {
        return "Balloon with $air air"
    }
}