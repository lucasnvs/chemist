package Element

class Level(
    val value: Int,
    val subLevels: List<SubLevel>
) {

    init {
        subLevels.forEach { it.parent = this }
    }

    fun complete(electrons: Int): Int {
        return subLevels.fold(electrons) { remainingElectrons, subLevel -> subLevel.complete(remainingElectrons) }
    }

    fun findLast(): SubLevel {
        return subLevels.firstOrNull { !it.isFull } ?: subLevels.last()
    }
}
