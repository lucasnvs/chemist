package Element

class Element private constructor(
    val atomicNumber: Int,
    private val levels: List<Level> = HelperObject.levels,
    var electronicConfiguration: String = "",
    var mostEnergeticOrbital: SubLevel? = null,
    var name: String = HelperObject.elementsMap[atomicNumber] ?: "Desconhecido"
) {

    val valenciaLayer: Level? get() {
            return levels
                .filter { level -> level.subLevels.any { it.quantity > 0 } }
                .maxByOrNull { it.value }
    }

    companion object {
        private val elementCache = mutableMapOf<Int, Element>()

        fun getInstance(atomicNumber: Int): Element {
            return elementCache.getOrPut(atomicNumber) {
                Element(atomicNumber)
            }
        }
    }

    init { distribute() }

    private fun getPriorityList(): List<SubLevel> = levels.flatMap { it.subLevels }.sortedBy { it.priority }

    private fun distribute() {
        val priorityList = getPriorityList();
        var rest = atomicNumber;
        for (subLevel in priorityList) {
            rest = subLevel.complete(rest)
            electronicConfiguration += "${subLevel.parent!!.value}${subLevel.name}${subLevel.quantity}"

            if(rest == 0) {
                mostEnergeticOrbital = subLevel
                break;
            }
            electronicConfiguration += " "
        }
    }

    fun getElectronsOnValenciaLayer(): Int = valenciaLayer?.subLevels?.sumOf { it.quantity } ?: 0

    override fun toString(): String {
        return buildString {
            appendLine("Elemento de número atômico: $atomicNumber")
            appendLine("Nome do Elemento: ${this@Element.name ?: "Nome desconhecido"}")
            appendLine("Distribuição Eletrônica: ${this@Element.electronicConfiguration}")
            appendLine("Camada de Valência: ${this@Element.valenciaLayer?.value ?: "Não definida"}")
            appendLine("Elétrons na camada de Valência: ${this@Element.getElectronsOnValenciaLayer()}")
            appendLine("Orbital mais energético: ${this@Element.mostEnergeticOrbital ?: "Desconhecido"}")
            appendLine("Número de elétrons no Orbital mais energético: ${this@Element.mostEnergeticOrbital?.quantity ?: 0}")
        }
    }
}