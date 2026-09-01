package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplosTestCase {
	private Multiplos multiplos;
	
	@BeforeEach
	public void setUp() throws Exception {
		multiplos = new Multiplos();
	}
	
	@Test
	public void testMultiplo() {
		int mayorMultiplo = multiplos.elMultiploMasAlto(3, 9);
		assertEquals(mayorMultiplo, 999);
	}
}
