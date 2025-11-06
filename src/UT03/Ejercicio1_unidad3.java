package UT03;

import java.util.Scanner;

public class Ejercicio1_unidad3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num = sc.nextInt();
		
		if(num >0) {
			System.out.println("Positivo");
		}else if(num <0) {
			System.out.println("Negativo");
		}else if(num ==0){
			System.out.println("Cero");
		}
	sc.close();
		
	}

}
