package main;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero, entero y positivo");
		Scanner entrada= new Scanner(System.in);
		
		int numero= entrada.nextInt();
		int factorial=1;
		
		for(int i=1; i<=numero; i++) {
			factorial *=i;
			
			
		}
		
		System.out.println("El factorial de " + numero + " es " + factorial);
	}

}
