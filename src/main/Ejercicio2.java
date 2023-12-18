package main;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingrese un numero cualquiera y le calculare la suma de todos los pares ");
		Scanner entrada= new Scanner(System.in);
		
		int numero=entrada.nextInt();
		int sumaPares=0;
		
		for(int i= 0; i<= numero; i+=2) {
			if(numero%2==0) {
				sumaPares= i + numero;
				
				
			}
			
			
		}
		System.out.println("la suma de los pares de " + numero + "es " + sumaPares);
	}

}
