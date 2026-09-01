package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DesarmadorTestCase {
	private Desarmador desarmador;
	
	@BeforeEach
	public void setUp() throws Exception {
		desarmador = new Desarmador();
	}
	
	@Test
	public void testParesDesarmador() {
		int[] arrayDePrueba = {1234, 4444, 1111};
		int nEsperado = desarmador.numeroConMasPares(arrayDePrueba);
		assertEquals(nEsperado, 4444);
	}
}
