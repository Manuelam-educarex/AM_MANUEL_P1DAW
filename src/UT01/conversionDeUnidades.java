package UT01;
import java.util.Scanner;
public class conversionDeUnidades {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la temperatura en grados Celsius: ");
		double celsius = sc.nextDouble();
		
		
		double fahreinheit = (celsius*9/5)+32;
		
		System.out.printf("Equivalencia a %.1f grados fahreinheit.",fahreinheit  );
		
		
		
		
		sc.close();
		
		
		
		
		
		
	}

}
