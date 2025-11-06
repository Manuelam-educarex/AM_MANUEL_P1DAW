package UT03;

import java.util.Scanner;

public class Ejercicio3_unidad3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nota del 0-10");
		int nota = sc.nextInt();
		
		if(nota <5) {
			System.out.println("Suspenso");
		}else if (nota == 5 ||  nota == 6) {
			System.out.println("Aprobado");
		}else if(nota == 7 || nota == 8) {
			System.out.println("Notable");
		}else if(nota ==9 || nota == 10) {
			System.out.println("Sobresaliente");
		}
		
		sc.close();
		
	}

}
