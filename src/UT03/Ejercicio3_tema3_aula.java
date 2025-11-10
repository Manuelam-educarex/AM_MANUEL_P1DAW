package UT03;

import java.util.Scanner;

public class Ejercicio3_tema3_aula {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String contraseña = "hola";
		String palabra;
		
		int intentos =0;
		boolean acierto=false;
		
		while((!acierto) &&(intentos<4)){
			System.out.println("Introduce una contraseña");
			palabra = sc.nextLine();
			
			
			if (palabra.equalsIgnoreCase(contraseña)) {
				
				acierto=true;
				System.out.println("Contraseña correcta");
			}else {
				System.out.println("Has fallado! Intentalo otra vez: ");
				intentos++;
			}
		}
	
		
	}

}
