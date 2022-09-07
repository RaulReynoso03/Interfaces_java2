package Arreglos_Bidimencionales;

import java.util.Scanner;

public class Matrices_Dinamicas {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		int filas=0,columnas=0,contador=1;
		
		System.out.println("Cuantas filas deceas:");
		filas=teclado.nextInt();
		System.out.println("Cuantas columnas deceas:");
		columnas=teclado.nextInt();
		
		int numero[][]=new int[filas][columnas];
		
		for (int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
			numero[i][j]=contador;
			contador++;
			System.out.print("["+numero[i][j]+"]");
				
			}
			System.out.println("");
		}
		
		

	}

}
