package array;

public class DeclararArrays {

	public static void main(String[] args) {
		//Declarar primer array (de enteros)
		//creamos la referencia
		int[] referenciaEnteros;
		//creamos el array
		referenciaEnteros = new int[3];
		//inicializamos los datos
		referenciaEnteros[0]=12;
		referenciaEnteros[1]=13;
		referenciaEnteros[2]=14;
		//referenciaEnteros[4]=12; esa posicion no existe
		//referenciamos el array
		for (int i = 0; i < referenciaEnteros.length; i++) {
			
			System.out.println("valores: "+i+": "+referenciaEnteros[i]);
		}
		
		//declaramos y creamos el array
		double[] referenciaDoubles = new double[3];
		//inicializamos los valores
		referenciaDoubles[0] = 12.1;
		referenciaDoubles[1] = 12.2;
		referenciaDoubles[2] = 12.3;
		//recoremos el array
		for (int i = 0; i < referenciaDoubles.length; i++) {
			System.out.printf("valor %d: %.2f%n",i,referenciaDoubles[i]);		
		}

		//declaramos, creamos e implantamos el array
		String[] referenciaCadenas = {"Hola"," ","mundo"};
		//recoremos el array
		for (int i = 0; i < referenciaCadenas.length; i++) {
			System.out.print(referenciaCadenas[i]);
		}
		System.out.println(); //salto de linea
		//creamose e inicializamos array boolean
		boolean[] referenciaBoolean = {true, false, true};
		//recorremos el array aqui abajo de forma clasica
		for (int i = 0; i < referenciaBoolean.length; i++) {
			System.out.printf("%b ", referenciaBoolean[i]);
		}
		System.out.println();
		//recorremos el array con un bucle extendido mejorado
		for(String cadena: referenciaCadenas){
			System.out.print(cadena);
		}
		System.out.println();
		//lo hace eclipse asi
		for (boolean b : referenciaBoolean) {
			System.out.printf("%b ",b);
		}
		
	}

}
