package UT01;

public class Ejemplo2_unidad1 {

	public static void main(String[] args) {
		// Enteros
		 int edad = 25;
		 long poblacion = 47000000L;
		 // Decimales
		 float precio = 9.99f;
		 double pi = 3.1415926535;
		 // Carácter
		 char inicial = 'A';
		 // Booleano
		 boolean aprobado = true;
		 System.out.println("Edad: " + edad);
		 System.out.println("Población: " + poblacion);
		 System.out.println("Precio: " + precio);
		 System.out.println("PI: " + pi);
		 System.out.println("Inicial: " + inicial);
		 System.out.println("¿Aprobado? " + aprobado);
		 
		 int contador = 10;
		 contador = contador -3;
		 System.out.println("Contador=" + contador);
		 
			
		/*int numero = 10;
		  numero = "Hola";
		 da error porque la variable es numérica y se esta escribiendo como una cadena*/
		 
		float precioSinIva = 100.0f;
		float iva = 0.21f;
		float precioConIva = precioSinIva * (1+ iva);
		
		System.out.println("Precio sin iva:" + precioSinIva);
		System.out.println("Iva:"+ iva);
		System.out.println("Precio con iva:"+ precioConIva);
		 
		 
		 
		
		 
		
	}

}
