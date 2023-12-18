package main;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese una numero del 0 a 100");
		Scanner entrada= new Scanner(System.in);
		
		int numero= entrada.nextInt();
		
		for(int i=1; i<=numero; i++) {
			
			System.out.print(i + " ");
		}

	}

}
