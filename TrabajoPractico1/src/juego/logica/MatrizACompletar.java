package juego.clases;

import java.util.ArrayList;
import java.util.List;

public class MatrizACompletar extends Matriz {
	// faltaCompletar indicara no esta completa la matriz
	int faltaCompletar = -1;

	public MatrizACompletar(int tamanio) {
		super(tamanio);
	}

	@Override
	public List<Integer> crearFila(int tamanio) {
		List<Integer> fila = new ArrayList<Integer>();
		for(int i=0; i<tamanio; i++) {
			fila.add( faltaCompletar );
		}
		return fila;
	}

}
