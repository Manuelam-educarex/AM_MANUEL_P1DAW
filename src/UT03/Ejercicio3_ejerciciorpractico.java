package UT03;
public class Ejercicio3_ejerciciorpractico{
	

public static double cuadrado(double numero) {
    // Si el número es negativo, termina el método mostrando un mensaje de error
    if (numero < 0) {
        System.out.println("Error: el número no puede ser negativo.");
        return -1; // puedes usar un valor especial o lanzar una excepción si prefieres
    }
    
    // Si el número es válido, devuelve su cuadrado
    return numero * numero;
}

public static void main(String[] args) {
    System.out.println(cuadrado(5));   // Salida: 25.0
    System.out.println(cuadrado(-3));
}
}

