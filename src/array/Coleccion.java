package array;

public class Coleccion {
	static double[][] vector;
	
	public Coleccion (int fila, int columna){
		this.vector = new double[fila][columna];
	}
	//este constructor define el array para posteriormente darle valores que queramos
	
	public Coleccion(double[][] vector) {
		this.vector = vector;
	}
	
	public static void llenarColeccion(int numeroMultiplicador){
		
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j <vector[i].length; j++) {
				vector[i][j] = Math.random()*numeroMultiplicador;
				
			}
		}
	}
	
	
}
