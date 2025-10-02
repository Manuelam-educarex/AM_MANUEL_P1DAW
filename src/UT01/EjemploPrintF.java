package UT01;

public class EjemploPrintF {

	public static void main(String[] args) {
		
		
		/*d: entero [byte, corto, int, largo]
		  f : número de punto flotante [flotante, doble]
		  c: carácter Capital C pondrá la letra en mayúscula
		  s : String Capital S pondrá en mayúsculas todas las letras de la cadena
		  h: código hash. Un código hash es como una dirección. Esto es útil para
		   imprimir una referencia.
		  n: nueva línea: use %n en lugar de \n para una mayor compatibilidad */
		
		// ejemplo de printf con números enteros y salto de linea
		
		System.out.printf("La mitad de %d es %d \n y suman %d. ",42 ,21 , 63);
		
		// ejemplo de printf con numeros double
		
		double precio = 5.75;
		System.out.printf("El precio es: %.5f", precio);
		
		
		
	}

}
