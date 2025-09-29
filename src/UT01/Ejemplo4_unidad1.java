package UT01;

import java.util.Scanner;

public class Ejemplo4_unidad1 {

	public static void main(String[] args) {
		
		int y = 4;
		int x = 15;
		
		int suma = x + y;
		int resta = x-y;
		int multiplicacion = x * y;
		int division = x / y ;
		int resto = x % y ;
		
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multiplicacion);
		System.out.println(division);
		System.out.println(resto);
		
		
		Scanner sc = new Scanner(System.in);
		
		
	
		System.out.println("Indica dos numeros enteros");
	
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("El numero: " +num1 + " es mayor que: " + num2);
		
		}if(num1 < num2){
			System.out.println("El numero: "+ num1 + " es menor  que: "+ num2);
			
		}if(num1==num2) {
			System.out.println("El numero: "+ num1 + " es igual que: "+ num2);
		}
		
		
		
		int edad = 18;
		boolean permiso = true;
		System.out.println((edad >= 18) && permiso);
		
		
		int z = 5;
		
		System.out.println(z++);
		System.out.println(++z);

		
		
			
		
			
	
		
	
	
		
		
	}

}
