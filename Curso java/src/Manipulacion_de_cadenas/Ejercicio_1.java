package Manipulacion_de_cadenas;

import java.util.Scanner;

public class Ejercicio_1 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		String cadena_o="", cadena_s="";
		int num_caracteres, desde=0,hasta=0;
		
		System.out.println("Ingresa una cadena de caracteres:");
		cadena_o=teclado.nextLine();
		
		num_caracteres=cadena_o.length();
		
		System.out.println("La cadena tiene "+num_caracteres+" caracteres");
		
		System.out.println("Desde que caracter deceas optener la nueva cadena");
		
		desde=teclado.nextInt();
		
		System.out.println("Hasta que caracter deceas optener la nueva cadena");
		hasta=teclado.nextInt();
		
		cadena_s=cadena_o.substring(desde,hasta);
		
		System.out.println(cadena_s);
	}

}
