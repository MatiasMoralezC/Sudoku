package juego.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import juego.logica.Matriz;
import juego.logica.MatrizACompletar;
import juego.logica.MatrizRandom;

import java.util.ArrayList;
import java.util.List;

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

	@Test
	public void crearFilaTamanioRandomCorrecto() {
		assertTrue(matrizRandom.crearFila(tamanio).size() == tamanio);
	}
	
	@Test
	public void crearFilaTamanioACompletarCorrecto() {
		assertTrue(matrizACompletar.crearFila(tamanio).size() == tamanio);
	}

	@Test
	public void sumarTodasLasColumnasCorrectamente() {
		int acum = 0;
		for(int i=0; i<tamanio; i++) {
			acum -= 1;
		}
		
		assertEquals(acum, (int) matrizACompletar.getSumasColumnas().get(0));
	}
	
	
	// -- sonIguales
	
	@Test
	public void sonIgualesCorrecto() {
		Matriz mtrzUno = new MatrizACompletar(3);
		Matriz mtrzDos = new MatrizACompletar(3);
		
		assertTrue( mtrzUno.sonIguales(mtrzDos.getMatriz()) );
	}
	
	@Test
	public void sonIgualesDistintas() {
		Matriz mtrzUno = new MatrizRandom(3);
		Matriz mtrzDos = new MatrizRandom(3);
		
		assertFalse( mtrzUno.sonIguales(mtrzDos.getMatriz()) );
	}
	
	@Test(expected = Exception.class)
	public void sonIgualesUnoDistinto() {
		// la matriz uno es más grande que la 2
		Matriz mtrzUno = new MatrizACompletar(4);
		Matriz mtrzDos = new MatrizACompletar(3);
		
		mtrzUno.sonIguales(mtrzDos.getMatriz());
	}
	
	@Test(expected = Exception.class)
	public void sonIgualesDosDistinto() {
		// la matriz uno es más grande que la 2
		Matriz mtrzUno = new MatrizACompletar(3);
		Matriz mtrzDos = new MatrizACompletar(4);
		
		mtrzUno.sonIguales(mtrzDos.getMatriz());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
