package UT03;

import java.util.Scanner;

public class Ejercicio4_tema3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("Introduce : \n pulsa 1 para seguir \n 2 para salir");
			opcion = sc.nextInt();	
		}while(opcion!=2);
		System.out.println("Saliendo del menú ... adiós!!");
		
		
	}

}
