package juego.logica;

import java.util.ArrayList;
import java.util.List;

public class MatrizRandom extends Matriz {
	private Observador observador;

	public MatrizRandom(int tamanio) {
		super(tamanio);
	}
	
	@Override
	public List<Integer> crearFila(int tamanio) {
		int randomNum;
		int randomNumRange = 10;
		List<Integer> fila = new ArrayList<Integer>();
		
		for(int i = 0; i< tamanio; i++) {
			randomNum = (int) (Math.random()* randomNumRange);
			fila.add( randomNum );
			
		}
		
		return fila;
	}

	public void setObservador(Observador obs) {
		this.observador = obs;
		
	}


}
