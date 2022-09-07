package Arreglos_Bidimencionales;

import java.util.Scanner;

public class Vectores_dinamicos {

	private static Scanner teclas;

	public static void main(String[] args) {
		
		teclas = new Scanner (System.in);
		
		int longitud=0;
		
		System.out.println("Cuantos numeros deceas ingresar");
		longitud=teclas.nextInt();
		
		int numeros[]=new int[longitud];
		
		for (int i=0; i<numeros.length; i++) {
			System.out.println("Ingresa el valor : "+(i+1));
			numeros[i]=teclas.nextInt();
		}
		for (int i=0; i<numeros.length; i++) {
		System.out.print("["+numeros[i]+"]");
		}
	}

}
