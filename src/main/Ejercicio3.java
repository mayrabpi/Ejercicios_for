package main;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un numero, le mostrare su tabla de multiplicar hasta el 10");
		Scanner entrada= new Scanner(System.in);
		
		int numero= entrada.nextInt();
		int multiplicar=0;
		
		for(int i=1; i<= numero; i++) {
			multiplicar= numero*i;
			System.out.println(numero + "x " + i + "= " + multiplicar);
		}

	}

}
