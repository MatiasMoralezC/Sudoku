package juego.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import juego.logica.Matriz;
import juego.logica.MatrizACompletar;
import juego.logica.MatrizRandom;

public class juegoAritmeticoTest {
	Matriz matrizRandom;
	Matriz matrizACompletar;
	Matriz exeptMtrz;
	int tamanio;
	
	@Before
	public void inicializar() {
		tamanio = 3;
		matrizRandom = new MatrizRandom(tamanio);
		matrizACompletar = new MatrizACompletar(tamanio);
	}
	
	@Test
	public void creacionTamanioFilasCorrecto() {
		assertTrue(matrizRandom.getMatriz().size() == tamanio);
	}

	@Test
	public void creacionTamanioFilasIncorrecto() {
		assertFalse(matrizRandom.getMatriz().size() != tamanio);
	}
	
	@Test
	public void creacionTamanioColumnCorrecto() {
		assertTrue(matrizRandom.getMatriz().get(0).size() == tamanio);
	}

	@Test
	public void creacionTamanioColumnIncorrecto() {
		assertFalse(matrizRandom.getMatriz().get(0).size() != tamanio);
	}
	
	@Test(expected = Exception.class)
	public void creacionTamanioExcepcionRandom() {
		exeptMtrz = new MatrizRandom(-1);
	}
	
	@Test(expected = Exception.class)
	public void creacionTamanioExcepcionACompletar() {
		exeptMtrz = new MatrizACompletar(-1);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
