package juego.logica;

import java.util.ArrayList;
import java.util.List;

public class MatrizRandom extends Matriz {
	private int randomNum;
	private int randomNumRange = 10;
	private Observador observador;

	public MatrizRandom(int tamanio) {
		super(tamanio);
	}
	
	@Override
	public List<Integer> crearFila(int tamanio) {
		List<Integer> fila = new ArrayList<Integer>();
		
		for(int i = 0; i< tamanio; i++) {
			this.randomNum = (int) (Math.random()* this.randomNumRange);
			fila.add( this.randomNum );
			
		}
		
		return fila;
	}

	public void setObservador(Observador obs) {
		this.observador = obs;
		
	}


}
