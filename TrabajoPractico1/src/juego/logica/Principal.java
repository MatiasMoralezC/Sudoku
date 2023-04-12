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
		
		Observador observador = new Observador();
		TableroDeTres tabDeTres = new TableroDeTres(observador);
		
		observador.setTablero(tabDeTres);
		
		tabDeTres.setObservador(observador);

	}
}
