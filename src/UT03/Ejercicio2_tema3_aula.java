package UT03;

import java.util.Scanner;

public class Ejercicio2_tema3_aula {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String palabra;
		System.out.println("Introduce una palabra");
		palabra = sc.nextLine();
		
		int contador =0;
		
		for(int i = 0; i< palabra.length(); i++) {
			if(palabra.charAt(i)=='a'|| palabra.charAt(i) == 'A') {
				contador++;
			
			}
		}
		
		System.out.println("La palabra " + palabra + " contiene "+ contador);
		
	}

}
