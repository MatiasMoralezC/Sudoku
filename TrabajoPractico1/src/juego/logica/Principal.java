package juego.logica;

import juego.vista.TableroDeTres;

public class Principal {
	
	public static void main(String[] args) {
		new Principal().iniciar();
	}

	private void iniciar() {
		/**
		 * Intancio las clases
		 */
		
		TableroDeTres tabDeTres = new TableroDeTres();
		MatrizRandom matrizRandDeTres = new MatrizRandom(3);
		MatrizACompletar matrizACDeTres = new MatrizACompletar(3);
		Observador observador = new Observador();
	}
}
