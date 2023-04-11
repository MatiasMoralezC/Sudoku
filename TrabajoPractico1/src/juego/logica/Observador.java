package juego.logica;

import java.util.List;

import juego.vista.TableroDeCinco;
import juego.vista.TableroDeTres;

public class Observador {
	
	TableroDeTres tabDeTres;
	MatrizACompletar matrizACompletar;
	MatrizRandom matrizRandom;
	
	public Matriz getMatrizACompletar() {
		return matrizACompletar;
		
	}
	
	public boolean actualizarMatrizACompletar(List<List<Integer>> matriz) {
		return matrizACompletar.actualizarMatriz(matriz);
	}
	
	public boolean sonMatricesIguales() {
		return matrizRandom.sonIguales(matrizACompletar.getMatriz());
	}

	public void pegarMatrizEnVista(TableroDeTres tDeTres, MatrizACompletar mACompletar) {
		tDeTres.pegarMatrizEnVista(mACompletar);
	}
	
	public void mostrarTablero() {
		this.tabDeTres.setVisible(true);
	}

	public void setTablero(TableroDeTres tDeTres) {
		this.tabDeTres = tDeTres;
		mostrarTablero();
		pegarMatrizEnVista(this.tabDeTres, this.matrizACompletar);
	}

	public void setMatrizRandom(MatrizRandom matrizRandDeTres) {
		this.matrizRandom = matrizRandDeTres;
		
	}

	public void setMatrizACompletar(MatrizACompletar matrizACDeTres) {
		this.matrizACompletar = matrizACDeTres;
		
	}


	
}