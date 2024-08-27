package Element

class SubLevel(
    val priority: Int,
    val name: String,
    private val maxElectrons: Int,
    var quantity: Int = 0,
) {

    val isFull: Boolean
        get() = quantity == maxElectrons

    var parent: Level? = null

    fun complete(electrons: Int): Int {
        val remainingElectrons = when {
            isFull -> electrons
            electrons > maxElectrons -> {
                quantity = maxElectrons
                electrons - maxElectrons
            }
            else -> {
                quantity += electrons
                0
            }
        }
        return remainingElectrons
    }

    override fun toString(): String {
        return buildString {
            append(parent?.value)
            append(name)
        }
    }
}