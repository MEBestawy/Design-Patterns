package builder

/**
 * Objects of this class are a digital representation of a pizza. Our pizza has multiple ingredients such as
 * $cheese$, $pepperoni$, $sauce$, and $pineapple$.
 */
class Pizza( builder: PizzaBuilder) {
    private val cheese = builder.cheese
    private val pepperoni = builder.pepperoni
    private val sauce = builder.sauce
    private val pineapple = builder.pineapple

    override fun toString(): String {
        var result = "Pizza with: ["
        if (this.sauce) result += " sauce"
        if (this.cheese) result += " cheese"
        if (this.pepperoni) result += " pepperoni"
        if (this.pineapple) result += " pineapple"
        result += " ]"
        return result
    }
}