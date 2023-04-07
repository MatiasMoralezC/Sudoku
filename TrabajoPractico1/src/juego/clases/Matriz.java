package juego.clases;

import java.util.ArrayList;
import java.util.List;

public class Matriz {
	private List<List<Integer>> matriz = new ArrayList<List<Integer>>();
	//private List<Integer> sumaFilas;
	//private List<Integer> sumaColumnas;
	
	private int randomNum;
	private int randomNumRange = 10;
	
	
	public Matriz(int tamanio){
		creaMatriz(tamanio);
	}
	
	public Matriz(int tamanio, int randomRange){
		randomNumRange = randomRange;
		creaMatriz(tamanio);
	}
	
	public void creaMatriz(int tamanio) {
		
		if(tamanio <= 0) {
			throw new RuntimeException("no ingresaste un tamanio valido");
		}
		
		for(int i = 0; i< tamanio; i++) {
			this.matriz.add( crearFilRandom(tamanio) );
			
		}
	}
	
	public List<Integer> crearFilRandom(int tamanio) {
		List<Integer> fila = new ArrayList<Integer>();
		
		for(int i = 0; i< tamanio; i++) {
			this.randomNum = (int) (Math.random()* this.randomNumRange);
			fila.add( this.randomNum );
			
		}
		
		return fila;
	}
	
	public List<Integer> sumaColumns(){
		List<Integer> sumColumns = new ArrayList<Integer>();
		int acum;
		
		for(int col = 0; col < this.matriz.size(); col++) {
			acum = 0;
			for(int fila = 0; fila< ((ArrayList<?>) this.matriz.get(col)).size() ; fila++) {
				acum += (Integer) ((ArrayList<?>) this.matriz.get(fila)).get(col);
				
			}
			sumColumns.add(acum);
		}
		
		return null;
	}
	
	public int sumaFila(List<Integer> fila){
		Integer sumFila = 0;
		
		for(Integer num: fila) {
			sumFila += num;
		}
		
		return sumFila;
	}
	
	public List<Integer> sumaTodasLasFilas() {
		List<Integer> sumFilas = new ArrayList<Integer>();
		
		for(int fila=0; fila < this.matriz.size(); fila++) {
			sumFilas.add( sumaFila(this.matriz.get(fila)) );
		}
		
		return sumFilas;
	}

	public List<List<Integer>> getMatriz() {
		return matriz;
	}

	
}
