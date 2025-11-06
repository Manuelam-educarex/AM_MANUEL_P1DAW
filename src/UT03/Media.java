package UT03;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" introduce el primer numero");
		
		int num1 = sc.nextInt();
		
		System.out.println(" introduce el segundo numero");
		int num2 = sc.nextInt();
		
		System.out.println("el mayor es: "+ Math.max(num1, num2));
	}

}
