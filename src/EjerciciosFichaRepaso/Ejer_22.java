package EjerciciosFichaRepaso;

import java.util.Scanner;

public class Ejer_22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica las horas extras realizadas");
		double horasExtras = sc.nextDouble();
		double salario = 12.5;
	if (horasExtras <= 8) {
		System.out.println("hoy por las horas extras ganas " + (horasExtras *(salario*2))  );
	
	}else {
	System.out.printf("Cobras como extra : %.2f ", 8* salario * 2 + (horasExtras - 8) * salario *3);
	}
	
	
	
	
	
	}
	
	
	

}
