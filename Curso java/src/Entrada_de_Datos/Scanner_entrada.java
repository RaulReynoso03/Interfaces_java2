package Entrada_de_Datos;

import java.util.Scanner;

public class Scanner_entrada {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner (System.in);
		
		String nombre=" ";
		int num_uno=0,num_dos=0,resultado=0;
		
		System.out.println("Cual es tu nombre:");
		nombre = teclado.nextLine();
		
		System.out.println("Dame el primer valor para tu suma:");
		num_uno=teclado.nextInt();
		System.out.println("Dame el segundo valor para tu suma:");
		num_dos=teclado.nextInt();
		
		resultado=num_uno+num_dos;
		
		System.out.println("\n");
		System.out.println("El resultado de la suma es:"+resultado);
		System.out.println(nombre);
		

	}

}
