package juego.logica;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

public class MatrizACompletar extends Matriz {
	private Observador observador;

	public MatrizACompletar(int tamanio) {
		super(tamanio);
	}

	@Override
	public List<Integer> crearFila(int tamanio) {
		// faltaCompletar indicara no esta completa la matriz
		int faltaCompletar = -1;
		
		List<Integer> fila = new ArrayList<Integer>();
		for(int i=0; i<tamanio; i++) {
			fila.add( faltaCompletar );
		}
		return fila;
	}

	public int size() {
		return this.size();
	}

	public void setObservador(Observador obs) {
		this.observador = obs;
		
	}

}
