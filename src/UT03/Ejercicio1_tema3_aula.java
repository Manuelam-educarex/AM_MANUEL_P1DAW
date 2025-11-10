package UT03;

import java.util.Scanner;

public class Ejercicio1_tema3_aula {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un número del (1-10)");
		num=sc.nextInt();
		
		for(int i = 1; i <=10;i++) {
			System.out.println(num+ " x " +i+"es igual a "+ num*i);
		}
	}

}
