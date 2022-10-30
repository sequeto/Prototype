package prototype;

import static org.junit.Assert.*;

import org.junit.Test;
public class AutomovelTest {

	@Test
	public void testClone() throws CloneNotSupportedException {
        Automovel automovel = new Automovel(0, "Carro Original", "Ford", "HCG7800");

        Automovel automovelClone = automovel.clone();
        automovelClone.setPlaca("HCJ8560");
        automovelClone.setNome("Carro Clonado");

        assertEquals("Automovel {placa=HCG7800, nome='Carro Original', marca=Ford, kilometragem='0'}", automovel.toString());
        assertEquals("Automovel {placa=HCJ8560, nome='Carro Clonado', marca=Ford, kilometragem='0'}", automovelClone.toString());
    }

}
