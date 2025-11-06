package UT03;
import java.util.Scanner;
public class Ejercicio2_unidad3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero del 1-7");
		int numero = sc.nextInt();
		
		switch (numero) {
		
		case 1 :
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
			default:
				System.out.println("No válido");
			
		}
		sc.close();
	
		
		
	}

}
