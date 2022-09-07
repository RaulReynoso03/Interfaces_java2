package Cadena_De_Caracteres_Equals;

import java.util.Scanner;

public class Ejercicio_2 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		String usuario="",clave="";
		
		System.out.println("Ingresa tu nombre de usuario: ");
		usuario=teclado.nextLine();
		
		System.out.println("Ingresa tu contraseña:");
		clave=teclado.nextLine();
		
		if(usuario.equals("Raul") && clave.equals("197903")) {
			System.out.println("Inicio de secion correctamente");
		}else {
			System.out.println("Usuario o clave incorrecto");
		}

	}

}
