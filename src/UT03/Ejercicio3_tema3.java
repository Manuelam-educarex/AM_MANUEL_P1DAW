package UT03;

import java.util.Scanner;

public class Ejercicio3_tema3 {

	public static void main(String[] args) {
		int suma =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numeros (0 para salir)");
			int num =sc.nextInt();
			
			while(num !=0) {
				
				suma = suma+num;
				num = sc.nextInt();
			}
			
			
			System.out.println("La suma de los numeros es igual a: "+ suma);
		
		sc.close();
		
	}

}
