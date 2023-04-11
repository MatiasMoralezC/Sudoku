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
	
	public Matriz getMatrizRandom() {
		return this.matrizRandom;
	}
	
//	public boolean actualizarMatrizACompletar(List<List<Integer>> matriz) {
//		return matrizACompletar.actualizarMatriz(matriz);
//	}
	
	public boolean sonMatricesIguales(Matriz matriz) {
		return matrizRandom.sonIguales(matriz.getMatriz());
	}

	/*
	 * public void pegarMatrizEnVista(TableroDeTres tDeTres, MatrizACompletar
	 * mACompletar) { tDeTres.pegarMatrizEnVista(mACompletar);
	 * //tDeTres.pegarMatrizEnVista(getMatrizACompletar()); }
	 */
	
	public void pegarMatrizEnVista(TableroDeTres tDeTres, MatrizRandom matrizRandom) {
		tDeTres.pegarMatrizEnVista(matrizRandom);
	}
	
	public void mostrarTablero() {
		this.tabDeTres.setVisible(true);
	}

	public void setTablero(TableroDeTres tDeTres) {
		this.tabDeTres = tDeTres;
		mostrarTablero();
		pegarMatrizEnVista(this.tabDeTres, this.matrizRandom);
	}

	public void setMatrizRandom(MatrizRandom matrizRandDeTres) {
		this.matrizRandom = matrizRandDeTres;
		
	}

	public void setMatrizACompletar(MatrizACompletar matrizACDeTres) {
		this.matrizACompletar = matrizACDeTres;
		
	}
	
}