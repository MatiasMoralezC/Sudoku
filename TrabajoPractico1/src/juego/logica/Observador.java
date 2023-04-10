package juego.logica;

import java.util.ArrayList;
import java.util.List;

import juego.vista.TableroDeCinco;
import juego.vista.TableroDeTres;

public class Observador {
	
	public Observador(TableroDeTres tDeTres, MatrizACompletar mACompletar) {
		pegarMatrizEnVista(tDeTres,mACompletar);
	}
	
	public List<List<Integer>> getMatrizACompletar() {
		Matriz mat = new MatrizACompletar(3);
		return mat.getMatriz();
		
	}

	public void pegarMatrizEnVista(TableroDeTres tDeTres, MatrizACompletar mACompletar) {
		tDeTres.pegarMatrizEnVista(mACompletar);
	}
	
}