package main;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un numero, se lo mostrare en orden descendente ");
		Scanner entrada= new Scanner(System.in);
		
		int numero= entrada.nextInt();
		
		for( int i=numero; i>=1; i--) {
		    
			System.out.println(i);

		}
		
		
		
	}

}
