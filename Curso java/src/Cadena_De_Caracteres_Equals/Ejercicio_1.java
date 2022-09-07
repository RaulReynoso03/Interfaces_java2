package Cadena_De_Caracteres_Equals;

import java.util.Scanner;

public class Ejercicio_1 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		String nombre1= "";
		String nombre2= "";
		
		System.out.println("Ingresa el primero nombre: ");
		nombre1=teclado.nextLine();
		System.out.println("Ingresa el segundo nombre: ");
		nombre2=teclado.nextLine();
		
		if(nombre1.equalsIgnoreCase(nombre2)) {
			System.out.println("El nombre es igual ");
		}else{
			System.out.println("El nombre es diferente ");
		}
		
		

	}

}
