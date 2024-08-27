import Element.Element
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class ElementTest {

    private val testElementTitanium: Element = Element.getInstance(22) // Titânio

    @Test
    fun getElectronicConfiguration() {
        val expected = "1s2 2s2 2p6 3s2 3p6 4s2 3d2";
        val el = testElementTitanium.electronicConfiguration
        assertEquals(expected, el)
    }

    @Test
    fun getValenciaLayer() {
        val expectedValenciaLayer = 4;
        assertEquals(expectedValenciaLayer, testElementTitanium.valenciaLayer?.value);
    }

    @Test
    fun getMostEnergeticOrbital() {
        val expectedOrbital = "3d";
        assertEquals(expectedOrbital, testElementTitanium.mostEnergeticOrbital.toString())
    }

    @Test
    fun getName() {
        val expectedName = "Titânio";
        assertEquals(expectedName, testElementTitanium.name)
    }

    @Test
    fun getElectronsOnValenciaLayer() {
        val expectedAmount = 2;
        assertEquals(expectedAmount, testElementTitanium.getElectronsOnValenciaLayer())
    }

    @Test
    fun getElectronsOnMostEnergeticOrbital() {
        val expectedQuantity = 2;
        assertEquals(expectedQuantity, testElementTitanium.mostEnergeticOrbital?.quantity)
    }
}