package UT01;

import java.util.Scanner;

public class Ejemplo3_unidad1 {

	public static void main(String[] args) {
		
		
		final double SALARIO_MINIMO = 1080.0;
		
		System.out.println(SALARIO_MINIMO);
		
		int hexadecimal = 0x1A;
		double notCientifica = 1.2e3;
		char unicode = '\u00F1';
		String name ="Manu";
		
		System.out.println(hexadecimal);
		System.out.println(notCientifica);
		System.out.println(unicode);
		System.out.println(name);


		
		
		final double PI = 3.1416;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio");
		double radio = sc.nextDouble();
		 double area = PI * radio * radio;
		 System.out.println("El area es:  "+ area);
		
		
		
		
		
	}

}
