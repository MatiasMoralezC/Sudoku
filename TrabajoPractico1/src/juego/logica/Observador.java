package juego.logica;

import java.util.List;
import juego.vista.TableroDeTres;

public class Observador {
	
	TableroDeTres tabDeTres;
	MatrizACompletar matrizACompletar = new MatrizACompletar(3);
	MatrizRandom matrizRandom = new MatrizRandom(3);
	
	public Matriz getMatrizACompletar() {
		return matrizACompletar;
		
	}
	
	public Matriz getMatrizRandom() {
		return this.matrizRandom;
	}
	
	public boolean sonMatricesIguales(List<List<Integer>> matriz) {
		return matrizRandom.sonIguales(matriz);
	}
	
	public void mostrarTablero() {
		this.tabDeTres.setVisible(true);
	}

	public void setTablero(TableroDeTres tDeTres) {
		this.tabDeTres = tDeTres;
		mostrarTablero();
	}

	public void setMatrizRandom(MatrizRandom matrizRandDeTres) {
		this.matrizRandom = matrizRandDeTres;
		
	}

	public void setMatrizACompletar(MatrizACompletar matrizACDeTres) {
		this.matrizACompletar = matrizACDeTres;
		
	}
	
}