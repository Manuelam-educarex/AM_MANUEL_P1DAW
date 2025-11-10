package UT03;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura del triángulo: ");
        int altura = sc.nextInt();

        // Bucle externo: controla las filas
        for (int i = 1; i <= altura; i++) {
            // Bucle interno: imprime los asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Salto de línea
        }
	}

}
