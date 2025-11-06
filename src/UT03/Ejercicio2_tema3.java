package UT03;

import java.util.Scanner;

public class Ejercicio2_tema3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
	int num =sc.nextInt();
		int factorial = 1;
		for(int i = 1; i <=num; i++) {
			factorial *=i;
			
		}
		System.out.println("El factorial de " + num + " es: "+ factorial);
		
		
		
		
	}

}
