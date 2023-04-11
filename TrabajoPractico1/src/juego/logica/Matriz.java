package juego.logica;

import java.util.ArrayList;
import java.util.List;

public abstract class Matriz {
	private List<List<Integer>> matriz = new ArrayList<List<Integer>>();
	private List<Integer> sumasFilas = new ArrayList<Integer>();
	private List<Integer> sumasColumnas = new ArrayList<Integer>();
	
	public Matriz(int tamanio){
		creaMatriz(tamanio);
		sumasFilas = sumaTodasLasFilas();
		sumasColumnas = sumaTodasLasColumnas();
	}
	
	public abstract List<Integer> crearFila(int tamanio);
	
	public void creaMatriz(int tamanio) {
		if(tamanio <= 0) {
			throw new RuntimeException("no ingresaste un tamanio valido");
		}
		
		for(int i = 0; i< tamanio; i++) {
			this.matriz.add( crearFila(tamanio) );
			
		}
	}
	
	public List<Integer> sumaTodasLasColumnas(){
		List<Integer> sumColumns = new ArrayList<Integer>();
		
		for(int col = 0; col < this.matriz.size(); col++) {
			sumColumns.add( sumaColumna(col) );
		}
		
		return sumColumns;
	}
	
	public int sumaColumna(int col) {
		// supongo que la matriz es de nxn
		if((col > this.matriz.get(0).size()) || (col<0) ) {
			throw new RuntimeException("la columna ingresada no es valida");
		}
		
		int acum = 0;
		for(int fila = 0; fila< ((ArrayList<?>) this.matriz.get(col)).size() ; fila++) {
			acum += (Integer) ((ArrayList<?>) this.matriz.get(fila)).get(col);
			
		}
		return acum;
	}
	
	public List<Integer> sumaTodasLasFilas() {
		List<Integer> sumFilas = new ArrayList<Integer>();
		
		for(int fila=0; fila < this.matriz.size(); fila++) {
			sumFilas.add( sumaFila(this.matriz.get(fila)) );
		}
		
		return sumFilas;
	}
	
	public int sumaFila(List<Integer> fila){
		if(fila == null) {
			throw new RuntimeException("la fila ingresada es nula");
		}
		
		Integer sumFila = 0;
		
		for(Integer num: fila) {
			sumFila += num;
		}
		
		return sumFila;
	}
	
	public boolean sonIguales(List<List<Integer>> otraMatriz) {
		if( otraMatriz == null || otraMatriz.contains(null) ) {
			throw new RuntimeException("no ingresaste una matriz valida");
		}
		if( otraMatriz.size() != matriz.size() ) {
			throw new RuntimeException("las matrices tienen un tamanio distinto");
		}
		
		for(int fila=0; fila<matriz.size(); fila++) {
			for(int col=0; col<matriz.get(fila).size(); col++) {
				if(matriz.get(fila).get(col) != otraMatriz.get(fila).get(col)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	
	public List<List<Integer>> getMatriz() {
		return matriz;
	}

	public List<Integer> getSumasFilas() {
		return sumasFilas;
	}

	public List<Integer> getSumasColumnas() {
		return sumasColumnas;
	}

	protected void setMatriz(List<List<Integer>> matriz) {
		this.matriz = matriz;
	}
	
	
	

}
